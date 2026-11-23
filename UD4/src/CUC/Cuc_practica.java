
package CUC;


import java.util.ArrayList;


public class Cuc_practica {
    static final int NTAULER = UtilitatsConsola.llegirSencer("Mida del tauler: ");
    static final int NFULLES = UtilitatsConsola.llegirSencer("Numero de fulles: ");
    static final int SIMBOL_BUIT = 0;
    static final int SIMBOL_FULLA = 9;
    static final int SIMBOL_CUC = 1;
    static final int SIMBOL_CAPCUC = 2;


   
    public static void main(String[] args) {
        int[][] tauler= new int [NTAULER][NTAULER];
        ArrayList<int[]> fulles = new ArrayList<>();
        ArrayList<int[]> cuc = new ArrayList<>();
      
        
    
    inicializaJoc(tauler,cuc,fulles);
    mostraTauler(tauler,cuc,fulles);
    }
    
    
    
    
    public static void inicializaJoc(int [][]tauler,ArrayList<int[]> cuc,ArrayList<int[]>fulles){
       int [] pos= UtilitatsArrays.generaArray(2, 0, NTAULER-1);
       cuc.add(pos);   
       tauler[pos[0]][pos[1]]=SIMBOL_CUC;
       
       for(int i =0;i<=NFULLES;i++){
       do {          
           pos= UtilitatsArrays.generaArray(2, 0, NTAULER-1);
      
        }while(tauler[pos[0]][pos[1]]!=SIMBOL_BUIT );
         fulles.add(pos);  
         tauler[pos[0]][pos[1]]= SIMBOL_FULLA;  
       }
        
       
    }
    public static void mostraTauler(int [][]tauler,ArrayList<int[]> cuc,ArrayList<int[]>fulles){
        String car=" ";
        for(int i =0;i< NTAULER;i++){
            System.out.print("|");
            for (int j=0; j<NTAULER;j++){
                switch (tauler[i][j]) {
                    case SIMBOL_BUIT -> car = "   ";
                    case SIMBOL_CUC -> car = " O ";
                    case SIMBOL_FULLA -> car = " * ";
                }
                System.out.print(car);           
            }
            System.out.println("|");
        }
            
    }
    
    public static void canviaosicion(int [][]tauler,ArrayList<int[]> cuc,ArrayList<int[]>fulles){
    }
}
