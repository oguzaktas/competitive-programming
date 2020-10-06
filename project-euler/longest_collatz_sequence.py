sequence_length = {1: 0}

def collatz_sequence_length(i):
    global sequence_length
    if i in sequence_length:
        return sequence_length[i]
    if i % 2 == 0:
        length = collatz_sequence_length(i // 2)
    else:
        length = collatz_sequence_length(3 * i + 1)
    length += 1
    sequence_length[i] = length
    return length

result = 0
longest = 0
for i in range(1, 1000000):
    length = collatz_sequence_length(i)
    if length > longest:
        result = i
        longest = length
print(result)

'''
import time

def longest_collatz(limit):
    known = {}
    longest_length = 0
    longest_length_start = -1
    for i in range(2, limit + 1):
        n = i
        length = 1
        while n != 1:
            if n % 2 == 0:
                n = int(n / 2)
            else:
                n = 3 * n + 1
            length += 1
            if n in known:
                length += known[n] - 2
                break
        known[i] = length
        if length > longest_length:
            longest_length_start = i
            longest_length = length
    return longest_length, longest_length_start

start = time.time()
result = longest_collatz(1000000)
print(result[1], "with length", result[0])
print("Took:", time.time() - start, "sec")
'''
''' Java solution;
import java.util.ArrayList;

class LongestCollatzSequence {
    static ArrayList<Long> l = new ArrayList<Long>();
	static long ans;

	public static void main(String[] args) {
		for (int i = 2; i <= 1000000; i++)
            check(i);
		System.out.println(ans);
	}

	public static void check(long i) {
		ArrayList<Long> temp = new ArrayList<Long>();
	    long x = i;
		while (x >= 1) {
			if (x % 2 == 0) {
				temp.add(x);
				x /= 2;
			} else {
				if (x == 1) {
					temp.add(x);
					break;
				} else {
					temp.add(x);
			        x = x * 3 + 1;
				}		
			}
		}
		if (temp.size() > l.size()) {
			l = temp;
			ans = i;
		}
	}
}
'''
