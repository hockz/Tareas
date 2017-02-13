
package tarea2;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Tarea2 {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        int numeros = 0;
        int check;
        int even = 0;
        int odd = 0;
        System.out.println("Type numbers: ");
        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == -1) {
                break;
            }
            check = read%2;
            if(check==0){
                even++;
            }
            else if(check!=0){
                odd++;
            }
            numeros++;
            sum = sum + read;
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is: " + sum);
        System.out.println("How many numers: " + numeros);
        double average=(sum/numeros);
        System.out.println("Average: " + average);
        System.out.println("Even Numbers: " + even);
        System.out.println("Odd Numbers: " + odd);
    }
}
