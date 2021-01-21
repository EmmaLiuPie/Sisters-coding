
with open("homework.txt")as f:
    infoList = f.read().splitlines()
coinTable = {}
for info in infoList:
    info=info.strip()# delete space
    if not info:
        continue

    parts=info.split(" ")
    name =parts[0]
    coin = int(parts[-2])

    if name[0] not in coinTable:
        coinTable[name[0]]=coin
    else:
        coinTable[name[0]]+=coin
print(coinTable)

