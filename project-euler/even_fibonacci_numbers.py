def calc():
    x = y = 1
    sum = 0
    while (sum < 1000000):
        sum += (x + y)
        x, y = x + 2 * y, 2 * x + 3 * y
    return sum

''' C++ STL
# include <iostream>
# include <algorithm>
# include <numeric>
# include <vector>

bool odd (int i) {
   return i & 1;
}

int main () {
   std :: vector <int> fib(30);
   fib[0] = 1;
   adjacent_difference (fib.begin(), fib.end() - 1, fib.begin() + 1, std::plus<int>());   
   fib.erase (std::remove_if(fib.begin(), fib.end(), odd), fib.end());
   clock_t end(clock() - start);
   std::cout << accumulate (fib.begin(), fib.end(), 0);
   return 0;
}
'''