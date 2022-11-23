import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        String n1;

        Scanner leer_entrada = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto para mostrar cada caracter de manera individual: ");
        n1=leer_entrada.nextLine();
        for(int i=0; i<=n1.length()-1; i++) {
            System.out.println(n1.charAt(i));
        }   
    }
}