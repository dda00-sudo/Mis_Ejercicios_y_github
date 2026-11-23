
package CUC;


public class cuc_practice_Array {
    static final int NTAULER = UtilitatsConsola.llegirSencer("introduce la longuitud de la tablas:");
    static final int NHOJAS = UtilitatsConsola.llegirSencer("introduce numero de hojas:  ");
    static final int SIMBOL_CUC= 1;
    static final int SIMBOL_VACIO= 0;
    static final int SIMBOL_HOJA= 9;
    
    public static void main(String[] args) {
        int [] cuc =new int[2];
        int [][] tauler = new int[NTAULER][NTAULER];
        int accio;
        
        juego(tauler,cuc);
        
        do{
           UtilitatsArrays.mostraArray(cuc);
           muestraTauler(tauler);
           
           accio=UtilitatsConsola.llegirSencer("ACCIONS: 8:ALT, 4:ESQUERRA, 6:DRETA, 2:BAIX; 0:SORTIR: ");
                cambiarPosicion(tauler,cuc,accio);
        
        }
        while(accio!=0);
        
        
    }
    public static void muestraTauler(int[][]tauler){
       String car="   ";
        for(int i=0; i<NTAULER;i++){
            System.out.print("|");
            for(int j=0;j<NTAULER;j++){
                if(tauler[i][j]== SIMBOL_CUC){
                    car=" o ";
                }else if (tauler[i][j]==SIMBOL_HOJA){
                    car=" * ";
                }
                System.out.print(car); 
            }
           System.out.println("|"); 
        }       
    }
    
    
    
    public static void juego(int[][]tauler,int[] cuc){
        
        int [] pos =UtilitatsArrays.generaArray(2, 0, NTAULER-1);
        cuc[0]= pos[0];
        cuc[1]= pos[1];
        
        tauler [cuc[0]][cuc[1]]=SIMBOL_CUC;
        
        int nhojas = 0;
        while(nhojas<NHOJAS){
            pos =UtilitatsArrays.generaArray(2, 0,NHOJAS-1);
            if(tauler[pos[0]][pos[1]]==SIMBOL_VACIO){
                tauler[pos[0]][pos[1]]=SIMBOL_HOJA;                
            nhojas++;
            }
        }
    }
    public static void cambiarPosicion (int[][]tauler,int[]cuc,int accio){
         tauler[cuc[0]][cuc[1]]=SIMBOL_VACIO;
         switch(accio){
            case 4->
                 cuc[1]=cuc[1]==0?NTAULER-1:--cuc[1];
            case 6->
                cuc[1]=cuc[1]==NTAULER-1?0:++cuc[1];
            case 8->
                cuc[0]=cuc[0]==0?NTAULER-1:--cuc[0];
            case 2 ->
                cuc[0]=cuc[0]==NTAULER-1?0:++cuc[0];
            
         }
         tauler[cuc[0]][cuc[1]]=SIMBOL_CUC;

         
         
    }
    
}