CSC 240 HW # 1 - Sudoku Checker

Conceptually to solve this problem, you have to check all the rows, columns and sub-cubes 
of the 9X9 matrix that makes up a Sudoku solution.

I addressed each of these tasks seperately and then checked that a solution passed all of 
these tests to determine if the solution is valid as a whole.  I created 3 9x1 arrays (called "rowResult" "colResult" 
and (cubeResult") to track the individual results of 
each row, col, and cube.  This would allow for me to add functionality that gave detailed results as to which specific
elements failed/passed (row 3 failed, cube 2 failed, etc).

When checking any of these elements, I created a 9x1 array (called "...Temp")  of booleans initialized as false
to track if each number 1-9 was in the row, col, or cube I was checking.


When I iterated through the element I was checking, for each number I encounterd I would check its corresponding element 
in , I would check the corresponding index (number -1) in the temp array
to see if it was true.  If so, I had already encountered this number
and had just come accros a repeat value for this element.  I would return a false value that was stored in the elements result array.
If the check in the Temp array was false, I would set it to true to signify I had encountered this number.

From main, I called function allCheck that iteritavely called functions rowCheck, colCheck, and cubeCheck while storing the result in 
the appropriate index of the appropriate result array.  These subfunctions iterate through my sudokuGrid based on the relationship
of the row, cols, and cubes to how I initialized the sudoku Solution.

After all elements had been checked, I used a helper function called allTrue that I passed the Result arrays.
AllTrue would simply return a single true if the array I passed it contained only true values.
I used a compound AND statement to create a result boolean comparing outputs of allTrue for each 
result array that I then passed back to main which prints the string eqivalent of the boolean value.


I realize that I could have solved this solution with significantly few functions using multiple nested loops.
I felt that approach was a little messier and left fewer options for expanding the functionality of the class
should I want to use it in the future.