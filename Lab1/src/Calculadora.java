import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        boolean valido = true;
        while (valido){
            System.out.println("Ingrese el primer numero:");
            num1 = scanner.nextDouble();

            System.out.println("Ingrese el segundo numero:");
            num2 = scanner.nextDouble();

            System.out.println("Seleccione la opcion que desea hacer: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();
            double resultado;


            switch (opcion) {
                case 1:
                    resultado = Suma(num1, num2);
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    resultado = Resta(num1, num2);
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    resultado = Multiplicacion(num1, num2);
                    System.out.println("El resultado de la multiplicacion es: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = Division(num1, num2);
                        System.out.println("El resultado de la division es: " + resultado);
                    } else {
                        System.out.println("No se puede dividir por 0.");
                    }
                    break;
                case 5:
                    System.out.println("Adios!!!");
                    valido = false;
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }
    }
    public static double Suma(double num1, double num2){
        return num1 + num2;
    }
    public static double Resta(double num1, double num2){
        return num1 - num2;
    }
    public static double Multiplicacion(double num1, double num2){
        return num1 * num2;
    }
    public static double Division(double num1, double num2){
        return num1 / num2;
    }
}
