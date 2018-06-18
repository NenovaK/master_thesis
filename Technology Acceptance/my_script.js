document.getElementById('timer').innerHTML =
  05 + ":" + 00;
startTimer();

var url_string = window.location.href;
var url = new URL(url_string);
var client_id = url.searchParams.get("client_id");
var api = url.searchParams.get("api");
var desc = url.searchParams.get("desc");
console.log(client_id);
document.getElementById('client_id').value = client_id ;
document.getElementById('api').value = api ;
document.getElementById('desc').value = desc ;


function startTimer() {
  var presentTime = document.getElementById('timer').innerHTML;
  var timeArray = presentTime.split(/[:]+/);
  var m = timeArray[0];
  var s = checkSecond((timeArray[1] - 1));
  if(s==59){m=m-1}
  if(m==0 && s==00){
  	document.getElementById('sub').click();
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
