<?php
 		include 'db.php';
 
 		//variables !!!
 		$client_id = $_POST['client_id'];
		$api = $_POST['api'];
		$desc = $_POST['desc'];
		$U6 = $_POST['U6'];
		$JF3 = $_POST['JF3'];
		$JF4 = $_POST['JF4'];
		$RA1 = $_POST['RA1'];
		$RA5 = $_POST['RA5'];
		$EOU3 = $_POST['EOU3'];
		$EOU5 = $_POST['EOU5'];
		$EOU6 = $_POST['EOU6'];		
		$PBC3 = $_POST['PBC3'];
		$C2 = $_POST['C2'];
		$BI1 = $_POST['BI1'];
		$BI2 = $_POST['BI2'];
		$BI3 = $_POST['BI3'];
		
		echo gettype($meth);
		echo "\n";
		echo $U6, " ", $JF3," ", $JF4," ", $RA1," ", $RA5," ", $EOU3," ", $EOU5," ", $EOU6," ", $PBC3," ", $C2," ", $BI1," ", $BI2," ", $BI3;
 
		if(mysqli_query($conn, "INSERT INTO feel VALUES('$client_id', '$api', '$desc', '$U6', '$JF3', '$JF4', '$RA1', 
						'$RA5', '$EOU3', '$EOU5', '$EOU6', '$PBC3', '$C2', '$BI1', '$BI2', '$BI3')")) //the values!!! 
						// TODO !!! Solution for UserID, DL and API !!! 
		  echo "Successfully Inserted";
		else
		  echo "Insertion Failed";
?>