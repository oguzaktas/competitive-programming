/* https://practice.geeksforgeeks.org/contest-problem/mario-pauline/1/
Mario wants to meet Pauline . Mario is standing at source point (x1 , y1) and Pauline is standing at destination point (x2 , y2 ) .Determine if it is possible to reach the destination point (x2, y2) from source point (x1 , y1) .
Note: Mario has only two valid moves :
(x1 , y1 ) to ( x1 + y1 , y1 ) 
(x1 , y1)  to  ( x1 , y1 + x1)

Input:
First line of input consists of an integer T representing number of test cases. For each test case first line contains four space seperated intergers denoting coordiates of source and destination point.
Output:
For each test case print True if Mario can reach Pauline else print False.
Your Task:
Since it is a functional problem , you just have to complete the function isPossible() which accepts four integer values denoting coordinates of source and destination point and returns a boolean value.
Constraints:
1 <= T <= 100
1 <= x1 , y1 , x2 , y2 <= 20
Example:
Input:
2
3 2 5 7
1 2 3 4
Output:
True
False
*/

// { Driver Code Starts

//Initial Template for Java

import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

//Back-end complete function Template for Java

class Solve {
    static boolean isPossible(int sx, int sy, int dx, int dy) {

        // base case
        if (sx > dx || sy > dy)
            return false;

        // current point is equal to destination
        if (sx == dx && sy == dy)
            return true;

        // check for other 2 possibilities
        return (isPossible(sx + sy, sy, dx, dy) || isPossible(sx, sy + sx, dx, dy));
    }
}

// { Driver Code Starts.

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int sx = sc.nextInt();
            int sy = sc.nextInt();
            int dx = sc.nextInt();
            int dy = sc.nextInt();
            Solve ob = new Solve();
            if (ob.isPossible(sx, sy, dx, dy))
                System.out.print("True\n");
            else
                System.out.print("False\n");
            t--;
        }
    }
}

// } Driver Code Ends

/* Python 3 solution
def isPossible(sx, sy, dx, dy): 
  
    # base case 
    if (sx > dx or sy > dy): 
        return False
  
    # current point is equal to destination 
    if (sx == dx and sy == dy): 
        return True
  
    # check for other 2 possibilities 
    return (isPossible(sx + sy, sy, dx, dy) or
            isPossible(sx, sy + sx, dx, dy)) 
*/

/* C++ solution
bool isPossible(int sx, int sy, int dx, int dy) 
{ 
    // base case 
    if (sx > dx || sy > dy) 
        return false; 
  
    // current point is equal to destination 
    if (sx == dx && sy == dy) 
        return true; 
  
    // check for other 2 possibilities 
    return (isPossible(sx + sy, sy, dx, dy) ||  
            isPossible(sx, sy + sx, dx, dy)); 
} 
*/