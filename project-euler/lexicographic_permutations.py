import itertools

def lexicographic(n, digits):
    full_sequence = itertools.permutations(digits)
    starting_at_n = itertools.islice(full_sequence, n - 1, n)
    return next(starting_at_n)

if __name__ == '__main__':
    permutation = list(lexicographic(1000000, '0123456789'))
    print(''.join(permutation))