class Goods:
    def __init__(self, kucun, value):
        self.kucun = kucun
        self.value = value
        self.unit = value / kucun

    def __lt__(self, oth):
        return self.unit > oth.unit


# 贪心
if __name__ == "__main__":
    N, D = map(int, input().split())
    kucuns = list(map(float, input().split()))
    values = list(map(float, input().split()))
    goodses = []
    for i in range(N):
        goodses.append(Goods(kucuns[i], values[i]))
    maxProfit = 0.0
    for goods in sorted(goodses):
        if D >= goods.kucun:
            maxProfit += goods.value
            D -= goods.kucun
        else:
            maxProfit += D * goods.unit
            break
    print("%.2f" % maxProfit)
