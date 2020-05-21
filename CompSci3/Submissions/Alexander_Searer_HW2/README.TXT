Problem #1:
To print out the time, I created a class called Digit.
This class has a variable called display which was an array of strings.
I initialized the digits and their display variables by passing an integer (0-9) 
to it's constructor for a specific digit to be displayed or a 10 for a colon.
The constructor then initialized display according to the desired appearance of each digit.
This class also has a method called lineOut where I pass an integer (1-7) representing
one of the lines of output to be displayed.

I created a method called getTime which utilized the code provided to return an array of 
integers with the current hour and time which I stored in time.

I created array of digits named clock and loaded it with digits using the corresponding
value from time.  I had to correct for the fact that time didn't not have a colon in it
by inserting some logic to determine if we needed to initialize the colon digit, and then
after that to correct for the indicie mismatch that resulted.

From there, I simply iterated through each line of each digit in clock, printing 
the output of lineOut for each line of each digit.

Problem #2:
To create this calendar display program, I started with a hand full of helper methods:

firstDay - returns the day of the week the first day of the month falls on using Zeller's
Formula.  The formula returns 0 for Saturday, which I altered to be 7.
lastDay - returns the last calendar day in a month, controlling for leap years
monthName -  returns a string with the name of the month given its number

I controlled the program in main starting by asking for input from the user.
I used said input to initialize variables firstDay, lastDay, and monthName by passing the 
relevant info to the corresponding methods.

I then hardcoded the header for the calendar.

I created a variable weekDay to keep track of which day of the week I was on.

I used a for loop to provide the padding needed to put the first day on the correct day 
of the week by starting with weekDay as 1 and going until it was at firsDay (exclusive).

I then began a for loop to print out each day of the month until I was at lastDay (inclusive).

While doing so, I also incremented the weekDay and at the end of the loop, I would check if
I was at day 7 (Saturday).  If so, I printed a new line (for a new week) and reset the 
weekDay counter to 0.