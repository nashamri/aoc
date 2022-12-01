with open("input") as f:
    cals = []
    temp = []
    for line in f.readlines():
        if line != "\n":
            temp.append(int(line))
        else:
            cals.append(sum(temp))
            temp = []

print(sum(sorted(cals)[-3:]))

