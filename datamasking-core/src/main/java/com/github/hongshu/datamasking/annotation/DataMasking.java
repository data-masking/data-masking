package com.github.hongshu.datamasking.annotation;


import cn.hutool.core.util.DesensitizedUtil;

import java.lang.annotation.*;

/**
 * 数据脱敏
 */
@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataMasking {


    /**
     * desc  脱敏开关，可以控制类、变量
     * 2023/8/11 9:19
     * @return st
     */
    boolean enabled() default true;


    /**
     * 开始位置（包含）
     * @return st
     */
    int startInclude() default 1;

    /**
     * 结束位置（不包含）
     * 默认字符串长度
     * @return st
     */
    int endExclude() default Integer.MAX_VALUE;

    /**
     * 被替换的字符
     * 字符串长度为1时，等量替换，如： abcedfg : a******
     * 长度大于1时，非等量替换字字符串，如： masking=**  结果 abcedfg : a**
     * @return st
     */
    String masking() default "*";

    /**
     * 数据脱敏策略，默认直接替换
     * @return st
     */
    DesensitizedUtil.DesensitizedType strategy() default DesensitizedUtil.DesensitizedType.FIRST_MASK;

    /**
     * 当父类上有脱敏标识时，父类下的属性是否脱敏，默认脱敏
     * @return st
     */
    boolean inherit() default true;

    /**
     * 脱敏百分比
     * @return st
     */
    float maskingPercent() default 0.0F;


}
