import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        double n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,resultado;

        Scanner leer_entrada = new Scanner(System.in);
        System.out.println("Introduce un valor para poder calcular la media: ");
        n1=leer_entrada.nextDouble();
        System.out.println("Introduce un nuevo valor: ");
        n2=leer_entrada.nextDouble();
        System.out.println("Introduce un nuevo valor: ");
        n3=leer_entrada.nextDouble();
        System.out.println("Introduce un nuevo valor: ");
        n4=leer_entrada.nextDouble();
        System.out.println("Introduce un nuevo valor: ");
        n5=leer_entrada.nextDouble();
        System.out.println("Introduce un nuevo valor: ");
        n6=leer_entrada.nextDouble();
        System.out.println("Introduce un nuevo valor: ");
        n7=leer_entrada.nextDouble();
        System.out.println("Introduce un nuevo valor: ");
        n8=leer_entrada.nextDouble();
        System.out.println("Introduce un nuevo valor: ");
        n9=leer_entrada.nextDouble();
        System.out.println("Introduce un nuevo valor: ");
        n10=leer_entrada.nextDouble();
        resultado=(n1+n2+n3+n4+n5+n6+n7+n8+n9+n10)/10;
        System.out.println("La media de los números introducidos es " + resultado);
    }
}