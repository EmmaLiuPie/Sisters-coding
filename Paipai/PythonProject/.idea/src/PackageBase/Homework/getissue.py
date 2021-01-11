import requests,pprint

def getIssueBody(issueID):

    url = f'https://api.github.com/repos/baiyueheiyu/python3vip-forum/issues/{issueID}'
    # 构造 API 请求
    response = requests.get(url)

    # 将 json格式的字符串转换 为Python中的对象，这里是一个字典对象
    info = response.json()
    # pprint.pprint(info)

    return info['body']