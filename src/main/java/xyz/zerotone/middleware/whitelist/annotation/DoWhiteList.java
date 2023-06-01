package xyz.zerotone.middleware.whitelist.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @description:
 * @author：Maloong
 * @date: 2023/5/30
 * @Copyright： 博客：<a href="http://maloong.com">Maloong</a>
 * If you know everyone is different,you will know yourself better!
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoWhiteList {

    String key() default "";

    String returnJson() default "";

}
