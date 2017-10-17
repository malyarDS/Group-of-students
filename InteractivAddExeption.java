package com_gmail_kr_malyar;

public class InteractivAddExeption extends Exception {
    public String getMessage(){
        return "Something is not entered correctly. Repeat input";
    }
}
