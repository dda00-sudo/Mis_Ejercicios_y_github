package ACT3_1;


import java.util.Scanner;

public class ACT3_1_4 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Introduce nota: ");
        int num1 = scanner.nextInt();
        
    if ( num1 >= 9){
        System.out.println("Sobresaliente");
    }
        else if ( num1 >= 7){
        System.out.println("Notable");
    }
       else if ( num1 == 6){
        System.out.println("Bien");
    }
       else if ( num1 ==5){
        System.out.println("Aprobado");
       }
       else if (num1 >3){
        System.out.println("Insuficiente");
       }
       else if (num1 >=0){
        System.out.println(" Muy deficiente");
       }
       
    }
    
}
