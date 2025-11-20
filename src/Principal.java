import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            Conversor conversor = new Conversor();
            int opcion = 0;
            double monto;

            while (opcion != 7) {
                Conversor.mostrarMenu();
                System.out.print("Elija una opción válida: ");

                if (!teclado.hasNextInt()) {
                    System.out.println("Ingrese un número entero.");
                    teclado.next();
                    continue;
                }

                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1 -> {
                        System.out.print("Monto a convertir (USD → ARS): ");
                        if (!teclado.hasNextDouble()) {
                            System.out.println("Ingrese un número válido.");
                            teclado.next();
                            continue;
                        }
                        monto = teclado.nextDouble();

                        var datos = conversor.obtenerConversion("USD", "ARS", monto);
                        double valor = Double.parseDouble(datos.conversion_result());
                        System.out.println("En total sería: " + String.format("%.2f", valor) + " ARS");
                    }

                    case 2 -> {
                        System.out.print("Monto a convertir (ARS → USD): ");
                        if (!teclado.hasNextDouble()) {
                            System.out.println("Ingrese un número válido.");
                            teclado.next();
                            continue;
                        }
                        monto = teclado.nextDouble();

                        var datos1 = conversor.obtenerConversion("ARS", "USD", monto);
                        double valor = Double.parseDouble(datos1.conversion_result());
                        System.out.println("En total sería: " + String.format("%.2f", valor) + " USD");
                    }

                    case 3 -> {
                        System.out.print("Monto a convertir (USD → BRL): ");
                        if (!teclado.hasNextDouble()) {
                            System.out.println("Ingrese un número válido.");
                            teclado.next();
                            continue;
                        }
                        monto = teclado.nextDouble();

                        var datos3 = conversor.obtenerConversion("USD", "BRL", monto);
                        double valor = Double.parseDouble(datos3.conversion_result());
                        System.out.println("En total sería: " + String.format("%.2f", valor) + " BRL");
                    }

                    case 4 -> {
                        System.out.print("Monto a convertir (BRL → USD): ");
                        if (!teclado.hasNextDouble()) {
                            System.out.println("Ingrese un número válido.");
                            teclado.next();
                            continue;
                        }
                        monto = teclado.nextDouble();

                        var datos4 = conversor.obtenerConversion("BRL", "USD", monto);
                        double valor = Double.parseDouble(datos4.conversion_result());
                        System.out.println("En total sería: " + String.format("%.2f", valor) + " USD");
                    }

                    case 5 -> {
                        System.out.print("Monto a convertir (USD → COP): ");

                        if (!teclado.hasNextDouble()) {
                            System.out.println("Ingrese un número válido.");
                            teclado.next();
                            continue;
                        }
                        monto = teclado.nextDouble();

                        var datos5 = conversor.obtenerConversion("USD", "COP", monto);
                        double valor = Double.parseDouble(datos5.conversion_result());
                        System.out.println("En total sería: " + String.format("%.2f", valor) + " COP");
                    }

                    case 6 -> {
                        System.out.print("Monto a convertir (COP → USD): ");

                        if (!teclado.hasNextDouble()) {
                            System.out.println("Ingrese un número válido.");
                            teclado.next();
                            continue;
                        }
                        monto = teclado.nextDouble();

                        var datos6 = conversor.obtenerConversion("COP", "USD", monto);
                        double valor = Double.parseDouble(datos6.conversion_result());
                        System.out.println("En total sería: " + String.format("%.2f", valor) + " USD");
                    }

                    case 7 -> {
                        System.out.println("Saliendo...");
                    }

                    default -> {
                        System.out.println("Opción inválida.");
                    }
                }
            }
        }
    }
}
