# oauth2
## 获取token

```
http://localhost:8080/oauth/token?username=user_1&password=123456&grant_type=password&scope=select&client_id=client_2&client_secret=123456
```

## 请求资源

```
http://localhost:8080/order/1?access_token=950a7cc9-5a8a-42c9-a693-40e817b1a4b0
```

参考：[https://blog.csdn.net/u013815546/article/details/76898524](https://blog.csdn.net/u013815546/article/details/76898524)

# authserver和resourceserver

[参考](https://www.cnblogs.com/zsg88/p/11382054.html)