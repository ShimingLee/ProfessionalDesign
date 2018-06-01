package com.chineseivy.util;



/**
 * Created by admin on 2018/5/10
 */
public class OBeanBase {
    public static final String TRUECODE = "10010";
    public static final String FALSECODE = "10020";
    public static final String CHECKFALSECODE = "10021";
    public static final String DATABASEFALSECODE = "10022";
    private String code;
    private String message;
    private Object datamessage;
    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(Class contents) {
        this.className = contents.getClass().getName();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getDatamessage() {
        return datamessage;
    }

    public void setDatamessage(Object datamessage) {
        this.datamessage = datamessage;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setInfo(String code, String message) {
        this.message = message;
        this.code = code;
    }

    public OBeanBase() {
    }
}
