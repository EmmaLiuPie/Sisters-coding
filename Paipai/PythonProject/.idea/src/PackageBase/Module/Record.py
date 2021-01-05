def record(member_list,avag_fee):
    f=open("record","a")
    for i in member_list:
        f.write(i)
        f.write(" ")
    f.write("\n")
    f.write(avag_fee)
    f.close()
