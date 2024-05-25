package org.kookies.mirai.pojo.entity;

import lombok.Data;
import org.kookies.mirai.pojo.entity.ai.baidu.BaiduApiConfig;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class BotInfo implements Serializable {

    // 机器人生日
    private LocalDate birthday;

    // 机器人名字
    private String name;

    // 百度api配置
    private BaiduApiConfig baiduApiConfig;
}
