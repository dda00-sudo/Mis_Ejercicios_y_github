package ACT3_4;

import java.util.Scanner;
import java.util.Random;

public class ACT3_4_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();
        int n;
        int m;
        int[][] matriz;

        System.out.println("Escribe numero filas :");
        n = leer.nextInt();

        System.out.println("Escribe numero columnas :");
        m = leer.nextInt();

        matriz = new int[n][m];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.println("introduce los valores ");
                //matriz[i][j] = leer.nextInt();
                matriz[i][j] = rand.nextInt(9)+1;
            }
        }

        System.out.println("matriz resultante ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + "-");
            }
            System.out.println("");
        }
        
        for (int j = 0; j < matriz[1].length; j++) {// imprime toda la linea 1            
            System.out.print(matriz[0][j] + "");
        }
        System.out.println(" <-- esta es la fila uno");
        
        
        for (int j = 0; j < matriz[0].length; j++) {// imprime toda la linea 4            
            System.out.print(matriz[3][j]+"");
        }
        System.out.println(" <-- esta es la fila cuatro");
        
        for (int i = 0; i<n; i++) {                 //diagonala[0][0],[1][1]...      
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println(" <-diagonales ");
        
        
        for (int i = n-1,j=0; i>=0; i--,j++) {    //diagonala[4][0],[3][1],[2][2]....
           System.out.print(matriz[i][j] + " ");
        }    
        System.out.println(" <-diagonales ");
        
        int j= 2;
            for (int i =0; i<=n-1; i++) {    //Columna
           System.out.print(matriz[i][j] + " ");
        }    
        System.out.println( " <-columna "+(j+1));
        
    }
}
