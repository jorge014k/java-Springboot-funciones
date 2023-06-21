import java.util.Scanner;
//programa que permita ingresar al usuario 5 numeros y los muestre en pantalla con funciones
public class NumPantallaFunciones {
    public static void main(String[] args) {

        int[] numeros =new int [5];
        cargarNumeros(numeros);
        mostrarNumeros(numeros);
    }

    private static void cargarNumeros(int[] numeros) {
        for (int i = 0; i<5; i++){
           int numero = pedirNumeroAlUsuario();
            numeros[i] = numero;
        }
    }

    private static void mostrarNumeros(int[]numeros) {
        System.out.println("estos son los numeros que cargastes");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
    }

    private static int pedirNumeroAlUsuario(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero = teclado.nextInt();
        return numero;
    }
}