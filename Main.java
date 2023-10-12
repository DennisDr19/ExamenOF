package Examen;

public class Main {
    public static void main(String[] args) {
        Suma suma = new Suma();
        System.out.println("Suma de 2 enteros: "+suma.suma(4,3));
        System.out.println("Suma de 3 enteros: "+suma.suma(4,3,2));
        System.out.println("Suma de 2 doubles: "+suma.suma(1.5,4.2));
        System.out.println("Suma de 2 doubles: "+suma.suma(1.5,2.4,2.1));

    }
}
