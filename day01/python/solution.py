cals = [[]]
with open("input.txt") as f:
    [
        cals[-1].append(int(x.strip())) if x != "\n" else cals.append([])
        for x in f.readlines()
    ]
    cals = sorted(map(sum, cals))

print(f"Part 1: {sorted(cals)[-1]}")  # 70116
print(f"Part 2: {sum(sorted(cals)[-3:])}")  # 206582
