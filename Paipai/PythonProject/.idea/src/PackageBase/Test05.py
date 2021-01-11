import datetime,sys
import requests

# 构造 HTTP 请求
url = "http://hq.sinajs.cn/list=sz000063"

# 返回的response 对应响应消息的对象
response = requests.get(url)

# 返回的内容在消息体中，通过text属性获取
info = response.text
print(info)

# 返回的是这种格式 大秦铁路, 27.55, 27.25, 26.91,
# 通过split 方法截取
price = info.split(',')
print(price)






#输出环境变量
# for path in sys.path:
#     print (path)
