var coffee = Math.round(Math.random(0, 10) * (10 - 0 + 1)) + 0;

var showSupply = function () {
	print("*Coffee supply at " + String(coffee) + ".*");
};

var goToStarbucks = function () {
	print("*Drives all the to Augusta to get frappe.*");
	print("*Returns from Augusta.*");

	coffee += 100;

	showSupply();
};

var codeOn = function () {
	print("*Coffee supply all good!*");
	print("*I can now finish my Javascript Nodes.*");

	showSupply();
};

if (coffee <= 5) {
	goToStarbucks();
} else {
	codeOn();
}