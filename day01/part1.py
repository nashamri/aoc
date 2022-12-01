with open("input") as f:
    cals = []
    temp = []
    for line in f.readlines():
        if line != "\n":
            temp.append(int(line))
        else:
            cals.append(sum(temp))
            temp = []

    #cals = [int(elf) for elf in [line for line in f.readlines()]]


print(max(cals))
