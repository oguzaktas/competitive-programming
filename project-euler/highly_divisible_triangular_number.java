class DivisibleNumber {
    public static void main(String[] args) {
        System.out.println(findTriangular());
    }

    public static long findTriangular() {
        long sum = 0;
        for (int i = 1; ; i++) {
            sum += i;
            if (findDivisors(sum) > 500) {
                return sum;
            }
        }
    }

    public static long findDivisors(long number) {
        long result = 1;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                result++;
            }
        }
        return result;
    }
}

/* Python with Numba
from numba import jit,prange

@jit(nopython=True, parallel=True)
def divisors(num):
    n = 0
    for i in prange(num):
        if num%i == 0: n += 1
    return n

i = 1
div_num = 0
while div_num < 500:
    test_num = sum(prange(i))
    div_num = divisors(test_num)
    i += 1

print(div_num)
*/