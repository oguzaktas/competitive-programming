class Solution:
    def wordSubsets(self, A: List[str], B: List[str]) -> List[str]:
        Bfreq = Counter()
        for word in B:
            Bfreq |= Counter(word)
        if sum(Bfreq.values()) > 10:
            return []
        return [word for word in A if not Bfreq - Counter(wdrd)]

# https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/591/week-4-march-22nd-march-28th/3685/

''' Initial Java solution (Time Limit Exceeded)
class Solution {
    public List<String> wordSubsets(String[] A, String[] B) {
        List<String> result = new ArrayList<>();
        boolean isUniversal;
        StringBuilder sb;
        for (int i = 0; i < A.length; i++) {
            isUniversal = true;
            outerloop:
            for (int j = 0; j < B.length; j++) {
                sb = new StringBuilder(A[i]);
                for (int k = 0; k < B[j].length(); k++) {
                    if (sb.indexOf(Character.toString(B[j].charAt(k))) != -1) {
                        sb.deleteCharAt(sb.indexOf(Character.toString(B[j].charAt(k))));
                    } else {
                        isUniversal = false;
                        break outerloop;
                    }
                }
            }
            if (isUniversal) {
                result.add(A[i]);
            }
        }
        return result;
    }
}
'''