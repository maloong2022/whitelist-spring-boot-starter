package xyz.zerotone.middleware.whitelist.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xyz.zerotone.middleware.DoJoinPoint;

/**
 * @description:
 * @author：Maloong
 * @date: 2023/5/30
 * @Copyright： 博客：<a href="http://maloong.com">Maloong</a>
 * If you know everyone is different,you will know yourself better!
 */
@Configuration
@ConditionalOnClass(WhiteListProperties.class)
@EnableConfigurationProperties(WhiteListProperties.class)
public class WhiteListAutoConfigure {

    @Bean("whiteListConfig")
    @ConditionalOnMissingBean
    public String whiteListConfig(WhiteListProperties properties) {
        return properties.getUsers();
    }

    // 手动Bean，这样其他的项目引用不需要扫描切面类，完成注册
    @Bean
    public DoJoinPoint doJoinPoint() {
        return new DoJoinPoint();
    }
}
