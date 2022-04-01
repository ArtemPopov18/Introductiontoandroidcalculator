package com.popov.introductiontoandroidalculator;

import java.io.Serializable;

public class Calculator implements Serializable {

    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        if (number1.equals("del")) {
            this.number1 = "";
        } else {
            this.number1 = getNumber1() + number1;
        }
    }

    public String getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        if (number2.equals("del")) {
            this.number2 = "";
        } else {
            this.number2 = getNumber2() + number2;
        }
    }

    private String number1 = "";
    private String number2 = "";

    public String getNumber3() {
        return number3;
    }

    public void setNumber3(String number3) {
        this.number3 = number3;
    }

    private String number3;

    public void setEquals(int equals) {
        this.equals = equals;
    }

    public int getEquals() {
        return equals;
    }

    private int equals;

    public int getSign() {
        return sign;
    }

    public void setSign(int sign) {
        this.sign = sign;
    }

    private int sign = 0;

    public void operationsOfArithmetic() {
        switch (getSign()) {
            case (1):
                setEquals(Integer.parseInt(getNumber1()) + Integer.parseInt(getNumber2()));
                setNumber3(Integer.toString(getEquals()));
                setNumber3(getNumber1() + "\n+\n" + getNumber2() + "\n=\n" + getNumber3());
                break;
            case (2):
                setEquals(Integer.parseInt(getNumber1()) - Integer.parseInt(getNumber2()));
                setNumber3(Integer.toString(getEquals()));
                setNumber3(getNumber1() + "\n-\n" + getNumber2() + "\n=\n" + getNumber3());
                break;
            case (3):
                setEquals(Integer.parseInt(getNumber1()) * Integer.parseInt(getNumber2()));
                setNumber3(Integer.toString(getEquals()));
                setNumber3(getNumber1() + "\n*\n" + getNumber2() + "\n=\n" + getNumber3());
                break;
            case (4):
                setEquals(Integer.parseInt(getNumber1()) / Integer.parseInt(getNumber2()));
                setNumber3(Integer.toString(getEquals()));
                setNumber3(getNumber1() + "\n÷\n" + getNumber2() + "\n=\n" + getNumber3());
                break;
            default:
                break;
        }


    }

    public void initialization(String number) {

        switch (getSign()) {
            case (1):
                setNumber2(number);
                setNumber3(getNumber1() + "\n+\n" + getNumber2());
                break;
            case (2):
                setNumber2(number);
                setNumber3(getNumber1() + "\n-\n" + getNumber2());
                break;
            case (3):
                setNumber2(number);
                setNumber3(getNumber1() + "\n*\n" + getNumber2());
                break;
            case (4):
                setNumber2(number);
                setNumber3(getNumber1() + "\n÷\n" + getNumber2());
                break;
            case (0):
                setNumber1(number);
                setNumber3(getNumber1());
                break;
        }


    }

}
