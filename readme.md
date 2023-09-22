### 数据脱敏

#### 📋 简介

该boot组件利用<code>ResponseBodyAdvice</code>机制，结合<code>Jackson</code>的<code>ObjectMapper</code>
的`BeanPropertyDefinition`相关属性开发数据脱敏功能.根据`DataMasking`注解，可以实现如下功能：

- 对象下全属性脱敏，包含`Map`,`List`（支持`JSON`）等。

- 对象下某一属性脱敏

- 脱敏策略支持身份证、用户ID、手机号、地址、IP、电子邮件等、，具体可以参考`HuTool`中的`DesensitizedUtil.DesensitizedType`脱敏类型

  - 详细支持的策略

    ```java
    用户id、中文名、身份证号、座机号、手机号、地址、电子邮件、密码、中国大陆车牌，包含普通车辆、新能源车辆、 银行卡、IPv4地址、IPv6地址
    ```

除了以上策略，组件还支持按比例脱敏、按时间唯度脱敏等多维度脱敏方案（持续开发）

#### ☞脱敏结果示例

```json
{
  "certification": "0",
  "areaCode": "",
  "phone": "139****6180",
  "name": "台州市*** ***有限公司",
  "productionLineList": [
    {
      "foundTime": "*** ***",
      "modelFrame": "*** ***",
      "productTypeIds": "3",
      "pressMachineModel": "*** ***",
      "useEquipment": "*** ***",
      "name": "1号*** ***",
      "productTypeNames": "*** ***",
      "pressMachineNum": "*** ***",
      "productOutput": "*** ***"
    }
  ]
}
```

#### ✈ 使用教程

[使用教程](https://data-masking.gitee.io/)

#### 💪支持作者

<img src="docs/images/wx_pay.jpg" alt="wx" style="zoom:20%;" width="128em" height="177em" />

✔☜☝☜☝☞☄♨☎📋👩‍👦‍👦💗💪



