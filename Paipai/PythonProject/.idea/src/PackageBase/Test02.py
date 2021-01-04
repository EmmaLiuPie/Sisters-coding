#对象的方法

#列表的方法
l1=[1,2,3,4,5,6]

print("===append===")
#append
l1.append("a")
print(l1)

print("===insert===")
#insert
l1.insert(3,"b")
print(l1)

print("===pop===")
#pop
l1.pop(3)
print(l1)

print("===remove===")
#remove
l1.remove("a")
print(l1)

print("===reverse===")
#reverse
l1.reverse()
print(l1)

print("===index===")
#index
print(l1.index(5))


print("===sort===")
#sort
l1.sort()
print(l1)

#homework
#1-var1 = [ 33, ['我的名字', '黑羽白月'], 'hello world!'],
#请接下来写一行代码,在列表的结尾处添加一个元素 字符串 ‘你好’
var1=[ 33, ['我的名字', '黑羽白月'], 'hello world!']
var1.append("你好")
print(var1)

#请接下来写一行代码,在列表的开头处添加一个元素: 字符串 ‘你好’
var1.insert(0,"你好")
print(var1)

#请接下来写一行代码,在列表33这个元素的后面 添加一个元素 字符串 ‘你好’
var2=[ 33, ['我的名字', '黑羽白月'], 'hello world!']
var2.insert(1,"你好")
print(var2)

#str1 = '大家好，我的名字叫：黑羽白月'
#请接下来写一行代码，不要数人名字的下标位置，而是使用字符串find方法 找到人名字的下标位置，打印出 str1里面的人名字
str1 = '大家好，我的名字叫：黑羽白月'
index=str1.find("黑羽白月")
print(str1[index:])

#使用字符串split方法，打印出 str1里面的人名字。
str1 = '大家好，我的名字叫：黑羽白月'
str2=str1.split("：")
print(str2[1])


#
# 首先提示用户输入年龄、身高、体重信息，格式如下如下
#
# 请输入您的性别：男
# 请输入您的身高（厘米）：175厘米
# 请输入您的体重（公斤）：80公斤
# 注意：
#
# 用户输入的内容，前后、中间都可能有空格，比如 175 厘米
#
# 然后根据如下的计算公式，计算出身高对应的标准体重。
#
# 标准体重(男)=(身高cm-100)x0.9(kg)
# 标准体重(女)=(身高cm-100)x0.9(kg)-2.5(kg)
# 如果体重在标准体重上下5公斤，都属于标准体重，提示用户体重标准。
#
# 否则提示用户高于标准还是低于标准

str_sex=input("请输入您的性别：")
str_high=input("请输入您的身高（厘米）：")
str_weight=input("请输入您的体重（公斤）：")
str_sex.strip()
str_high.strip()
str_weight.strip()

str_weight1=float(str_weight)
str_high1=float(str_high)

if str_sex=="男":
    stander_weitht=(str_high1-100)*0.9

else:
    stander_weitht=(str_high1-100)*0.9-2.5

if (stander_weitht-5<=str_weight1) & (str_weight1<=stander_weitht+5):
    print("恭喜您，您的体重标准")
elif stander_weitht-5>str_weight1:
    print("您太瘦了")
else:
     print("您太胖了")


