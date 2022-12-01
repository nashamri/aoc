temp = []
cals = 0
with open('input') as f: 
    for line in f.readlines():
        if line != "\n":
            temp.append(int(line))
        else:
            cals = max(sum(temp) , cals)
            temp = []
print(cals)
