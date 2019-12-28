package baza;

import java.util.Arrays;

public class MinAndMax {
    public void maxMinAvr(double[] array) {
        double max = array[0];
        double min = array[0];
        double avr = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
            avr += array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(String.format("Max: %f", max));
        System.out.println(String.format("Min: %f", min));
        System.out.println(avr / array.length);
    }

    public static void main(String[] args) {
        MinAndMax minAndMax = new MinAndMax();
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        minAndMax.maxMinAvr(array);
        System.out.println(minAndMax);
    }
}
