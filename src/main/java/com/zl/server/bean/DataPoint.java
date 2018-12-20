package com.zl.server.bean;

/**
 * @Author: wtao
 * @Date: 2018-12-20 21:21
 * @Version 1.0
 */
public class DataPoint {
    private int id;
    private DataModel dataModel;
    private String pointName;
    private String dataType;
    private String registerAdr;
    private String valueType;
    private String decimalLen;
    private String readType;
    private String registerLen;
    private String unit;
    private String formula;
    private String storageType;
    private int delFlag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DataModel getDataModel() {
        return dataModel;
    }

    public void setDataModel(DataModel dataModel) {
        this.dataModel = dataModel;
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getRegisterAdr() {
        return registerAdr;
    }

    public void setRegisterAdr(String registerAdr) {
        this.registerAdr = registerAdr;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public String getDecimalLen() {
        return decimalLen;
    }

    public void setDecimalLen(String decimalLen) {
        this.decimalLen = decimalLen;
    }

    public String getReadType() {
        return readType;
    }

    public void setReadType(String readType) {
        this.readType = readType;
    }

    public String getRegisterLen() {
        return registerLen;
    }

    public void setRegisterLen(String registerLen) {
        this.registerLen = registerLen;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public int getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(int delFlag) {
        this.delFlag = delFlag;
    }
}
