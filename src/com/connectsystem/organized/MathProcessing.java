package com.connectsystem.organized;

public interface MathProcessing {

    String SEPARATOR = " ";
    String getKeyword(); //add
    char getSymbol(); //+
    double doCalculation(double leftVal, double rightVal);
}
