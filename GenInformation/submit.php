<?php
 		include 'db.php';
 
 		//variables !!!
 		$client_id = $_POST['client_id'];
		$study = $_POST['study'];
		$bachmaster = $_POST['bachmaster'];
		$sem = $_POST['sem'];
		$devexp = $_POST['devexp'];
		$howexp = $_POST['howexp'];
		$REST = $_POST['REST'];
		$API = $_POST['API'];
		$OAS = $_POST['OAS'];		
		$RAML = $_POST['RAML'];
		$BP = $_POST['BP'];
		

		if(mysqli_query($conn, "INSERT INTO general VALUES('$client_id', '$study', '$bachmaster', '$sem', '$devexp', 
						'$howexp', '$REST', '$API', '$OAS', '$RAML', '$BP')")) //the values!!! 
		  echo "Successfully Inserted";
		else
		  echo "Insertion Failed";
?>