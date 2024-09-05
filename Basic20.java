import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Number:");
        int num = sc.nextInt();
        
        int[] bin = new int[32]; // Assuming a maximum of 32 bits for the binary representation
        
        int i = 0;
        
        while (num > 0) {
            bin[i] = num % 2;
            num = num / 2;
            i++;
        }
        
        System.out.print("Binary representation: ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(bin[j]);
        }
        System.out.println();
    }
}
