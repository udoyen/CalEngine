package com.connectsystem.organized;

public class MathEquation {

    private double leftVal;
    private double rightVal;
    private char opCode = 'a';
    private double result;

    public MathEquation() {

    }

    public MathEquation(char opCode) {
        this.opCode = opCode;

    }

    public MathEquation(char opCode, double leftVal, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }


    public void execute() {
        switch (getOpCode()) {
            case 'a':
                result = getLeftVal() + getRightVal();
                break;

            case 's':
                result = getLeftVal() - getRightVal();
                break;
            case 'd':
                result = getRightVal() != 0.0d ? getLeftVal() / getRightVal() : 0.0d;
                break;
            case 'm':
                result = getLeftVal() * getRightVal();
                break;
            default:
                System.out.println("Error - Invalid opCode");
                result = 0.0d;
                break;
        }
    }

    public void execute(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();
    }

    public void execute(int leftVal, int rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();

        result = (int) result;
    }


    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public char getOpCode() {
        return opCode;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    public double getResult() {
        return result;
    }
}
