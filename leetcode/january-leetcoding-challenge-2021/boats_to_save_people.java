class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0;
        List<Integer> list = Arrays.stream(people).boxed().collect(Collectors.toList());
        while (list.contains(limit)) {
            count++;
            list.remove(new Integer(limit));
        }
        Collections.sort(list);
        int i = 0, j = list.size() - 1;
        while (i <= j) {
            count++;
            if (list.get(i) + list.get(j) <= limit) {
                i++;
            }
            j--;
        }
        return count;
    }
}

// https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/580/week-2-january-8th-january-14th/3602/
/* C++ solution (two pointers approach)
int numRescueBoats(vector<int> people, int limit) {
    int i, j;
    sort(people.rbegin(), people.rend());
    for (i = 0, j = people.size() - 1; i <= j; ++i)
        if (people[i] + people[j] <= limit) j--;
    return i;
}
*/

/* Python solution (two pointers approach)
def numRescueBoats(self, people, limit):
    people.sort(reverse=True)
    i, j = 0, len(people) - 1
    while i <= j:
        if people[i] + people[j] <= limit:
            j -= 1
        i += 1
    return i
*/