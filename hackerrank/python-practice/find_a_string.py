def count_substring(string, sub_string):
    len1 = len(string)
    len2 = len(sub_string)
    count = 0
    i = 0
    while (i < len1):
        if (string[i] == sub_string[0]):
            if (string[i:i+len2] == sub_string):
                count += 1
        i += 1
    return count
    # return string.count(sub_string)

if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()
    
    count = count_substring(string, sub_string)
    print(count)