
package CUC;


import java.util.*;


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
        boolean gameOver=false;
        int accio;
        
    
    inicializaJoc(tauler,cuc,fulles);
    
    
    do{
        mostraTauler(tauler,cuc,fulles);
        accio = UtilitatsConsola.llegirSencer(" | 8:ALT, 4:ESQUERRA, 6:DRETA, 2:BAIX; 0:SORTIR: ");
        if(accio == 0)
            break;
        gameOver=canviaPosicion(tauler,cuc,fulles,accio);
        
        
        if (gameOver ){
            System.out.println("has perdido"); 
            break;
        }else if(fulles.isEmpty()){
            System.out.println("has ganado");
            break;
        }
        
    }while(accio!=0);
     
    }
   
    public static void inicializaJoc(int [][]tauler,ArrayList<int[]> cuc,ArrayList<int[]>fulles){
       int [] pos= UtilitatsArrays.generaArray(2, 0, NTAULER-1);
       cuc.add(pos);   
       tauler[pos[0]][pos[1]]=SIMBOL_CAPCUC;
       
       for(int i =0;i<NFULLES;i++){
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
                    case SIMBOL_CUC -> car = " - ";
                    case SIMBOL_FULLA -> car = " * ";
                    case SIMBOL_CAPCUC -> car = " 0 ";
                }
                System.out.print(car);           
            }
            System.out.println("|");
        }
            
    }
    
    public static boolean canviaPosicion(int [][]tauler,ArrayList<int[]> cuc,ArrayList<int[]>fulles,int accio){
       
        int [] capCuc= new int []{cuc.get(cuc.size()-1)[0],
                                cuc.get(cuc.size()-1)[1]};
        
       tauler[capCuc[0]][capCuc[1]] = SIMBOL_CUC;
       switch (accio) {
            case 4 -> capCuc[1] = (capCuc[1] == 0 ? NTAULER-1 : --capCuc[1]); // ESQ
            case 6 -> capCuc[1] = (capCuc[1] == NTAULER-1 ? 0 : ++capCuc[1]); // DRETA
            case 8 -> capCuc[0] = (capCuc[0] == 0 ? NTAULER-1 : --capCuc[0]); // ALT
            case 2 -> capCuc[0] = (capCuc[0] == NTAULER-1 ? 0 : ++capCuc[0]); //BAIX
        }
       
       //si como hoja
       if(tauler[capCuc[0]][capCuc[1]] == SIMBOL_FULLA){
           cuc.add(capCuc);
           tauler[capCuc[0]][capCuc[1]] = SIMBOL_CAPCUC;
           
           for (int i = 0; i< fulles.size();i++){
               if(Arrays.equals(capCuc,fulles.get(i))){
                    fulles.remove(i);                       
               }           
           }    
          return false;
       } //choca con sigo mismo
       else if(tauler[capCuc[0]][capCuc[1]] == SIMBOL_CUC||tauler[capCuc[0]][capCuc[1]]==SIMBOL_CAPCUC){
           return true;
           
       
       }else{//avanza sitio vacio
           if (tauler[capCuc[0]][capCuc[1]] == SIMBOL_BUIT){
               cuc.add(capCuc);
              tauler[capCuc[0]][capCuc[1]] =SIMBOL_CAPCUC;
              
              tauler[cuc.get(0)[0]][cuc.get(0)[1]]= SIMBOL_BUIT;
              cuc.remove(0);
               
               return false;
           }
        }
    return false;
    }    
}    


