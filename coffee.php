<?php
$coffee = rand(0, 10);

function showSupply() {
	echo "*Coffee supply at ";
	print(intval($coffee));
	echo ".*\n";
}

function goToStarbucks() {
	echo "*Drives all the to Augusta to get frappe.*\n";
	echo "*Returns from Augusta.*\n";

	$coffee += 10;

	showSupply();
}

function codeOn() {
	echo "*Coffee supply all good!*\n";
	echo "*I can now finish my Minecraft PHP port.*\n";

	showSupply();
}

if ($coffee <= 5) {
	goToStarbucks();
} else {
	codeOn();
}
?>