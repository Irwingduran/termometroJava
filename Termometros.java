import java.util.Scanner;

class Termometros{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué tipo de termómetro desea utilizar? (1: Fahrenheit, 2: Celsius)");
        int opcionTermometro = sc.nextInt();
        System.out.println("Ingrese los grados: ");
        double grados = sc.nextDouble();
        Termometro termometro;
        if(opcionTermometro == 1){
            termometro = new TermometroFahrenheit(grados);
        }else{
            termometro = new TermometroCelsius(grados);
        }
        int opcionMenu;
        do{
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Leer temperatura (grados).");
            System.out.println("2. Convertir los grados a una unidad distinta.");
            System.out.println("3. Determinar temperatura.");
            System.out.println("4. Almacenar temperatura.");
            System.out.println("5. Mostrar la temperatura mínima leída.");
            System.out.println("6. Mostrar la temperatura máxima leída.");
            System.out.println("7. Resetear memoria del termómetro.");
            System.out.println("8. Salir.");
            System.out.println("Elija una opción: ");
            opcionMenu = sc.nextInt();
            switch(opcionMenu){
                case 1:
                    System.out.println("Ingrese los nuevos grados: ");
                    double nuevosGrados = sc.nextDouble();
                    termometro.setGrados(nuevosGrados);
                    System.out.println("Temperatura actualizada.");
                    break;
                case 2:
                    if(opcionTermometro == 1){
                        System.out.println("La temperatura en Celsius es: " + termometro.convertir() + " °C");
                    }else{
                        System.out.println("La temperatura en Fahrenheit es: " + termometro.convertir() + " °F");
                    }
                    break;
                case 3:
                    System.out.println(termometro.determinarTemperatura());
                    break;
                case 4:
                    termometro.guardarEnMemoria();
                    System.out.println("Temperatura almacenada en la memoria.");
                    break;
                case 5:
                    System.out.println("La temperatura mínima leída es: " + termometro.minimo());
                    break;
                case 6:
                    System.out.println("La temperatura máxima leída es: " + termometro.maximo());
                    break;
                case 7:
                    termometro.resetearMemoria();
                    System.out.println("Memoria reseteada.");
                    break;
                case 8:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        }while(opcionMenu != 8);
    }
}