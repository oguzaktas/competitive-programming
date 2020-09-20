palindrome = []
for i in range(100, 1000):
    for j in range(100, 1000):
        c = i * j
        n = int(str(c)[::-1])
        if c == n:
            if c in palindrome:
                continue
            palindrome.append(c)
print(max(palindrome))