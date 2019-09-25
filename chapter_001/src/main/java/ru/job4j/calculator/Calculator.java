/**
 * Package for calculate task.
 * @class Calculator Класс для вычисления арифметических операций "+" "-" "/" "*"
 * @author Mikhail Litovchenko (kapchevich@gmail.com)
 * @version $Id$
 * @since 0.1
 */
package ru.job4j.calculator;

public class Calculator {
    /**
     * @param first первое число, с которым проводим арифметические операции.
     * @param second второе число, с которым проводим арифметические операции.
     */
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + "+" + second + " = " + result);
    }

    /**
     * Складываем два числа и выводим их сумму в консоль.
     */
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + "/" + second + " = " + result);
    }
    /**
     * Делим два числа и выводим их частное в консоль
     */
    public static void multiplay(double first, double second) {
        double result = first * second;
        System.out.println(first + "*" + second + " = " + result);
    }
    /**
     * Умножаем два числа и выводим их произведение в консоль
     */
    public static void subtract(double first, double second) {
        double result = first - second;
        System.out.println(first + "-" + second + " = " + result);
    }
    /**
     * Определяем разность и выводим ее значение в консоль.
     */


    public static void main(String[] args) {
        add(1,1);
        div(4,2);
        multiplay(6,3);
        subtract(10,5);
        /**
         * Вход в программу и передача параметров в методы.
         */

    }
}
