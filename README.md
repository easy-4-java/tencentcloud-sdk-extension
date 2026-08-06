# tencentcloud-sdk-extension

[English](./README.md) | [简体中文](./README.zh-CN.md)

## Table of Contents

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

`tencentcloud-sdk-extension` is a pure-Java extension layer on top of the official Tencent Cloud SDKs, independent of Spring Boot. It hosts models, templates and utility classes for Tencent services: IM (TIM) operations and UserSig generation, TRTC room/stream operations, SMS sending and Live stream/mix-stream operations. All cloud API calls go through the official `tencentcloud-sdk-java` and `tls-sig-api-v2`; this module adds the convenient typed templates and property models around them.

It is an `*-extension` module, not a self-developed `*-java-sdk`. The `tencentapi-spring-boot-starter` project is the Spring Boot auto-configuration layer that builds on this module.

Typical scenarios:

| Scenario | What this module contributes |
|:---|:---|
| IM (TIM) account/group/profile/sns/openim operations | `TencentTimTemplate` + `TencentTim*Operations` (sync and `*AsyncOperations`) |
| TIM UserSig generation | `TencentTimTemplate#genUserSig(identifier[, expire])` |
| SMS sending | `TencentSmsTemplate#send(phoneNumbers, templateID, templateParams)` |
| Live stream / mix-stream management | `TencentLiveTemplate` (`createStream`, `createMixStream`, `stopMixStream`, ...) |
| TRTC room management | `TencentTrtcTemplate` (`kickout`, `dismissRoom`, `createMixStream`, `outputParams`, ...) |
| User ID mapping | `TimUserIdProvider` / `TrtcUserIdProvider` |

## 2. Features & Status

Project status: pre-release development line (`1.0.x.*` snapshots); public API is still stabilizing until the first tagged release.

| Capability | Status | Notes |
|:---|:---|:---|
| TIM template | Stable | `TencentTimTemplate` — `opsForAccount`, `opsForPush`, `opsForGroup`, `opsForNoSpeaking`, `opsForOpenim`, `opsForProfile`, `opsForSns`, `genUserSig` |
| TIM account operations | Stable | `TencentTimAccountOperations` — `aImport`, `delete`, `check`, `kickout`, `getState` (async variant available) |
| TIM group operations | Stable | `TencentTimGroupOperations` (+ `Async`) |
| TIM other domains | Stable | push (`AllMemberPush`), no-speaking, openim, profile, sns, ops — sync + async variants |
| TIM models | Stable | `req/` and `resp/` request/response models, `TimApiAddress`, `TimUserIdProvider` |
| SMS template | Stable | `TencentSmsTemplate#send(...)` returning `SendSmsResponse` |
| Live template | Stable | `TencentLiveTemplate` — `createStream`, `createStreamByStreamName`, `createMixStream`, `stopMixStream`; callback models (`StreamStateChangeMsg`, `StreamRecordingMsg`, `StreamSnapshotMsg`, `StreamAppraisalMsg`) |
| TRTC template | Stable | `TencentTrtcTemplate` — `kickout`, `dismissRoom`, `outputParams`, `createMixStream`; `TrtcUserIdProvider` |
| Property models | Stable | `TencentCloudProperties` + per-service properties (TIM, SMS, Live, TRTC) with `tencent.cloud.*` prefixes |

## 3. Requirements & Compatibility

| Requirement | Version |
|:---|:---|
| JDK | 8+ |
| Maven | 3.6+ |
| Tencent Cloud SDK | official `tencentcloud-sdk-java` (declared in the POM) |
| TLS Sig | `tls-sig-api-v2` (UserSig generation) |
| HTTP client | okhttp (declared in the POM) |
| Other runtime deps | guava, commons-lang3 |

Version lines:

| Branch | JDK | Version pattern | Notes |
|:---|:---|:---|:---|
| `feature/1.0.x` | 8 | `1.0.x.*` | Current line; aligned with Boot 2.x |
| `feature/2.0.x` | 17 | `2.0.x.*` | Aligned with Boot 3.x |
| `feature/3.0.x` | 21 | `3.0.x.*` | Aligned with Boot 4.x |

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

The project is a single jar module. Key packages under `com.tencentcloud.sdk`:

