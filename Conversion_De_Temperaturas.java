import java.util.Scanner;

public class Conversion_De_Temperaturas {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        float temperaturaCelcius = 0;
        float temperaturaFahrenheit = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("desea ingresar al programa? 1).si 0)no");
        int opcionIngresar = scanner.nextInt();

        while (opcionIngresar != 0) {

            System.out.println("como desea comenzar 1).convertir de celcius a farenheit  2).convertir de fahrenheit a celcius 3).terminar el programa");
            int opcionPrograma = scanner.nextInt();

            if (opcionPrograma == 1) {
                System.out.println("ingrese la temperatura en grados celcius para ser convertida a fahrenheit");
                temperaturaCelcius = scanner.nextFloat();

                float temperaFarenheit = (temperaturaCelcius * 9 / 5) + 32;
                System.out.println("su temperatura en fahrenheit es:" + temperaFarenheit);

            } else {
                if (opcionPrograma == 2) {
                    System.out.println("ingrese la temperatura en grados fahrenheit para ser convertida a celcius");
                    temperaturaFahrenheit = scanner.nextFloat();

                    float temperaFarenheit = (temperaturaFahrenheit - 32) * 5 / 9;
                    System.out.println("su temperatura en fahrenheit es:" + temperaFarenheit);

                } else {
                    if (opcionPrograma == 0) {
                        break;
                    }

                }

            }

        }

    }

}
