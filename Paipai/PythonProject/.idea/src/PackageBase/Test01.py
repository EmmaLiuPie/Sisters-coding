#字符串的方法



print("===def===")
def doSome(name):
    print("welcome "+name)
doSome("paipai")
print("===切片===")
s="abcedfg"
print(s[1:2])
print(s[-5:-4])

print("===count===")
s1="今天，你好。今天，你吃的什么？"
#count用法
print("你好的个数："+str(s1.count("你好")))

print("===find===")
#find
print("你好出现的位置"+str(s1.find("你好")))

print("===split===")
#split
s2="今天|你好|今天|你吃的什么？"
s2=s2.split("|")
print(s2)

print("===splitlines===")
#splitlines
s3='''张三，100
李四，99
王武，98
'''
s3=s3.splitlines()
print(s3)

print("===join===")
#jion
s4='''张三，100
李四，99
王武，98
'''
"?".join(s4)
print(s4)

print("===strip===")
#strip 字符串前面和后面的空格删除，但是不会删除字符串中间的空格
s5 = "    你   好   ， 北    京     "
s6=s5.strip()
print(s5)
print(s6)

print("===lstrip===")
#lstrip  字符串前面 (左边) 的空格删除，但是不会删除字符串中间和右边的空格
s7="    你   好   ， 北    京     "
s8=s7.lstrip()
print(s8)

print("===rstrip===")
#rstrip   字符串后面 (右边) 的空格删除，但是不会删除字符串中间和右边的空格
s9="    你   好   ， 北    京     "
s10=s9.lstrip()
print(s10)

print("===replace===")
#replace
s9="你   好   ， 北    京"
s11=s9.replace("你","您")
print(s11)

print("===startwith===")
#startwith
print(s9.startswith("你"))
print(s9.startswith("您"))
print("===endwith===")
#endwith
print(s9.endswith("京"))
print(s9.endswith("北    京"))

print("===isdigital===")
#isdigital
print("3".isdigit())

print("===字符串倒序===")
print(s9[::-1])
