/*

Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada.

 */
package colecciones2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Colecciones2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<String> razas = new ArrayList<>();
        String raza1, raza;
        boolean salir = true;
        boolean band = false;
        int opcion;
        while (salir) {
            while (salir) {
                System.out.println("------------------Menu---------------------------");
                System.out.println("--.1 Ingresar una raza de perro al ArrayList-----");
                System.out.println("--.2 Mostrar ArrayList de razas de perros--------");
                System.out.println("--.3 Eliminar del ArrayList una raza-------------");
                System.out.println("--.0 Salir                                     --");
                System.out.println("------------------------------------------");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese una raza de perros: ");
                        raza = leer.next();
                        razas.add(raza);
                        break;
                    case 2:
                        System.out.println("Mostrando razas de perros: ");
                        for (String Raza : razas) {
                            System.out.println(Raza);
                        }
                        break;
                    case 3:
                        System.out.println("Ingrese la raza que desea eliminar: ");
                        raza1 = leer.next();
                        Iterator<String> iterator = razas.iterator();
                        while (iterator.hasNext()) {
                            String perro = iterator.next();
                            if (perro.equals(raza1)) {
                                iterator.remove();
                                band = true;
                                System.out.println("Raza eliminada con éxito. ");
                            }
                            
                        }

                        if (!band) {
                            System.out.println("ERROR! La raza no se encuentra en el ArrayList. ");
                        }
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
