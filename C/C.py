from sys import stdin


def check(S, T):
    if S == T:
        return 0
    elif S == "J" and T == "B":
        return 1
    elif S == "B" and T == "C":
        return 1
    elif S == "C" and T == "J":
        return 1
    return -1


if __name__ == "__main__":
    N = int(input())
    record1 = [0, 0, 0]
    record2 = [0, 0, 0]
    win1 = {
        "J": 0,
        "B": 0,
        "C": 0,
    }
    win2 = {
        "J": 0,
        "B": 0,
        "C": 0,
    }
    for _ in range(N):
        jia, yi = stdin.readline().split()
        r = check(jia, yi)
        if r == 1:
            record1[0] += 1
            record2[2] += 1
            win1[jia] += 1
        elif r == -1:
            record1[2] += 1
            record2[0] += 1
            win2[yi] += 1
    record1[1] = N - record1[0] - record1[2]
    record2[1] = N - record2[0] - record2[2]
    print(" ".join(map(str, record1)))
    print(" ".join(map(str, record2)))
    if win1["B"] >= win1["C"]:
        if win1["B"] >= win1["J"]:
            print("B", end=" ")
        else:
            print("J", end=" ")
    else:
        if win1["C"] >= win1["J"]:
            print("C", end=" ")
        else:
            print("J", end=" ")
    if win2["B"] >= win2["C"]:
        if win2["B"] >= win2["J"]:
            print("B")
        else:
            print("J")
    else:
        if win2["C"] >= win2["J"]:
            print("C")
        else:
            print("J")
