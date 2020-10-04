package com.sbrf.DB;


public class ErrorMessages extends RuntimeException{

    public ErrorMessages(ErrorCode errorCode){
        super(errorCode.NoAccessDevice.toString());
    }

}
