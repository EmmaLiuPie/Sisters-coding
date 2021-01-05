#文件的读取
# open(
#     file,
#     mode='r',
#     buffering=-1,
#     encoding=None,
#     errors=None,
#     newline=None,
#     closefd=True,
#     opener=None
# )
f=open("FileRead","a")
f.write("|2021")
f.close()

f=open("FileRead","r")
content=f.read()
print(content)
content_new = content.split("|")
print(content_new)
f.close()
#使用with语句，python解释器会自动关闭文件
#对文件的操作都放在锁进里
with open("FileRead","r") as f:
    c=f.read()
print(c)
#刷新 f.flush()

#课后作业
# 点击这里下载文件 解压后得到文件 0013_a1.txt
#
# 该文件的内容编码方式是utf8。
#
# 该文件中记录了小区中人的姓名和年龄
#
# 请编写一个程序，将其中年龄大于50岁的找出来， 并且以这样的格式追加到该文件末尾中。
f=open("0013_a1.txt","r")
content=f.read()
f.close()
content=content.splitlines()
f=open("0013_a1.txt","a")


for line in content:
    # 去掉行中的空格
    line = line.replace(' ','')
    # 如果是空格，跳过
    if not line:
        continue
    name,age=line.split(":")
    if int(age)>50:
        f.write(name)
        print(name)

f.close()