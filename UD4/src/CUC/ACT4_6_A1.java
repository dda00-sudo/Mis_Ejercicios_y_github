package CUC;



 /**
  * Crea una classe que inicialitzi una matriu quadrada, pe 5x5:
  *      Mostra-la per pantalla, cada fila a una línia.
  */
public class ACT4_6_A1 {
    static final int NTAULER = UtilitatsConsola.llegirSencer("Mida del tauler: ");
    static int SIMBOL_BUIT = 0;
    static int SIMBOL_CUC = 1;
 
    public static void main(String[] args) {
        int[][] tauler = new int[NTAULER][NTAULER];  // tauler del joc
        int[] cuc = new int[2];  // posici� {fila,columna} del cuc
        int accio; 

        // Emplena el tauler amb el cuc i les fulles
        inicialitzaJoc(tauler, cuc);
        
        do {
            // Mostra el tauler
            UtilitatsArrays.mostraArray(cuc);
            UtilitatsMatrius.mostrarMatriu(tauler);
            
            // Cambia la posici� del cuc
            accio=UtilitatsConsola.llegirSencer("ACCIONS: 8:ALT, 4:ESQUERRA, 6:DRETA, 2:BAIX; 0:SORTIR: ");     
            cambiaPosicio(tauler, cuc, accio);
        } while (accio!=0);
    }
    
    public static void inicialitzaJoc(int[][] tauler, int[] cuc) {
        // Generam una posici� aleat�ria pel cuc
        int[] pos = UtilitatsArrays.generaArray(2, 0, NTAULER-1);
        cuc[0] = pos[0];
        cuc[1] = pos[1];
        
        // Situa cuc en el tauler
        tauler[ cuc[0] ] [ cuc[1] ] = SIMBOL_CUC;
    }
    
    public static void cambiaPosicio(int[][] tauler, int[] cuc, int accio) {
        
         
        tauler[ cuc[0] ] [ cuc[1] ] = SIMBOL_BUIT;
        
        if(accio == 4){
            if (cuc[1] != 0)
               cuc[1]--;
            else
                cuc[1] =NTAULER-1;
        } else if(accio == 6){
             if (cuc[1] != 0)
            cuc[1]++;
             else
                cuc[1] =0  ;
        } else if(accio == 8){
            cuc[0]--;
        }else if(accio == 2){
            cuc[0]++;
        }
        
        tauler[ cuc[0] ] [ cuc[1] ] = SIMBOL_CUC;
        
            
            
    }
        
        
    }
    
