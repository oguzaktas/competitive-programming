#include<bits/stdc++.h>

using namespace std;
//Implement the class Box  
//l,b,h are integers representing the dimensions of the box

// The class should have the following functions : 

// Constructors: 
// Box();
// Box(int,int,int);
// Box(Box);


// int getLength(); // Return box's length
// int getBreadth (); // Return box's breadth
// int getHeight ();  //Return box's height
// long long CalculateVolume(); // Return the volume of the box

//Overload operator < as specified
//bool operator<(Box& b)

//Overload operator << as specified
//ostream& operator<<(ostream& out, Box& B)

class Box {
    private:
        int length, breadth, height;
    public:
        int getLength() {
            return length;
        }
        int getBreadth() {
            return breadth;
        }
        int getHeight() {
            return height;
        }
        long long CalculateVolume() {
            return 1LL * length * breadth * height;
        }
        Box() {
            length = 0;
            breadth = 0;
            height = 0;
        }
        Box(int l, int b, int h) {
            length = l;
            breadth = b;
            height = h;
        }
        Box(const Box& b) {
            length = b.length;
            breadth = b.breadth;
            height = b.height;
        }
        friend bool operator < (Box& a, Box& b) {
            if((a.length < b.length) || ((a.breadth < b.breadth) && (a.length == b.length)) || ((a.height < b.height) && (a.length == b.length) && (a.breadth == b.breadth))) {
            return true;
        } else {
            return false;
        }
    }
        friend ostream& operator << (ostream& output, const Box& b) {
            output << b.length << " " << b.breadth << " " << b.height;
            return output;
        }
};
