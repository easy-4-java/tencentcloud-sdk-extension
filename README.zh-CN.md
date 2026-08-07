# tencentcloud-sdk-extension

[English](./README.md) | [简体中文](./README.zh-CN.md)

[![Java](https://img.shields.io/badge/Java-17-orange)](https://github.com/easy-4-java/tencentcloud-sdk-extension) [![License](https://img.shields.io/badge/license-Apache%202.0-green)](https://www.apache.org/licenses/LICENSE-2.0.txt)

tencentcloud-sdk-extension 是基于腾讯云官方 SDK 的纯 Java 扩展层，独立于 Spring Boot。

## 目录

- [1. Project Overview](#1-project-overview)
- [2. Features & Status](#2-features--status)
- [3. Requirements & Compatibility](#3-requirements--compatibility)
- [4. Architecture & Modules](#4-architecture--modules)
- [5. Installation](#5-installation)
- [6. Quick Start](#6-quick-start)
- [7. Configuration](#7-configuration)
- [8. Core Usage / API](#8-core-usage--api)
- [9. Testing & Build](#9-testing--build)
- [10. Versioning & Branches](#10-versioning--branches)
- [11. Contributing & License](#11-contributing--license)

## 1. Project Overview

`tencentcloud-sdk-extension` 是基于腾讯云官方 SDK 的纯 Java 扩展层，独立于 Spring Boot。它承载腾讯云服务的模型、模板与工具类：IM（TIM）操作与 UserSig 生成、TRTC 房间/流操作、SMS 发送以及 Live 流/混流操作。所有云 API 调用均通过官方 `tencentcloud-sdk-java` 与 `tls-sig-api-v2`；本模块在其之上提供便捷的类型化模板与属性模型。

它是 `*-extension` 模块，不是自研 `*-java-sdk`。`tencentapi-spring-boot-starter` 项目已收敛为对本模块的 Spring Boot 自动装配层。

典型场景：

| 场景 | 本模块提供的组件 |
|:---|:---|
| IM（TIM）账号/群组/资料/关系链/开放接口操作 | `TencentTimTemplate` + `TencentTim*Operations`（同步与 `*AsyncOperations`） |
| TIM UserSig 生成 | `TencentTimTemplate#genUserSig(identifier[, expire])` |
| 短信发送 | `TencentSmsTemplate#send(phoneNumbers, templateID, templateParams)` |
| Live 流/混流管理 | `TencentLiveTemplate`（`createStream`、`createMixStream`、`stopMixStream` 等） |
| TRTC 房间管理 | `TencentTrtcTemplate`（`kickout`、`dismissRoom`、`createMixStream`、`outputParams` 等） |
| 用户 ID 映射 | `TimUserIdProvider` / `TrtcUserIdProvider` |

## 2. Features & Status

项目状态：`1.0.x.*` 预发布开发线（快照版本）；在首个正式 Release 标签之前，公开 API 仍在稳定过程中。

| 能力 | 状态 | 说明 |
|:---|:---|:---|
| TIM 模板 | 稳定 | `TencentTimTemplate`——`opsForAccount`、`opsForPush`、`opsForGroup`、`opsForNoSpeaking`、`opsForOpenim`、`opsForProfile`、`opsForSns`、`genUserSig` |
| TIM 账号操作 | 稳定 | `TencentTimAccountOperations`——`aImport`、`delete`、`check`、`kickout`、`getState`（另有异步变体） |
| TIM 群组操作 | 稳定 | `TencentTimGroupOperations`（+ `Async`） |
| TIM 其他域 | 稳定 | 全员推送（`AllMemberPush`）、禁言、openim、资料、关系链、运营——同步与异步变体 |
| TIM 模型 | 稳定 | `req/` 与 `resp/` 请求/响应模型、`TimApiAddress`、`TimUserIdProvider` |
| 短信模板 | 稳定 | `TencentSmsTemplate#send(...)` 返回 `SendSmsResponse` |
| Live 模板 | 稳定 | `TencentLiveTemplate`——`createStream`、`createStreamByStreamName`、`createMixStream`、`stopMixStream`；回调模型（`StreamStateChangeMsg`、`StreamRecordingMsg`、`StreamSnapshotMsg`、`StreamAppraisalMsg`） |
| TRTC 模板 | 稳定 | `TencentTrtcTemplate`——`kickout`、`dismissRoom`、`outputParams`、`createMixStream`；`TrtcUserIdProvider` |
| 属性模型 | 稳定 | `TencentCloudProperties` + 各服务属性（TIM、SMS、Live、TRTC），带 `tencent.cloud.*` 前缀 |

## 3. Requirements & Compatibility

| 要求 | 版本 |
|:---|:---|
| JDK | 17+ |
| Maven | 3.6+ |
| 腾讯云 SDK | 官方 `tencentcloud-sdk-java`（已在 POM 声明） |
| TLS Sig | `tls-sig-api-v2`（UserSig 生成） |
| HTTP 客户端 | okhttp（已在 POM 声明） |
| 其他运行依赖 | guava、commons-lang3 |

版本线：

| 分支 | JDK | 版本模式 | 说明 |
|:---|:---|:---|:---|
| `feature/1.0.x` | 8 | `1.0.x.*` | 当前开发线；对齐 Boot 2.x |
| `feature/2.0.x` | 17 | `2.0.x.*` | 对齐 Boot 3.x |
| `feature/3.0.x` | 21 | `3.0.x.*` | 对齐 Boot 4.x |

## 4. Architecture & Modules

```
Application code
        |
        v
+------------------------------------+
| TencentTimTemplate / TencentSms-   |
| Template / TencentLiveTemplate /   |
| TencentTrtcTemplate                |
+------------------------------------+
        |
        v
+------------------------------------+
| Operations (sync + Async)          |
| req/ resp models, UserIdProvider   |
+------------------------------------+
        |
        v
Official SDK: tencentcloud-sdk-java + tls-sig-api-v2 (okhttp)
        |
        v
Tencent Cloud APIs (IM / SMS / Live / TRTC)
```

本工程为单 jar 模块，关键包位于 `com.tencentcloud.sdk`：

| 包 | 职责 |
|:---|:---|
| 根包 | `TencentCloudProperties`、`TencentTimProperties`、`TencentTimConstants`、`TencentSmsProperties`、`TencentLiveProperties`、`TencentTrtcProperties` |
| `tim` | `TencentTimTemplate`、`TencentTim*Operations` / `*AsyncOperations`、`TimApiAddress`、`TimUserIdProvider`、`req/` + `resp/` 模型 |
| `sms` | `TencentSmsTemplate` |
| `live` | `TencentLiveTemplate`、`resp/` 结果与回调模型 |
| `trtc` | `TencentTrtcTemplate`、`TrtcUserIdProvider`、`resp/` 模型 |
| `utils` | 共享工具类 |

## 5. Installation

制品发布到 easy4j 私有仓库与 GitHub Releases，暂未发布 Maven Central。

Maven：

```xml
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>tencentcloud-sdk-extension</artifactId>
    <version>2.0.x.x.20260630-SNAPSHOT</version>
</dependency>
```

Gradle：

```groovy
implementation 'io.github.easy4j:tencentcloud-sdk-extension:2.0.x.x.20260630-SNAPSHOT'
```

## 6. Quick Start

构建 TIM 模板并生成 UserSig：

```java
import com.tencentcloud.sdk.TencentTimProperties;
import com.tencentcloud.sdk.tim.TencentTimTemplate;
import com.tencentcloud.sdk.tim.TimUserIdProvider;
import okhttp3.OkHttpClient;

TencentTimProperties props = new TencentTimProperties();
props.setSdkappid(1400000000L);
props.setIdentifier(TencentTimProperties.ADMINISTRATOR);
props.setPrivateKey("-----BEGIN PRIVATE KEY----- ...");

TimUserIdProvider userIdProvider = new TimUserIdProvider() {
    // 默认实现为 account <-> userId 一一对应；需要时可覆写
};

OkHttpClient okHttpClient = new OkHttpClient();

TencentTimTemplate timTemplate = new TencentTimTemplate(props, okHttpClient, userIdProvider);

String userSig = timTemplate.genUserSig("user-1001");
System.out.println(userSig); // 该 identifier 对应的 base64 UserSig
```

预期结果：模板根据 TIM 属性（`sdkappid` + `privateKey`）初始化 TLS 签名 API，并为指定 identifier 按配置的过期时间生成 UserSig。

## 7. Configuration

属性模型声明了绑定前缀（供 `tencentapi-spring-boot-starter` 的 Spring Boot 自动装配层使用；本模块自身只提供 POJO）：

| 属性类 | 前缀 | 关键字段 |
|:---|:---|:---|
| `TencentCloudProperties` | `tencent.cloud` | 服务开关与共享凭据 |
| `TencentTimProperties` | `tencent.cloud.tim` | `enabled`、`domain`、`identifier`（默认 `administrator`）、`sdkappid`、`privateKey`、`expire`（默认 30 天）、`msgLifeTime` |
| `TencentSmsProperties` | `tencent.cloud.sms` | `enabled`、`secretId`、`secretKey`、`region`、`signMethod`、`httpProfile` |
| `TencentLiveProperties` | `tencent.cloud.live` | `enabled`、`secretId`、`secretKey`、`region`、`signMethod`、`httpProfile` |
| `TencentTrtcProperties` | `tencent.cloud.trtc` | `enabled` 与 TRTC 设置 |

## 8. Core Usage / API

TIM 账号导入与短信发送：

```java
// TIM 账号导入
timTemplate.opsForAccount().aImport("user-1001", "nickname", "https://example.com/avatar.png");

// 短信发送（基于 SmsClient）
import com.tencentcloud.sdk.sms.TencentSmsTemplate;
import com.tencentcloudapi.sms.v20190711.models.SendSmsResponse;

SendSmsResponse smsResp = smsTemplate.send(new String[] { "+8613800000000" }, "1000000", "1234");
```

Live 推流创建：

```java
import com.tencentcloud.sdk.live.TencentLiveTemplate;
import com.tencentcloud.sdk.live.resp.StreamResult;

StreamResult stream = liveTemplate.createStream("user-1001");
```

## 9. Testing & Build

构建：

```bash
./mvnw clean verify
```

- 构建配置了 JaCoCo Maven 插件：覆盖率报告生成于 `target/site/jacoco/index.html`，并配置了 BUNDLE 行覆盖率 90% 的校验规则（`haltOnFailure=false`，即只报告不阻断构建）；
- 当前仓库本模块暂无单元测试（依赖云 API），覆盖率以 JaCoCo 报告为准；
- `central` Maven Profile（`./mvnw -Pcentral deploy`）附加 GPG 签名、源码包与 Javadoc 包用于发布。

## 10. Versioning & Branches

维护三条并行版本线：

| 分支 | JDK | 版本模式 | 对齐 |
|:---|:---|:---|:---|
| `feature/1.0.x` | 8 | `1.0.x.*` | Boot 2.x |
| `feature/2.0.x` | 17 | `2.0.x.*` | Boot 3.x |
| `feature/3.0.x` | 21 | `3.0.x.*` | Boot 4.x |

维护策略：`1.0.x` 为当前活跃开发线（当前快照 `2.0.x.x.20260630-SNAPSHOT`）；`2.0.x` 与 `3.0.x` 为面向更新 JDK 的前向移植线。快照按需构建，正式 Release 通过 GitHub Releases 分发。

## 11. Contributing & License

- Fork 仓库并提交 Pull Request；`1.0.x` 版本线保持 JDK 8 兼容；
- Bug 反馈与功能建议通过 GitHub Issues 跟踪；
- 基于 [Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0) 开源。
