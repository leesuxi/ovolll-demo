# ovolll-demo
呆萌！
### demo01
一些无聊乱写的内容，没有参考性
### demo-jpa
Spring Boot + Spring Data Jpa -->Result风格：


```yaml
spring:
  #第一次加载hibernate时根据model类会自动建立起表的结构
  jpa:
    hibernate:
      ddl-auto: update
  #开启PUT，DELETE支持
  mvc:
    hiddenmethod:
      filter:
        enabled: true
```