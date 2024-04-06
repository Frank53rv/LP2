import java.util.Scanner;

public class Clase4 {
    public static void main(String[] args) {
        String[] employ = {"Emanuel", "David", "Alegato"};
        int[] ci = {6649515, 614908, 569423};
        int[] salarios = {30000, 74000, 32500};
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su número de cédula: ");
        int cedula = sc.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < ci.length; i++) {
            if (ci[i] == cedula) {
                encontrado = true;
                try {
                    System.out.print("Ingrese el número de horas trabajadas: ");
                    int horasTrabajadas = sc.nextInt();
                    float salario = salarios[i] * horasTrabajadas;
                    System.out.println("El salario es: " + salario);
                } catch (Exception e) {
                    System.out.println("Error calculando salario");
                    e.printStackTrace();
                }
                break;
            }
        }

        if (!encontrado) {
            System.out.println("IDENTIFIQUESE EN ESTA MONDA QUIEN ERES, NO TE TENGO ANOTADO ACA EN MI ARRAY");
        }
    } 
}
