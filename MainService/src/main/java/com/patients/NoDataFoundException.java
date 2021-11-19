package com.patients;

public class NoDataFoundException extends RuntimeException {

    public NoDataFoundException() {
        super("No Data Found");
    }
}
