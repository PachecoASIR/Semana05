import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        int n1;

        Scanner leer_entrada = new Scanner(System.in);
        System.out.println("Introduce un valor para ver si es mayor o menor que 100 y si es o no primo: ");
        n1=leer_entrada.nextInt();
        boolean mayor;
        mayor=false;
        if(n1 < 100) {
            mayor=true;
            }
        if (mayor == true)
        System.out.println("El número es menor que 100.");
        else {
            System.out.println("El número es mayor o igual que 100.");
            }
        boolean primo;
        primo=true;
        for (int i = 2; i < n1; i++) {
        if(n1 % i == 0) {
            primo=false;
            }
        }
        if (primo == true)
            System.out.println("El número es un número primo.");
        else {
            System.out.println("El número no es un número primo.");
        }
    }
}