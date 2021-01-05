#记录用餐总费用和用餐人员
import Record

members=input("请输入用餐人员名单，用英文逗号分割：")
members_list=members.split(";")
fee=input("请输入总的用餐费用：")
fee_total=float(fee)
avgfee=fee_total/len(members_list)
Record.record(members_list,str(avgfee))
