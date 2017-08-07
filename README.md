# springCloudExample
## nf 
Eureka regist center

## consul
是一个独立的apache注册中心，可以独立运行的

## 运行方式
- 1.需要先启动consul

```bash
consul agent -dev
```
- 2.再启动配置中心 config-center-git
- 3.启动provider
- 4.启动feign，因为他依赖于配置中心，所以需要先启动配置中心

