package CUC;
//import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;


public class cuc_practice_arraList {
    static int NTAULER = UtilitatsConsola.llegirSencer("Mida del tauler: ");
    static int NFULLES = UtilitatsConsola.llegirSencer("Nombre de fulles: ");
    static final int SIMBOL_BUIT = 0;
    static final int SIMBOL_FULLA = 9;
    static final int SIMBOL_CUC = 1;
    static final int SIMBOL_CAPCUC = 2;

   
    public static void main(String[] args) {
        int[][] tauler = new int[NTAULER][NTAULER];
        ArrayList<int[]>cuc = new ArrayList<>();
        ArrayList<int[]>fulles= new ArrayList<>();
        int accio;
        
        inicializacionJoc(tauler, cuc, fulles);

        do{
            mostrarTauler(tauler,cuc,fulles);
            accio=UtilitatsConsola.llegirSencer("Puntuaci�: " + cuc.size() +  " | 8:ALT, 4:ESQUERRA, 6:DRETA, 2:BAIX; 0:SORTIR: ");           
            
            if (cambiarPosicion(tauler, cuc, fulles, accio)) {
                if (fulles.isEmpty()) {
                    System.out.println("YOU WIN !!");
                    accio = 0;
                }
            } else {
                System.out.println("YOU LOSE !!");
                accio = 0;
            }                                      
        }while(accio!=0);
    
    
    }
    
    
    // GUSANO Y HOJA
    public static void inicializacionJoc(int[][]tauler,ArrayList<int[]> cuc,ArrayList<int[]> fulles){
            //genera posicion cuc
            int[] pos= UtilitatsArrays.generaArray(2, 0, NTAULER-1);
            cuc.add(pos);
            
            //añade una hoja
            for (int i = 0;i<NFULLES;i++){
               añadeUnaHoja(cuc,fulles);
            }                       
    }
    public static void añadeUnaHoja( ArrayList<int[]>cuc, ArrayList<int[]> fulles){
        ArrayList<int[]> cucIfulles = new ArrayList<>();//Lista de hoja y gusanos
        int[] pos;
        boolean okFulla;
        
        cucIfulles.addAll(cuc);
        cucIfulles.addAll(fulles);
        
        do{            
        pos=UtilitatsArrays.generaArray(2, 0, NTAULER-1);//crea hoja
            okFulla=true;
            for(int[] p:cucIfulles){
                if(Arrays.equals(p,pos)){//si la hoja esta libre y no ocupa ningun sitio se queda
                   okFulla=false;
                break;
                }       
            }
        }while(!okFulla);
        fulles.add(pos);

    }
    
    //MOSTRAR TAULER
    public static void mostrarTauler(int[][] tauler, ArrayList<int[]> cuc, ArrayList<int[]> fulles) {
        String car="";
        
        netejaTauler(tauler);
        cabezaCuc(tauler, cuc);
        situaFulles(tauler, fulles);
              
        for (int i = 0; i < NTAULER ; i++) {
            System.out.print('|');
            for (int j = 0; j < NTAULER; j++) {
                switch (tauler[i][j]) {
                    case SIMBOL_BUIT -> car = "   ";
                    case SIMBOL_FULLA -> car = " * ";
                    case SIMBOL_CAPCUC -> car = " O ";
                    case SIMBOL_CUC -> car = " . ";
                }
                System.out.print(car);
            }
            System.out.println("|");
        
        }
    }
    
    public static void netejaTauler(int[][]tauler){
        for(int i=0; i<tauler.length;i++)
            for (int j = 0;j<tauler[i].length;j++)
                tauler[i][j]=SIMBOL_BUIT;
    }
    public static void cabezaCuc(int tauler[][],ArrayList<int[]>cuc){
       int i=0;
       for(int[]posCuc:cuc){       
           tauler[posCuc[0]][posCuc[1]]= i==cuc.size()-1?SIMBOL_CAPCUC:SIMBOL_CUC;
           i++;
        }
    }
    public static void situaFulles(int[][] tauler,ArrayList<int[]>fulles){
        for(int[] putesfulles:fulles){
        tauler[putesfulles[0]][putesfulles[1]]=SIMBOL_FULLA;
        }
    } 
    
    
    //CAMBIAR POSICION (ACCIO
    public static boolean cambiarPosicion(int[][]tauler, ArrayList<int[]>cuc,ArrayList<int[]>fulles,int accio){
    int[] posFulla,posCuc;
    int[]posCucCap ={cuc.get(cuc.size()-1)[0],cuc.get(cuc.size()-1)[1]};
    
        switch(accio){
            case 4->//IZQ
               posCucCap[1] = (posCucCap[1] == 0 ? NTAULER-1 : --posCucCap[1]); 
            case 6  -> // DRETA
                posCucCap[1] = (posCucCap[1] == NTAULER-1 ? 0 : ++posCucCap[1]); 
            case 8  -> // ALT
                posCucCap[0] = (posCucCap[0] == 0 ? NTAULER-1 : --posCucCap[0]); 
            case 2 -> //BAIX
                posCucCap[0] = (posCucCap[0] == NTAULER-1 ? 0 : ++posCucCap[0]); 
        }
    
    
    
    //el gusano come hoja
    for(int i =0; i< fulles.size(); i++){
        posFulla=fulles.get(i);
        if (Arrays.equals(posCucCap, posFulla)){
            cuc.add(posCucCap);
            fulles.remove(i);
        return true;
        }
    }
    // ¿El gusano se pisa a sí mismo?
    for (int i=0; i < cuc.size(); i++) {
        posCuc = cuc.get(i);
        if (Arrays.equals(posCuc,posCucCap)) {
            return false;
        }
    }

     // El gusano se mueve
    cuc.add(posCucCap); // eliminamos la cola de cuc
    cuc.remove(0);  //eliminamos la cola de cuc

    return true;       
    }
    
    
}

    
       
       
