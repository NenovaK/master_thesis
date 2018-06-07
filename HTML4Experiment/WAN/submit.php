<?php
 		include 'db.php';
 
 		//variables !!!
		$api = $_POST['api'];
		$desc = $_POST['desc'];
		$accessAPI = $_POST['accessAPI'];
		$version = $_POST['version'];
		$tos = $_POST['tos'];
		$contact = $_POST['contact'];
		$res = $_POST['res'];
		$meth = $_POST['meth'];
		$sec = $_POST['sec'];
		$req1 = $_POST['req1'];
		$req2 = $_POST['req2'];
		$req3 = $_POST['req3'];
		$req4 = $_POST['req4'];
		
		echo $meth;
		echo "/n";
		echo $api, " ", $desc," ", $accessAPI," ", $version," ", $tos," ", $contact," ", $res," ", $meth," ", $sec," ", $req1," ", $req2," ", $req3," ", $req4;
 
		if(mysqli_query($conn, "INSERT INTO solutions VALUES(NULL, '$api', '$desc', '$accessAPI', '$version', 
						'$tos', '$contact', '$res', '$meth', '$sec', '$req1', '$req2', '$req3', '$req4')")) //the values!!! 
						// TODO !!! Solution for UserID !!! 
		  echo "Successfully Inserted";
		else
		  echo "Insertion Failed";
?>