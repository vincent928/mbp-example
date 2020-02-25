package com.moon.mbp.example.generator;

/**
 * @Author : moon
 * @Date : 2020/2/24 17:28
 * @Description :
 */
public class GeneratorCondition {
    //数据库连接url
    private String url;
    //用户名
    private String username;
    //密码
    private String password;
    //作者
    private String author;
    //是否多模块
    private boolean isMultiModule = false;
    //模块名
    private String modelName;
    //项目包名 com.xxx.xxx
    private String parentPackage;
    //是否覆盖
    private boolean isFileOverride = false;
    //是否生成实体类
    private boolean isEntity = true;
    //是否生成mapper
    private boolean isMapper = true;
    //是否生成XML
    private boolean isXml = true;
    //是否生成service
    private boolean isService = true;
    //是否生成impl
    private boolean isServiceImpl = true;
    //是否生成controller
    private boolean isController = true;
    //是否指定绝对路径
    private boolean isRealPath = false;
    //项目绝对路径
    private String realPath;
    //基础父类
    private BaseEntityEnum baseEntity;
    //自定义基础父类路径 com.xxx.xxx.SelfEntity
    private String selfBaseEntityPath;
    //自定义基础父类字段 id,create_time,update_time
    private String[] selfBaseEntityCommon;
    //表前缀
    private String[] tablePre;
    //表名
    private String[] tableName;

    public enum BaseEntityEnum {
        DATE("date"),
        BASIC("basic"),
        LOGIC_DEL("logicDel"),
        SELF("self"),
        ;
        private String baseEntity;

        BaseEntityEnum(String baseEntity) {
            this.baseEntity = baseEntity;
        }

        public String getValue() {
            return baseEntity;
        }
    }


    public boolean getIsRealPath() {
        return isRealPath;
    }

    public void setIsRealPath(boolean realPath) {
        isRealPath = realPath;
    }

    public String getRealPath() {
        return realPath;
    }

    public void setRealPath(String realPath) {
        this.realPath = realPath;
    }

    public boolean getIsMultiModule() {
        return isMultiModule;
    }

    public void setIsMultiModule(boolean multiModule) {
        isMultiModule = multiModule;
    }

    public boolean getIsFileOverride() {
        return isFileOverride;
    }

    public void setIsFileOverride(boolean fileOverride) {
        isFileOverride = fileOverride;
    }

    public boolean getIsEntity() {
        return isEntity;
    }

    public void setIsEntity(boolean entity) {
        isEntity = entity;
    }

    public boolean getIsMapper() {
        return isMapper;
    }

    public void setIsMapper(boolean mapper) {
        isMapper = mapper;
    }

    public boolean getIsXml() {
        return isXml;
    }

    public void setIsXml(boolean xml) {
        isXml = xml;
    }

    public boolean getIsService() {
        return isService;
    }

    public void setIsService(boolean service) {
        isService = service;
    }

    public boolean getIsServiceImpl() {
        return isServiceImpl;
    }

    public void setIsServiceImpl(boolean serviceImpl) {
        isServiceImpl = serviceImpl;
    }

    public boolean getIsController() {
        return isController;
    }

    public void setIsController(boolean controller) {
        isController = controller;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getParentPackage() {
        return parentPackage;
    }

    public void setParentPackage(String parentPackage) {
        this.parentPackage = parentPackage;
    }

    public BaseEntityEnum getBaseEntity() {
        return baseEntity;
    }

    public void setBaseEntity(BaseEntityEnum baseEntity) {
        this.baseEntity = baseEntity;
    }

    public String getSelfBaseEntityPath() {
        return selfBaseEntityPath;
    }

    public void setSelfBaseEntityPath(String selfBaseEntityPath) {
        this.selfBaseEntityPath = selfBaseEntityPath;
    }

    public String[] getSelfBaseEntityCommon() {
        return selfBaseEntityCommon;
    }

    public void setSelfBaseEntityCommon(String[] selfBaseEntityCommon) {
        this.selfBaseEntityCommon = selfBaseEntityCommon;
    }

    public String[] getTablePre() {
        return tablePre;
    }

    public void setTablePre(String[] tablePre) {
        this.tablePre = tablePre;
    }

    public String[] getTableName() {
        return tableName;
    }

    public void setTableName(String[] tableName) {
        this.tableName = tableName;
    }
}
