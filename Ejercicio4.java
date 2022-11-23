import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        double n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,r1,r2,r3,r4,r5,r6,r7,r8,r9,r10;

        Scanner leer_entrada = new Scanner(System.in);
        System.out.println("Introduce un valor para poder calcular la media (puedes introducir decimales): ");
        n1=leer_entrada.nextDouble();
        r1=n1;
        System.out.println("La media de los números introducidos es " + r1);
        System.out.println("Introduce un nuevo valor: ");
        n2=leer_entrada.nextDouble();
        r2=(n1+n2)/2;
        System.out.println("La media de los números introducidos es " + r2);
        System.out.println("Introduce un nuevo valor: ");
        n3=leer_entrada.nextDouble();
        r3=(n1+n2+n3)/3;
        System.out.println("La media de los números introducidos es " + r3);
        System.out.println("Introduce un nuevo valor: ");
        n4=leer_entrada.nextDouble();
        r4=(n1+n2+n3+n4)/4;
        System.out.println("La media de los números introducidos es " + r4);
        System.out.println("Introduce un nuevo valor: ");
        n5=leer_entrada.nextDouble();
        r5=(n1+n2+n3+n4+n5)/5;
        System.out.println("La media de los números introducidos es " + r5);
        System.out.println("Introduce un nuevo valor: ");
        n6=leer_entrada.nextDouble();
        r6=(n1+n2+n3+n4+n5+n6)/6;
        System.out.println("La media de los números introducidos es " + r6);
        System.out.println("Introduce un nuevo valor: ");
        n7=leer_entrada.nextDouble();
        r7=(n1+n2+n3+n4+n5+n6+n7)/7;
        System.out.println("La media de los números introducidos es " + r7);
        System.out.println("Introduce un nuevo valor: ");
        n8=leer_entrada.nextDouble();
        r8=(n1+n2+n3+n4+n5+n6+n7+n8)/8;
        System.out.println("La media de los números introducidos es " + r8);
        System.out.println("Introduce un nuevo valor: ");
        n9=leer_entrada.nextDouble();
        r9=(n1+n2+n3+n4+n5+n6+n7+n8+n9)/9;
        System.out.println("La media de los números introducidos es " + r9);
        System.out.println("Introduce un nuevo valor: ");
        n10=leer_entrada.nextDouble();
        r10=(n1+n2+n3+n4+n5+n6+n7+n8+n9+n10)/10;
        System.out.println("La media de los 10 números introducidos es " + r10);
    }
}