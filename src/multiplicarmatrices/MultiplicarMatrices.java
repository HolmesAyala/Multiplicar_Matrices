package multiplicarmatrices;
import java.util.Scanner;
/**
 *
 * @author Anggy Arguello - Holmes Ayala
 */
public class MultiplicarMatrices {
    Scanner leer = new Scanner(System.in);
    int filasA, columnasA;
    int filasB, columnasB;
    int matrizA[][];
    int matrizB[][];
    int matrizC[][];
    public MultiplicarMatrices(){
        solicitarTamano();
        solicitarNumeros();
        calcular();
        imprimir();
    }
    /**
     * Metodo que solicita el tamaño de las dos matrices A y B
     */
    private void solicitarTamano(){
        boolean validar;
        do{
            do{
                validar = true;
                System.out.print("Filas Matriz A: ");
                filasA = leer.nextInt();
                if(filasA <= 0){
                    System.out.println("NO valido.");
                    validar = false;
                }
            }while(!validar);
            do{
                validar = true;
                System.out.print("Columnas Matriz A: ");
                columnasA = leer.nextInt();
                if(columnasA <= 0){
                    System.out.println("NO valido.");
                    validar = false;
                }
            }while(!validar);
            do{
                validar = true;
                System.out.print("Filas Matriz B: ");
                filasB = leer.nextInt();
                if(filasB <= 0){
                    System.out.println("NO valido.");
                    validar = false;
                }
            }while(!validar);
            do{
                validar = true;
                System.out.print("Columnas Matriz B: ");
                columnasB = leer.nextInt();
                if(columnasB <= 0){
                    System.out.println("NO valido.");
                    validar = false;
                }
            }while(!validar);
            if(columnasA != filasB){
                System.out.println("Incorrecto, las columnas de A deben ser iguales a las filas de B");
                validar = false;
            }
        }while(!validar);
        matrizA = new int[filasA][columnasA];
        matrizB = new int[filasB][columnasB];
        matrizC = new int[filasA][columnasB];
    }
    /**
     * Metodo que solicitar los numeros para las matrices
     */
    private void solicitarNumeros(){
        //  Numeros para matriz A
        System.out.println("Numeros para matriz A");
        for(int i = 0; i < filasA; i++){
            for(int j = 0; j < columnasA; j++){
                System.out.print("Numero: ");
                matrizA[i][j] = leer.nextInt();
            }
        }
        //  Numeros para matriz B
        System.out.println("Numeros para matriz B");
        for(int i = 0; i < filasB; i++){
            for(int j = 0; j < columnasB; j++){
                System.out.print("Numero: ");
                matrizB[i][j] = leer.nextInt();
            }
        }
    }
    /**
     * Metodo que multiplica las matrices y genera una matriz C
     */
    private void calcular(){
        int acumulador = 0;
        for(int i = 0; i < filasA; i++){
            for(int j = 0; j < columnasB; j++){
                acumulador = 0;
                for(int k = 0; k < columnasA; k++){
                    acumulador = acumulador + (matrizA[i][k] * matrizB[k][j]);
                }
                matrizC[i][j] = acumulador;
            }
        }
    }
    /**
     * Metodo que imprime el resultado
     */
    private void imprimir(){
        System.out.print("La multiplicacion de las matrices A y B es una matriz C:");
        for(int i = 0; i < filasA; i++){
            System.out.println("");
            for(int j = 0; j < columnasB; j++){
                System.out.print("  "+matrizC[i][j]);
            }
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        MultiplicarMatrices multiplicarMatrices = new MultiplicarMatrices();
    }
}
