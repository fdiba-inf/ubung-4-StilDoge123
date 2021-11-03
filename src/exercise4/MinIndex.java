package exercise4;
import java.util.Scanner;
import java.util.Arrays;
public class MinIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        float[] numbers = new float[size];
        float min = 9999999;
        int minIndex = 0;
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextFloat();
            if(numbers[i]<min){
                min = numbers[i];
                minIndex = i;
            }
        }
        System.out.println("Min index: " + minIndex);
    }
}