| Package | Responsibility |
|:---|:---|
| root | `TencentCloudProperties`, `TencentTimProperties`, `TencentTimConstants`, `TencentSmsProperties`, `TencentLiveProperties`, `TencentTrtcProperties` |
| `tim` | `TencentTimTemplate`, `TencentTim*Operations` / `*AsyncOperations`, `TimApiAddress`, `TimUserIdProvider`, `req/` + `resp/` models |
| `sms` | `TencentSmsTemplate` |
| `live` | `TencentLiveTemplate`, `resp/` result + callback models |
| `trtc` | `TencentTrtcTemplate`, `TrtcUserIdProvider`, `resp/` models |
| `utils` | shared utilities |

## 5. Installation

Artifacts are published to the easy4j private repository and GitHub Releases; the project is not yet on Maven Central.

Maven:

```xml
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>tencentcloud-sdk-extension</artifactId>
    <version>1.0.x.20260630-SNAPSHOT</version>
</dependency>
```

Gradle:

```groovy
implementation 'io.github.easy4j:tencentcloud-sdk-extension:1.0.x.20260630-SNAPSHOT'
```

## 6. Quick Start

Build the TIM template and generate a UserSig:

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
    // default implementations map account <-> userId 1:1; override when needed
};

OkHttpClient okHttpClient = new OkHttpClient();

TencentTimTemplate timTemplate = new TencentTimTemplate(props, okHttpClient, userIdProvider);

String userSig = timTemplate.genUserSig("user-1001");
System.out.println(userSig); // base64 UserSig for the identifier
```

Expected result: the template initializes the TLS signature API from the TIM properties (`sdkappid` + `privateKey`) and returns a UserSig for the given identifier with the configured expiry.

## 7. Configuration

The property models declare binding prefixes (used by the Spring Boot auto-configuration layer in `tencentapi-spring-boot-starter`; this module itself only provides the POJOs):

| Property class | Prefix | Key fields |
|:---|:---|:---|
| `TencentCloudProperties` | `tencent.cloud` | service enablement and shared credentials |
| `TencentTimProperties` | `tencent.cloud.tim` | `enabled`, `domain`, `identifier` (default `administrator`), `sdkappid`, `privateKey`, `expire` (default 30 days), `msgLifeTime` |
| `TencentSmsProperties` | `tencent.cloud.sms` | `enabled`, `secretId`, `secretKey`, `region`, `signMethod`, `httpProfile` |
| `TencentLiveProperties` | `tencent.cloud.live` | `enabled`, `secretId`, `secretKey`, `region`, `signMethod`, `httpProfile` |
| `TencentTrtcProperties` | `tencent.cloud.trtc` | `enabled` and TRTC settings |

## 8. Core Usage / API

TIM account import and SMS sending:

```java
// TIM account import
timTemplate.opsForAccount().aImport("user-1001", "nickname", "https://example.com/avatar.png");

// SMS sending (SmsClient-based)
import com.tencentcloud.sdk.sms.TencentSmsTemplate;
import com.tencentcloudapi.sms.v20190711.models.SendSmsResponse;

SendSmsResponse smsResp = smsTemplate.send(new String[] { "+8613800000000" }, "1000000", "1234");
```

Live stream creation:

```java
import com.tencentcloud.sdk.live.TencentLiveTemplate;
import com.tencentcloud.sdk.live.resp.StreamResult;

StreamResult stream = liveTemplate.createStream("user-1001");
```

## 9. Testing & Build

Build:

```bash
./mvnw clean verify
```

- The build is configured with the JaCoCo Maven plugin: a coverage report is generated at `target/site/jacoco/index.html` and a rule checks the bundle line coverage against a 90% minimum (`haltOnFailure=false`, so the check reports but does not fail the build).
- The repository currently ships no unit tests for this module (cloud-API dependent); coverage is tracked via the JaCoCo report.
- The `central` Maven profile (`./mvnw -Pcentral deploy`) attaches GPG signatures, sources and Javadoc jars for publishing.

## 10. Versioning & Branches

Three parallel version lines are maintained:

| Branch | JDK | Version pattern | Aligned with |
|:---|:---|:---|:---|
| `feature/1.0.x` | 8 | `1.0.x.*` | Boot 2.x |
| `feature/2.0.x` | 17 | `2.0.x.*` | Boot 3.x |
| `feature/3.0.x` | 21 | `3.0.x.*` | Boot 4.x |

Maintenance policy: the `1.0.x` line is the actively developed line (current snapshot `1.0.x.20260630-SNAPSHOT`); `2.0.x` and `3.0.x` are forward porting lines targeting newer JDKs. Snapshots are built on demand; tagged releases are distributed via GitHub Releases.

## 11. Contributing & License

- Fork the repository and open a pull request; keep the `1.0.x` line compatible with JDK 8.
- Bug reports and feature requests are tracked via GitHub Issues.
- Licensed under the [Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0).
