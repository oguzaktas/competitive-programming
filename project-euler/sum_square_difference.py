def difference(n):
    '''
    Computing the difference between sum of the squares of the first n natural numbers and the square of the sum of first n natural numbers
    n: number
    returns: integer
    '''
    sum_of_square = sum_squares(n)
    square_of_sum = square_sum(n)

    return int(square_of_sum - sum_of_square)

def sum_squares(n):
    '''
    Computing sum of the squares of first n Natural numbers
    n: computing sum of squares upto and inclusive this number
    returns: integer
    '''
    square_sum = int(n / 3 * (n + 1) * ((2 * n + 1) / 2))  
    
    return square_sum

def square_sum(n):
    '''
    Computing square of the sum of first n natural numbers
    n: computing square of the sum of numbers upto and inclusive this number
    returns: integer
    '''

    sum_n = (1 + n) * n / 2
    square_of_sum = sum_n ** 2

    return square_of_sum

def main():
    n = int(input('Enter a number n (natural number): '))
    res = difference(n)
    print(res)


if __name__ == '__main__':
    main()