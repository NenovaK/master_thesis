<?php

	$servername = "aifb-ls3-vm1.aifb.kit.edu:3306";
	$username = "kalina";
	$password = "kalina";
	$dbname = "WebApiExperiment";

	// Create connection
	$conn = new mysqli($servername, $username, $password, $dbname);
	// Check connection
	if ($conn->connect_error) {
    	die("Connection failed: " . $conn->connect_error);
	}
	echo "Connected successfully";
?>

