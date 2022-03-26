if __name__ == "__main__":
    a, da, b, db = input().split()
    pa = da * a.count(da)
    pb = db * b.count(db)
    pa = int(pa) if pa else 0
    pb = int(pb) if pb else 0
    print(pa + pb)
