package DynamicProgramming.KnapSackProblem;





/**

 Problem:
 Given 3 numbers {1, 3, 5}, we need to tell
 the total number of ways we can form a number 'N'
 using the sum of the given three numbers. (allowing repetitions and different arrangements).


 Total number of ways to form 6 is: 8
 1+1+1+1+1+1
 1+1+1+3
 1+1+3+1
 1+3+1+1
 3+1+1+1
 3+3
 1+5
 5+1




 Part I - Solve the Program Manually

 1. Solve this manually by hand using brute force
 f(n=1) = null
 f(n=2) = 1
    1+1
 f(n=3) = 1
    1+1+1       - We can only add using 1,3,5
 f(n=4) = 3
    1+1+1+1
    1+3
    3+1
 f(n=5) = 4
    1+1+1+1+1
    1+1+3
    1+3+1
    3+1+1
 f(n=6) = 8
    1+1+1+1+1+1
    1+1+1+3
    1+1+3+1
    1+3+1+1
    3+1+1+1
    3+3
    1+5
    5+1

 2.



 */


// Part II - Solve the Problem Programatically
public class KnapSackProblem {




}
