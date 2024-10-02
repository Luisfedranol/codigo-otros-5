import java.util.Scanner;

/**
 * Este programa determina si un número es "afortunado" o no.
 */
public class Codigo5 {

    public static void main(String[] args) {  //Se agrega un método main
        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        String ni = s.nextLine(); // Leer la entrada como String, se cambia el nombre de la variable para mejor entendimiento

        // Convertir la entrada a un número entero
        int c = Integer.parseInt(ni); // Convertir el String a int
       
        int afo = 0;
        int noAfo = 0;
        int tempNumber = c; // Guardar el número original para mostrarlo después

        while (c > 0) {// Se cambia por la variable correcta
            int digito = c % 10; // Se cambia por la variable correcta

            // Verificar si el dígito es afortunado
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++;
            } else {
                noAfo++;
            }

            c /= 10; // Se cambia por la variable correcta
        }

        // Determinar si el número es afortunado
        if (afo > noAfo) {
            System.out.println("El " + tempNumber + " es un número afortunado.");
        } else {
            System.out.println("El " + tempNumber + " no es un número afortunado.");
        }

        s.close(); // Cerrar el scanner
}
    }

