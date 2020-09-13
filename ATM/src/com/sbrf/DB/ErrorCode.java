package com.sbrf.DB;

public enum ErrorCode {

    NoAccessDevice(0, "No such device");

    private final int code;
    private final String description;

    private ErrorCode(int Code, String Description) {
        code = Code;
        description = Description;
    }

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return description;
    }
}
