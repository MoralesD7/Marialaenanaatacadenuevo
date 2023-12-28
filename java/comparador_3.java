import java.util.Scanner;

public class comparador_3    {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entre 2 y 9: ");
        int numero = scanner.nextInt();

        if (numero < 2 || numero > 9) {
            System.out.println("El número está fuera del rango permitido.");
            return;
        }

        while (numero != 1) {
            if (numero % 2 == 0) {
                numero = numero / 2;
            } else {
                numero = numero * 3 + 1;
            }
            System.out.println("el numero es" + numero);
        }
    }
}
 

