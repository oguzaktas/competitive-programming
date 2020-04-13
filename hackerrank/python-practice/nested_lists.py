if __name__ == '__main__':
    nested_list = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        nested_list.append([name, score])
    second_highest = sorted(list(set([marks for name, marks in nested_list])))[1]
    print('\n'.join([a for a,b in sorted(nested_list) if b == second_highest]))
