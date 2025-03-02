import java.math.BigInteger;

class Solution {
    BigInteger[] fact = new BigInteger[51];
    
    public int[] permute(int n, long k) {
        precomputeFactorials();
        BigInteger K = BigInteger.valueOf(k);
        int[] result = new int[n];
        
        int totalOdd, totalEven;
        if (n % 2 == 1) {
            totalOdd = (n + 1) / 2;
            totalEven = n / 2;
        } else {
            totalOdd = n / 2;
            totalEven = n / 2;
        }
        
        boolean patternOdd = false;
        boolean found = false;
        for (int x = 1; x <= n; x++) {
            if (n % 2 == 1 && x % 2 == 0) {
                continue;
            }
            
            if (n % 2 == 0) {
                if (x % 2 == 1) {
                    BigInteger cnt = fact[totalOdd - 1].multiply(fact[totalEven]);
                    if (K.compareTo(cnt) > 0) {
                        K = K.subtract(cnt);
                    } else {
                        result[0] = x;
                        patternOdd = true;
                        found = true;
                        break;
                    }
                } else {
                    BigInteger cnt = fact[totalEven - 1].multiply(fact[totalOdd]);
                    if (K.compareTo(cnt) > 0) {
                        K = K.subtract(cnt);
                    } else {
                        result[0] = x;
                        patternOdd = false;
                        found = true;
                        break;
                    }
                }
            } else {
                BigInteger cnt = fact[totalOdd - 1].multiply(fact[totalEven]);
                if (K.compareTo(cnt) > 0) {
                    K = K.subtract(cnt);
                } else {
                    result[0] = x;
                    patternOdd = true;
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            return new int[0];
        }
        
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        for (int x = 1; x <= n; x++) {
            if (x % 2 == 1) {
                oddList.add(x);
            } else {
                evenList.add(x);
            }
        }
        if (patternOdd) {
            oddList.remove((Integer) result[0]);
        } else {
            evenList.remove((Integer) result[0]);
        }
        
        int usedOdd = (patternOdd || n % 2 == 1) ? 1 : 0;
        int usedEven = (n % 2 == 0 && !patternOdd) ? 1 : 0;
        
        for (int pos = 1; pos < n; pos++) {
            boolean reqOdd = (pos % 2 == 0) ? patternOdd : !patternOdd;
            boolean candidateFound = false;
            
            if (reqOdd) {
                for (int i = 0; i < oddList.size(); i++) {
                    int candidate = oddList.get(i);
                    int remOdd = totalOdd - (usedOdd + 1);
                    int remEven = totalEven - usedEven;
                    BigInteger cnt = fact[remOdd].multiply(fact[remEven]);
                    if (K.compareTo(cnt) > 0) {
                        K = K.subtract(cnt);
                    } else {
                        result[pos] = candidate;
                        usedOdd++;
                        oddList.remove(i);
                        candidateFound = true;
                        break;
                    }
                }
            } else {
                for (int i = 0; i < evenList.size(); i++) {
                    int candidate = evenList.get(i);
                    int remEven = totalEven - (usedEven + 1);
                    int remOdd = totalOdd - usedOdd;
                    BigInteger cnt = fact[remOdd].multiply(fact[remEven]);
                    if (K.compareTo(cnt) > 0) {
                        K = K.subtract(cnt);
                    } else {
                        result[pos] = candidate;
                        usedEven++;
                        evenList.remove(i);
                        candidateFound = true;
                        break;
                    }
                }
            }
            if (!candidateFound) {
                return new int[0];
            }
        }
        return result;
    }
    
    private void precomputeFactorials() {
        fact[0] = BigInteger.ONE;
        for (int i = 1; i < fact.length; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i));
        }
    }
}

// https://leetcode.com/contest/biweekly-contest-151/problems/permutations-iv/