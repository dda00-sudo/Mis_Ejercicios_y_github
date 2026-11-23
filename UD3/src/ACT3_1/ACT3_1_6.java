package ACT3_1;

import java.util.Scanner;

public class ACT3_1_6 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        
        System.out.println("introduce numero: ");
        int num1 = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++){
            System.out.println(i+"x"+num1+"="+i * num1);
        
        }
       
    }

}
