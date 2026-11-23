package ACT3_4;
import java.util.Scanner;

public class ACT3_4_4 {

   
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int n;
         int m;
         int [][] matriz;
         int [] filas ={1,2};
         
        
         
        System.out.println("numero de filas :");
        n= leer.nextInt();
        
        System.out.println("numero de columnas :");
        m=leer.nextInt();
        
        matriz= new int [n][m];
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
        
            System.out.println("introduce un valor :");
                matriz[i][j]=leer.nextInt();
            }
        }
        
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
            
                System.out.print(matriz[i][j]+ "-");
            }
            System.out.println("");
        }
        
         System.out.println("la linea 1");
        
        
        for(int i =0;i<filas.length;i++){  //1,2
            for(int j=0; j<matriz[i].length;j++)       
                System.out.print(matriz[filas[i]][j]+"-");
        }
    }

}
