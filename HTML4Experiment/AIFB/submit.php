<?php
 		include 'db.php';
 
 		//variables !!!
 		#$url = $_SERVER['REMOTE_ADDR'];
 		#$url = $_SERVER['HTTP_X_FORWARDED_FOR'];
 		$client_id = $_POST['client_id'];
		$api = $_POST['api'];
		$desc = $_POST['desc'];
		$accessAPI = $_POST['accessAPI'];
		$version = $_POST['version'];
		$tos = $_POST['tos'];
		$contact = $_POST['contact'];
		$res = $_POST['res'];
		$meth = implode(',',$_POST['meth']);		
		$sec = $_POST['sec'];
		$req1 = $_POST['req1'];
		$req2 = $_POST['req2'];
		$req3 = $_POST['req3'];
		$req4 = $_POST['req4'];
		
		echo gettype($meth);
		echo "\n";
		echo $api, " ", $desc," ", $accessAPI," ", $version," ", $tos," ", $contact," ", $res," ", $meth," ", $sec," ", $req1," ", $req2," ", $req3," ", $req4;
 
		if(mysqli_query($conn, "INSERT INTO solutions VALUES('$client_id', '$api', '$desc', '$accessAPI', '$version', 
						'$tos', '$contact', '$res', '$meth', '$sec', '$req1', '$req2', '$req3', '$req4')")) //the values!!! 
						// TODO !!! Solution for UserID !!! 
		  echo "Successfully Inserted";
		else
		  echo "Insertion Failed";
		  
		  
function getRealIpAddr()
{
    if (!empty($_SERVER['HTTP_CLIENT_IP']))   //check ip from share internet
    {
      $ip=$_SERVER['HTTP_CLIENT_IP'];
    }
    elseif (!empty($_SERVER['HTTP_X_FORWARDED_FOR']))   //to check ip is pass from proxy
    {
      $ip=$_SERVER['HTTP_X_FORWARDED_FOR'];
    }
    else
    {
      $ip=$_SERVER['REMOTE_ADDR'];
    }
    return $ip;
}
?>
