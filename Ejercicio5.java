import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        String p1="Suma";
        String p2="Resta";
        String p3="Multiplicacion";
        String p4="Division";
        String p;
        double n1;
        double n2;
        double resultado;

        Scanner leer_entrada = new Scanner(System.in);
        System.out.println("Intruduce el nombre de la operación que desea realizar: Suma - Resta - Multiplicacion - Division");
        System.out.println("A continuación se le pedirán los valores para realizar el cálculo: ");
        p=leer_entrada.nextLine();
        if(p.equals(p1)) {
            System.out.println("Introduce un valor: ");
            n1=leer_entrada.nextDouble();
            System.out.println("Introduce un valor para sumar al anterior: ");
            n2=leer_entrada.nextDouble();
            resultado= n1 + n2;
            System.out.println("El resultado de la suma es: " + resultado);
            }
        else if (p.equals(p2)) {
            System.out.println("Introduce un valor: ");
            n1=leer_entrada.nextDouble();
            System.out.println("Introduce un valor para restar al anterior: ");
            n2=leer_entrada.nextDouble();
            resultado= n1 - n2;
            System.out.println("El resultado de la resta es: " + resultado);
            }
        else if (p.equals(p3)) {
            System.out.println("Introduce un valor: ");
            n1=leer_entrada.nextDouble();
            System.out.println("Introduce un valor para multiplicar por el anterior: ");
            n2=leer_entrada.nextDouble();
            resultado= n1 * n2;
            System.out.println("El resultado de la multiplicación es: " + resultado);
            }
        else if (p.equals(p4)) {
            System.out.println("Introduce un valor para el numerador: ");
            n1=leer_entrada.nextDouble();
            System.out.println("Introduce el denominador: ");
            n2=leer_entrada.nextDouble();
            resultado= n1 / n2;
            System.out.println("El resultado de la división es: " + resultado);
            }
        else System.out.println("La operación no se corresponde con ninguna de las que se muestran por pantalla.");
        }
    }