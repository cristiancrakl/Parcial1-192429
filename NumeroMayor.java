import java.util.Scanner;

public class NumeroMayor {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que introduzca cuántos números quiere ingresar
        System.out.print("¿Cuántos números quieres ingresar? ");
        int cantidad = scanner.nextInt();

        // Verificamos si el usuario no ingresó números
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
            return;
        }

        // Creamos un array para almacenar los números ingresados
        int[] numeros = new int[cantidad];

        // Pedimos al usuario que ingrese los números
        System.out.println("Introduce los números:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Inicializamos el número mayor como el primer elemento del array
        int numeroMayor = numeros[0];

        // Recorremos el array para encontrar el número mayor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > numeroMayor) {
                numeroMayor = numeros[i];
            }
        }

        // Mostramos el número mayor
        System.out.println("El número mayor es: " + numeroMayor);

        // Cerramos el escáner
        scanner.close();
    }
}
