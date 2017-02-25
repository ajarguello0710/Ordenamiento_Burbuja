package ordenamientoburbuja;
import java.util.Scanner;

/**
 * @author Anggy Arguello - Holmes Ayala
 * 
 */
public class OrdenamientoBurbuja {
    private Scanner leer = new Scanner(System.in);
    private int tamanovec;
    private int numeros[];
    
    public OrdenamientoBurbuja(){
        
        solicitarTamano();
        solicitarNumeros();
        organizarNumeros();
        imprmirNumeros();
    }
    private void solicitarTamano(){
        System.out.print("Ingrese cuantos numeros va ha ingresar: ");
        tamanovec = leer.nextInt();
        numeros = new int[tamanovec];
    }
    private void solicitarNumeros(){
        for(int i=0; i<tamanovec; i++){
            System.out.print("Ingrese numero "+ (i+1) +" : ");
            numeros[i] = leer.nextInt();
        }
    }
    private void organizarNumeros(){
        int cambio=0;
        for(int i = 0; i< tamanovec; i++){
            for(int j = i; j < tamanovec; j++){
                if(numeros[i] > numeros[j]){
                    cambio = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = cambio;
                }
            }
        }
    }
    
    /**
     * Metodo encargado de imprimir el resultao de ordenamiento.
     */
    public void imprmirNumeros(){
        System.out.print("Vector organizado: ");
        for(int i=0; i<tamanovec; i++){
            System.out.print(" "+numeros[i]);
        }
        System.out.println();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OrdenamientoBurbuja ordenamientoBurbuja = new OrdenamientoBurbuja();
    }
}