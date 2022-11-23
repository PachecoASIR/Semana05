 import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int n1,n2;

        Scanner leer_entrada = new Scanner(System.in);
        System.out.println("Introduce un valor para ver si es múltiplo o no del siguiente: ");
        n1=leer_entrada.nextInt();
        System.out.println("Introduce un valor para comprobar si es múltiplo del anterior: ");
        n2=leer_entrada.nextInt();
        if(n1 % 2 == 0) {
                System.out.println("El número es par.");
            }
            else System.out.println("El número es impar.");
        }
    }