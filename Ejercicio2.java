import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        int n1,n2;

        Scanner leer_entrada = new Scanner(System.in);
        System.out.println("Introduce un valor para ver si es múltiplo o no del siguiente: ");
        n1=leer_entrada.nextInt();
        System.out.println("Introduce un valor para comprobar si es múltiplo del anterior: ");
        n2=leer_entrada.nextInt();
        boolean multiplo;
        multiplo=false;
        if(n1 % n2 == 0) {
            multiplo=true;
            }
        if (multiplo == true)
        System.out.println("Los números son múltiplos.");
        else {
            System.out.println("Los números no son múltiplos.");
            }
        }
    }