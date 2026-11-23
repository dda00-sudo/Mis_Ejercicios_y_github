package ACT3_3;
import java.util.Scanner;

public class ACT3_3_5 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int m;
        int n;
        int[][] matriz;
        int suma=0;
        int max=0;
        
        System.out.println("escribe las medidas de la matriz :");
        n = leer.nextInt();
   
        System.out.println("escribe las medidas de la matriz :");
        m = leer.nextInt();
        matriz = new int [n][m];
        
        
        for( int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.println("introduce un numero :");
                matriz[i][j]= leer.nextInt();                              
            }
        }
        System.out.println("el resultado es: ");   
        for( int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
            System.out.print(matriz[i][j]+" ");
            }
             System.out.println("");
        }
        
        for(int[]fila:matriz)
            for(int columna:fila){  
            suma=suma+columna;//suma de todos los números
            
                if(columna>max)  //número maximo
                    max=columna;
                
            }
        System.out.println("la suma de todos los números"+suma);
        System.out.println("numero max es :"+ max);
      
    }

}
