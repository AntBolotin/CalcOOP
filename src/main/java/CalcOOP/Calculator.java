package CalcOOP;

import CalcOOP.Operations.Operation;

/**
 * Created by Antony Bolotin on 02.07.2018
 * @author AntBolotin
 */
public class Calculator {

    public static final void main(String[] args) {

/// Вводим числа и тип операциии(+,-,*,/)

        Numbers N = new Numbers(12.321123, 13.421312312313);
        Operation O = new Operation("+");

/// Выводим на консоль числа и результат с 4 символами после запятой, или сообщение об ошибке

        System.out.println("Number 1: " + N.getFirstNumber());
        System.out.println("Number 2: " + N.getSecondNumber());

        if (O.operation.equals("+")) {
            System.out.printf("Result : %.4f", N.getPlus());
        } else if (O.operation.equals("-")) {
            System.out.printf("Result : %.4f", N.getMinus());
        } else if (O.operation.equals("*")) {
            System.out.printf("Result : %.4f", N.getMultipltcation());
        } else if (O.operation.equals("/")){
            System.out.printf("Result : %.4f", N.getDivide());
        } else System.out.println("Incorrect Operation");
    }
}
