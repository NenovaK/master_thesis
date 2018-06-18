document.getElementById('timer').innerHTML =
  01 + ":" + 00;
startTimer();

var url_string = window.location.href;
var url = new URL(url_string);
var client_id = url.searchParams.get("client_id");
console.log(client_id);
document.getElementById('client_id').value = client_id ;


function startTimer() {
  var presentTime = document.getElementById('timer').innerHTML;
  var timeArray = presentTime.split(/[:]+/);
  var m = timeArray[0];
  var s = checkSecond((timeArray[1] - 1));
  if(s==59){m=m-1}
  if(m<0){disableButton() //NOT WORKING !!!
}
  
  document.getElementById('timer').innerHTML =
    m + ":" + s;
  setTimeout(startTimer, 1000);
}

function checkSecond(sec) {
  if (sec < 10 && sec >= 0) {sec = "0" + sec}; // add zero in front of numbers < 10
  if (sec < 0) {sec = "59"};
  return sec;
}

$("#submit").click(function() {

});

$("#myForm").one('submit', function() {
  $(this).find('input[type="submit"]').attr('disabled','disabled');
   $.post( $("#myForm").attr("action"), 
         $("#myForm :input").serializeArray(),
         function(info){ $("#result").html(info);
  });
  return false;	
});

function disableButton(){
	(this).find('input[type="submit"]').attr('disabled','disabled')
}
