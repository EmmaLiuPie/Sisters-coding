#循环
#input1=input("input a number(not 0):")
input1=0
sum=0
s=int(input1)
while s:
    sum+=s
    input1=input("input a number(not 0):")
    s=int(input1)
print(sum)

#for循环 列表
l1=["liupai1,1","liupai2,2","liupai3,3","liupai4,4"]
for i in l1:
    print(i)
j=0
while j< len(l1):
    print(l1[j])
    j+=1

#range
for i in range(100):
    print(i)
    i=i+1

for i in range(100,150,10):
    print(i)
    i=i+1

#enumerate() 函数用于将一个可遍历的数据对象(如列表、元组或字符串)组合为一个索引序列，同时列出数据和数据下标，一般用在 for 循环当中。
l2=["spring","summer","autumn","winter"]
print(list(enumerate(l2)))#[(0, 'spring'), (1, 'summer'), (2, 'autumn'), (3, 'winter')]
for i,enumerate in enumerate(l2):
    print(i,enumerate)
# 0 spring
# 1 summer
# 2 autumn
# 3 winter

#列表推导式
l1=[1,2,3,4,5]
l2=[num*2 for num in l1]
print(l2)

#循环嵌套
l1=["贝塔"]
l2=["兮兮","二妮儿"]
for e1 in l1:
    for e2 in l2:
        print(e1+"love"+e2)

#冒泡排序
l1=[23,5,2,3,63,32]
length=len(l1)

for i in range(length):
    for j in range(i):
        if l1[i]>l1[j]:
            a=l1[i]
            l1[i]=l1[j]
            l1[j]=a
print(l1)

#练习题
# str1 = '''
# 熊宁
# 杰益
#
# 王伟伟
#
# 青芳
#
# 玉琴
# 焦候涛
# 莫福
# 杨高旺
# 唐欢欢
# 韩旭
# '''
#
# str2 = '''
# 焦候涛
# 熊宁
# 玉琴
#
# 骆龙
#
# 韩旭
# 杨高旺
#
# 杰益
#
# 莫福
#
# 伟伟
#
# 李福
# '''
# 请写一个程序
#
# 找出 str1 中所有 str2 中不存在的人名，并且
#
# 找出 str2 中所有 str1 中不存在的人名

str1 = '''
熊宁
杰益

王伟伟

青芳

玉琴
焦候涛
莫福
杨高旺
唐欢欢
韩旭
'''

str2 = '''
焦候涛 
熊宁 
玉琴 

骆龙 

韩旭 
杨高旺

杰益  

莫福  

伟伟

李福  
'''
str2=str2.strip()
str2=str2.replace(" ","")
str1=str1.strip()
str1=str1.replace(" ","")
str1=str1.split("\n")
str2=str2.split("\n")

print(str1)
print(str2)
for name1 in str1:
    if name1 not in str2:
        print(name1)

# ageTable = '''
#     诸葛亮, 28
#     刘备, 48
#     刘琦, 25
#     赵云, 32
#     张飞, 43
#     关羽, 45
# '''请写一个程序将其中 30岁以上和以下的人分别打印出来，类似这样

