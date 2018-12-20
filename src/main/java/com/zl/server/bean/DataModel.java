package com.zl.server.bean;

/**
 * @Author: wtao
 * @Date: 2018-12-20 20:06
 * @Version 1.0
 */
public class DataModel {

    private int id;
    private String modelName;
    private int delFlag;
    private int relationCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(int delFlag) {
        this.delFlag = delFlag;
    }

    public int getRelationCount() {
        return relationCount;
    }

    public void setRelationCount(int relationCount) {
        this.relationCount = relationCount;
    }
}
