temp = []
cals = []

with open("input.txt") as f:
    for line in f.readlines():
        if line != "\n":
            temp.append(int(line))
        else:
            cals.append(sum(temp))
            temp = []

print(f"Part 1: {sorted(cals)[-1]}")
print(f"Part 2: {sum(sorted(cals)[-3:])}")
