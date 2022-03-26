def solve(n):
    if n.count(n[0]) == 4:
        print("%s - %s = 0000" % (n, n))
    else:
        result = n
        while True:
            before = "".join(sorted(result, reverse=True))
            after = before[::-1]
            result = str(int(before) - int(after)).rjust(4, '0')
            print("%s - %s = %s" %
                  (before, after, result))
            if result == "6174":
                break


if __name__ == "__main__":
    solve(input().rjust(4, '0'))
