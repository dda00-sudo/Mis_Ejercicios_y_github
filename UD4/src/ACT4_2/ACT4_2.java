package ACT4_2;
public class ACT4_2 {

   
    public static void main(String[] args) {

        int[][] matriz = UtilitatsMatrius.generaMatriu(10, 100, 200);
        
        UtilitatsMatrius.mostrarMatriu(matriz);
        
        int[] diagonal =  UtilitatsMatrius.generaDiagonalPrincipal(matriz);

        UtilitatsArrays.mostraArray(diagonal);
        
        
    }
    

}
