package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class MaxElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        double[] numbers = new double[size];
        double max = -123456789;
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextDouble();
        }
        for (int i = 0; i < size; i++) {
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println("Max number: " + max);
    }
}
