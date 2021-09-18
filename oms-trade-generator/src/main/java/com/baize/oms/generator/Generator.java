package com.baize.oms.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baize.sca.common.generator.Config;
import com.baize.sca.common.generator.GenerateUtils;

public class Generator {

    public static void main(String[] args) {
        String tableName = "order_trade";
        String tablePrefix = "";
        Config config = new Config();
        config.setDbType(DbType.MYSQL);
        config.setDriver("com.mysql.jdbc.Driver");
        config.setDbUrl("jdbc:mysql://10.100.33.41:3306/oms_0?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC");
        config.setUsername("openmall");
        config.setPassword("123");
        config.setAuthor("quleiming");
        config.setParentName("com.baize.oms");
        config.setModuleName("oms-trade");
        config.setProjectPath("D:/IdeaProjects/oms/oms-trade");
        config.setApplicationName("oms-trade");
        config.setContextPath("");
        //是否覆盖生产文件，默认false
        config.setFileOverride(false);
        GenerateUtils.autoGenerator(tableName, tablePrefix, config);
    }
}
