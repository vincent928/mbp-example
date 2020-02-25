package com.moon.mbp.example;

import com.moon.mbp.example.generator.Generator;
import com.moon.mbp.example.generator.GeneratorCondition;

/**
 * @Author : moon
 * @Date : 2020/2/25 9:52
 * @Description :
 */
public class Application extends Generator {

    private static String AUTHOR = "moon";
    private static String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/my-blog?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=GMT%2B8&zeroDateTimeBehavior=CONVERT_TO_NULL&allowMultiQueries=true";
    private static String USER_NAME = "root";
    private static String PASS_WORD = "123456";
    private static String PACKAGE_PATH = "com.moon.mbp.example";

    private static String[] TABLE_NAME = {"test"};

//    public static void main(String[] args) {
//        //该项目下生成
//        GeneratorCondition condition = new GeneratorCondition();
//        //author
//        condition.setAuthor(AUTHOR);
//        //jdbc
//        condition.setUrl(JDBC_URL);
//        condition.setUsername(USER_NAME);
//        condition.setPassword(PASS_WORD);
//        //是否覆盖
//        condition.setIsFileOverride(Boolean.TRUE);
//        //设置生成文件
//        condition.setParentPackage(PACKAGE_PATH);
//        condition.setIsController(Boolean.FALSE);
//        condition.setIsEntity(Boolean.TRUE);
//        condition.setIsService(Boolean.TRUE);
//        condition.setIsServiceImpl(Boolean.TRUE);
//        condition.setIsMapper(Boolean.TRUE);
//        condition.setIsXml(Boolean.TRUE);
//        condition.setTableName(TABLE_NAME);
//
//        condition.setBaseEntity("self");
//        condition.setSelfBaseEntityPath("com.moon.mbp.example.bean.BasicEntity");
//        String[] selfEntity = {"create_time", "update_time", "is_del"};
//        condition.setSelfBaseEntityCommon(selfEntity);
//        generator(condition);
//    }

    public static void main(String[] args) {
        //绝对地址生成
        GeneratorCondition realPathCondition = new GeneratorCondition();
        realPathCondition.setAuthor("moon");
        realPathCondition.setUrl(JDBC_URL);
        realPathCondition.setUsername(USER_NAME);
        realPathCondition.setPassword(PASS_WORD);
        realPathCondition.setIsFileOverride(Boolean.TRUE);
        realPathCondition.setParentPackage(PACKAGE_PATH);
        realPathCondition.setIsController(Boolean.FALSE);
        realPathCondition.setIsEntity(Boolean.TRUE);
        realPathCondition.setIsService(Boolean.TRUE);
        realPathCondition.setIsServiceImpl(Boolean.TRUE);
        realPathCondition.setIsXml(Boolean.TRUE);
        realPathCondition.setIsMapper(Boolean.TRUE);
        realPathCondition.setTableName(TABLE_NAME);

        realPathCondition.setBaseEntity(GeneratorCondition.BaseEntityEnum.SELF);
        realPathCondition.setSelfBaseEntityPath("com.moon.mbp.example.bean.BasicEntity");
        String[] selfEntity = {"create_time", "update_time", "is_del"};
        realPathCondition.setSelfBaseEntityCommon(selfEntity);
        //指定项目地址
        realPathCondition.setIsRealPath(Boolean.TRUE);
        realPathCondition.setRealPath("H:\\demo\\mbp-example");
        generator(realPathCondition);
    }
}
