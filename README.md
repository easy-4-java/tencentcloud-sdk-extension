# tencentcloud-sdk-extension

基于腾讯云官方 SDK 的纯 Java 扩展层，承载 TIM、TRTC、SMS、Live 的模型、模板与工具类，不包含 Spring Boot 自动配置。

## Maven

```xml
<dependency>
  <groupId>io.github.hiwepy</groupId>
  <artifactId>tencentcloud-sdk-extension</artifactId>
  <version>1.0.x.20260630-SNAPSHOT</version>
</dependency>
```

## 版本线

| 分支 | 版本前缀 | JDK | 说明 |
|------|----------|-----|------|
| `feature/1.0.x` | `1.0.x.*` | 8 | 对齐 Boot 2.x |
| `feature/2.0.x` | `2.0.x.*` | 17 | 对齐 Boot 3.x |
| `feature/3.0.x` | `3.0.x.*` | 21 | 对齐 Boot 4.x |

## 模块边界

- 基于官方 `tencentcloud-sdk-java`、`tls-sig-api-v2`
- 属于 `*-extension`，不是自研 `*-java-sdk`
- `tencentapi-spring-boot-starter` 已收敛为对本模块的 Spring Boot 自动装配层

## License

Apache License 2.0
