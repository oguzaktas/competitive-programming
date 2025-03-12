class Solution {
    public int[] closestPrimes(int left, int right) {
        /* O(n * √n) intuitive solution using ArrayList (not very efficient)
        List<Integer> primesDescending = new ArrayList<>();
        for (int num = right; num >= left; num--) {
            if (num < 2) {
                continue;
            }
            boolean isPrime = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primesDescending.add(num);
            }
        }

        int minDist = Integer.MAX_VALUE;
        int[] result = new int[]{-1, -1};
        for (int i = 0; i < primesDescending.size() - 1; i++) {
            int current = primesDescending.get(i);
            int next = primesDescending.get(i + 1);
            int dist = current - next;
            if (dist < minDist) {
                minDist = dist;
                result = new int[]{next, current};
            } else if (dist == minDist) {
                if (next < result[0]) {
                    result = new int[]{next, current};
                }
            }
        }
        return result;
        */
        // O(nlog(logn)) solution
        int[] primes = findPrimes(right);
        List<Integer> primeNumbers = new ArrayList<>();
        for (int num = left; num <= right; num++) {
            if (primes[num] == 1) {
                primeNumbers.add(num);
            }
        }

        if (primeNumbers.size() < 2) {
            return new int[]{-1, -1};
        }

        int minDiff = Integer.MAX_VALUE;
        int[] closestPair = new int[2];
        Arrays.fill(closestPair, -1);

        for (int i = 1; i < primeNumbers.size(); i++) {
            int diff = primeNumbers.get(i) - primeNumbers.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
                closestPair[0] = primeNumbers.get(i - 1);
                closestPair[1] = primeNumbers.get(i);
            }
        }
        return closestPair;
    }

    private int[] findPrimes(int right) {
        int[] primes = new int[right + 1];
        Arrays.fill(primes, 1);
        primes[0] = 0;
        primes[1] = 0;
        for (int num = 2; num * num <= right; num++) {
            if (primes[num] == 1) {
                for (int j = num * num; j <= right; j += num) {
                    primes[j] = 0;
                }
            }
        }
        return primes;
    }
}

// https://leetcode.com/problems/closest-prime-numbers-in-range/?envType=daily-question&envId=2025-03-07