#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the miniMaxSum function below.
def miniMaxSum(arr):
    list1 = []
    list2 = []
    for e in arr:
        list1.append(e)
        list2.append(e)
    list1.remove(max(list1))
    list2.remove(min(list2))
    print(sum(list1), sum(list2)) 

if __name__ == '__main__':
    arr = list(map(int, input().rstrip().split()))

    miniMaxSum(arr)
