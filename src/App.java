import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas:");
        int n = sc.nextInt();
        sc.nextLine();

        Persona[] personas = new Persona[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre de la persona #" + (i + 1) + ":");
            String nombre = sc.nextLine(); 

            
            int edad;
            do {
                System.out.println("Ingrese la edad de la persona #" + (i + 1) + " (debe ser positiva):");
                edad = sc.nextInt();
                sc.nextLine(); 
                if (edad < 0) {
                    System.out.println("Error: La edad debe ser un número positivo!.");
                }
            } while (edad < 0);

            personas[i] = new Persona(nombre, edad);
        }

        Arrays.sort(personas, (p1, p2) -> Integer.compare(p1.getEdad(), p2.getEdad()));

        System.out.println("Ingrese la edad a buscar:");
        int edadBuscada = sc.nextInt();

        Utilidades utilidades = new Utilidades();
        int resultado = utilidades.busquedaBinaria(personas, edadBuscada); 

        if (resultado != -1) {
            System.out.println("La persona con la edad " + edadBuscada + " es: " + personas[resultado].getNombre());
        } else {
            System.out.println("No se encontró una persona con esa edad.....");
        }
    }
}
