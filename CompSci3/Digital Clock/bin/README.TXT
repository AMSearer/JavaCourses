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