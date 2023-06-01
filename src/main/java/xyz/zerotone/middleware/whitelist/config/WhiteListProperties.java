package xyz.zerotone.middleware.whitelist.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @description:
 * @author：Maloong
 * @date: 2023/5/30
 * @Copyright： 博客：<a href="http://maloong.com">Maloong</a>
 * If you know everyone is different,you will know yourself better!
 */
@ConfigurationProperties("zerotone.whitelist")
public class WhiteListProperties {

    private String users;

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }
}

