if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()
    sum_num = 0
    for t in student_marks[query_name]:
        sum_num = sum_num + t           
    avg = sum_num / len(student_marks[query_name])
    print(format(avg, '.2f'))
