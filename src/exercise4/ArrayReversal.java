package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        char[] symbols = new char[size];
        char[] symbolsReversed = new char[size];
        for (int i = 0; i < size; i++) {
            symbols[i] = input.next().charAt(0);

        }
        int k = 0;
        for(int i = size; i>0;i--){
            symbols[k] = symbolsReversed[i - 1];
            k++;
        }
        String numbersAsString = Arrays.toString(symbolsReversed);
        System.out.println("Numbers: " + numbersAsString);
    }
}
