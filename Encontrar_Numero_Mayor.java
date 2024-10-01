import java.util.Scanner;

public class Encontrar_Numero_Mayor {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // n¿ingresar cunatos numeros se desean ingresar
        System.out.println("ingrese la cantidad de numeros que va a ingresar");
        int numerosIngresar = scanner.nextInt();
        int[] arrayList = new int[numerosIngresar];

        for (int i = 0; i < numerosIngresar; i++) {

            System.out.print("ingrese un numero:");
            arrayList[i] = scanner.nextInt();

        }

        int indiceNumeroMayor = 0;
        

        for (int i = 1; i < numerosIngresar; i++) {
            if (arrayList[i] > arrayList[indiceNumeroMayor]) {
                indiceNumeroMayor = i;

                System.out.println("numeor mayor"+indiceNumeroMayor);
            }

            
        }


        
    }

}
