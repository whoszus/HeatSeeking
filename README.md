## heatseeking - for web index 


[![license](https://img.shields.io/github/license/mashape/apistatus.svg?style=plastic)](https://opensource.org/licenses/MIT)


### to do List

- [x] AOP实现日志 以及登陆权限认证；
- [x] dev 环境与 prod 环境分离，使用不同的配置文件；
- [ ] 启用缓存用户token；
- [ ] spring 服务注册发现；
- [ ] sprigng boot 远程调用；
- [ ] 将token验证作为全局服务，验证之后调用其他springboot的服务
- [ ] 写文档管理action；


### 系统当前状态分析
- 开发进度：
    1. 完成三种密钥加密方法；RSA、AES、..
    2. 完成AOP日志；
    3. cookie验证token；
    4. 
    
- 系统安全性分析
    1. sql注入风险： 
        - 暂时没有发现：使用JPA；
    2. xss：
        - 暂未测试；
    3. 重放攻击：
        - 存在：token明文存储cookie中，http传输透明；
        - 解决方案： token -> md5+salt + https;
    4. 数据泄露：
        - 存在：明文传输；
    5. 数据库脱库风险： 
        - 暂未发现：测试环境、开源代码、真实环境分离；
        

