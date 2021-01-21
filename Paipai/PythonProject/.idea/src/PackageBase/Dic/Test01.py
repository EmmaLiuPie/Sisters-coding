
members={"liupai":2,"wangdan":1}
print(members["liupai"])
#add new member
members["wudi"]=4
print(members["wudi"])
#delete a member
members.pop("liupai")
print(members)
del members["wangdan"]
print(members)
#looking for some member
if "wudi" in members:
    print("ok")
members={"liupai":2,"wangdan":1}
#遍历字典 items方法，返回的是一个类似列表一样的对象，其中每个元素就是 键值组成的元组
#上面的字典，其items方法返回的是类似这样的对象
for key,value in members.items():
    print(f'key:{key},value:{value}')
#key:liupai,value:2
#key:wangdan,value:1


print(members.items())
#dict_items([('liupai', 2), ('wangdan', 1)])


l=members.keys()
print(l)
#dict_keys(['liupai', 'wangdan'])

v=members.values()
print(v)
#dict_values([2, 1])

#clear
#members.clear()

#update 在 members字典里面加上了 another字典里面的所有元素

new_members={"wulijuan":3,"wulimin":1}
members.update(new_members)
print(members)
print(new_members)




















