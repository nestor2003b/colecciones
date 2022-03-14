package colecciones1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/*

Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.

*/
public class Colecciones1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<String> razas=new ArrayList<>();
        String raza;
                boolean salir = true;
        int opcion;
        while (salir) {
            while (salir) {
                System.out.println("------------------Menu---------------------------");
                System.out.println("--.1 Ingresar una raza de perro al ArrayList-----");
                System.out.println("--.2 Mostrar ArrayList de razas de perros--------");
                System.out.println("--.0 Salir                                     --");
                System.out.println("------------------------------------------");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese una raza de perros: ");
                        raza=leer.next();
                        razas.add(raza);
                        break;
                    case 2:
                        System.out.println("Mostrando razas de perros: ");
                        for(String Raza:razas){System.out.println(Raza);}
                        break;
                    case 0:
                        salir = false;
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Ingrese una opcion valida");
                        ;
                }

            }

        }
        
    }
    
}
