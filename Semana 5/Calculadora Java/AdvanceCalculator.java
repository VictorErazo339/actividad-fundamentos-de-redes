import java.util.Scanner;

public class AdvanceCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero(scanner, "Seleccione una opción: ");

            if (opcion >= 1 && opcion <= 7) {
                ejecutarOperacion(opcion, scanner);
            } else if (opcion != 0) {
                System.out.println("Opción NO válida. Ingrese de nuevo una opción.");
            }

        } while (opcion != 0);

        System.out.println("Saliendo de la calculadora. ¡Hasta pronto!");
        scanner.close();
    }

    public static void mostrarMenu() {

        System.out.println("dP                    dP   d8               a88888b.          dP                    dP            dP            dP ");
        System.out.println("88                    88   88              d8'   `88          88                    88            88            88 ");
        System.out.println("88        .d8888b. d8888P .P .d8888b.     88        .d8888b. 88 .d8888b. dP    dP 88 .d8888b. d8888P .d8888b.  88 ");
        System.out.println("88        88ooood8   88      Y8ooooo.     88        88'   `88 88 88'     88    88 88 88'   `88   88  88ooood8 dP ");
        System.out.println("88        88.  ...   88            88     Y8.   .88 88.  .88 88 88.  ... 88.  .88 88 88.  .88   88   88.  ...    ");
        System.out.println("88888888P `88888P'   dP      `88888P'      Y88888P' `88888P8 dP `88888P' `88888P' dP `88888P8   dP   `88888P'oo ");
        System.out.println("=================================================================================================================");


        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Potencia (a^b)");
        System.out.println("6. Raíz Cuadrada");
        System.out.println("7. Módulo");
        System.out.println("0. Salir");
        System.out.println("---------------------------");
    }

    public static void ejecutarOperacion(int opcion, Scanner scanner) {
        double numero1, numero2;

        // La raíz cuadrada solo necesita un número
        if (opcion == 6) {
            numero1 = leerDouble(scanner, "Ingrese el número: ");
            raizCuadrada(numero1);
            return;
        }

        // El resto necesita dos numeros
        numero1 = leerDouble(scanner, "Ingrese el primer número: ");
        numero2 = leerDouble(scanner, "Ingrese el segundo número: ");

        switch (opcion) {
            case 1 -> sumar(numero1, numero2);
            case 2 -> restar(numero1, numero2);
            case 3 -> multiplicar(numero1, numero2);
            case 4 -> dividir(numero1, numero2);
            case 5 -> potencia(numero1, numero2);
            case 7 -> modulo(numero1, numero2);
        }
    }

    // --- FUNCIONES BÁSICAS ---

    public static void sumar(double a, double b) {
        System.out.printf("Resultado: %.2f + %.2f = %.2f%n", a, b, (a + b));
        System.out.println("------------------------------------------------------------------------------------");

    }

    public static void restar(double a, double b) {
        System.out.printf("Resultado: %.2f - %.2f = %.2f%n", a, b, (a - b));
        System.out.println("------------------------------------------------------------------------------------");

    }

    public static void multiplicar(double a, double b) {
        System.out.printf("Resultado: %.2f * %.2f = %.2f%n", a, b, (a * b));
        System.out.println("------------------------------------------------------------------------------------");

    }

    public static void dividir(double a, double b) {
        if (b == 0) {
            System.out.println("ERROR: No se puede dividir por cero.");
        } else {
            System.out.printf("Resultado: %.2f / %.2f = %.2f%n", a, b, (a / b));
            System.out.println("------------------------------------------------------------------------------------");

        }
    }

    // --- FUNCIONES AVANZADAS ---

    public static void potencia(double base, double exponente) {
        double resultado = Math.pow(base, exponente);
        System.out.printf("Resultado: %.2f elevado a %.2f = %.2f%n", base, exponente, resultado);
        System.out.println("------------------------------------------------------------------------------------");
    }

    public static void raizCuadrada(double a) {
        if (a < 0) {
            System.out.println("ERROR: No se puede calcular la raíz de un número negativo.");
        } else {
            System.out.printf("Resultado: √%.2f = %.2f%n", a, Math.sqrt(a));
            System.out.println("------------------------------------------------------------------------------------");
        }
    }

    public static void modulo(double a, double b) {
        if (b == 0) {
            System.out.println("ERROR: Divisor no puede ser cero para el módulo.");
        } else {
            System.out.printf("Resultado: %.2f %% %.2f = %.2f%n", a, b, (a % b));
            System.out.println("------------------------------------------------------------------------------------");

        }
    }

    // --- MENSAJES AL INGRESAR NUMEROS INVALIDOS PARA VARIABLES INT & DOUBLE ---

    public static int leerEntero(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        while (!sc.hasNextInt()) {
            System.out.print("ERROR: Ingrese un número entero valido: ");
            System.out.println("------------------------------------------------------------------------------------");
            sc.next();
        }
        return sc.nextInt();
    }

    public static double leerDouble(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        while (!sc.hasNextDouble()) {
            System.out.print("ERROR: Ingrese un número válido: ");
            System.out.println("------------------------------------------------------------------------------------");

            sc.next();
        }
        return sc.nextDouble();
    }
}