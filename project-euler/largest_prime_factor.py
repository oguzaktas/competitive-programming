def listPrimeFactors(number):
    k = 2
    factors = []      
    while number > 1:
        if number % k == 0:
            number = number / k
            factors.append(k)
        else:
            k += 1
    return factors

print(max(listPrimeFactors(600851475143)))