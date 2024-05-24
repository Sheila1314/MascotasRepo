
import java.util.Scanner;


public class ProgramaInventario {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        // Creamos unas cuantas mascotas
        Perro p1 = new Perro("Bobby", 5, "jugando", "Feb-2015", "Pastor alemán", false);
        Perro p2 = new Perro("Lulu", 7, "durmiendo", "Abril-2013", "Rottweiler", false);
        Gato g1 = new Gato("Luna", 2, "durmiendo", "Sept-2018", "negro", false);
        Gato g2 = new Gato("Pecas", 2, "rascandose", "Julio-2018", "blanco", true);
        Loro l1 = new Loro("Arturito", 10, "hablando", "Enero-2010", "largo", true, "Murcia", true);
        Canario c1 = new Canario("Basilio", 5, "piando", "Dic-2015", "corto", true, "amarillo", true);

        Mascota[] inventari = new Mascota[6];

        // Añadimos mascotas al inventario
        inventari[0] = p1;
        inventari[1] = p2;
        inventari[2] = g1;
        inventari[3] = g2;
        inventari[4] = l1;
        inventari[5] = c1;
        // Mostramos lista de animales
        System.out.println("----------------------------");
        System.out.println("Mostrem llista animals");
        System.out.println("----------------------------");
        for (int i = 0; i < inventari.length; i++) {
            Mascota m = inventari[i];
            String tipo;
            if (m instanceof Perro) {
                tipo="Perro";
            } else if (m instanceof Gato) {
                tipo="Gato";
            } else if (m instanceof Loro) {
                tipo="Loro";
            } else if (m instanceof Canario) {
                tipo="Canario";
            } else {
                tipo="Error, algo ha ido mal";
            }
            String nombre = m.getNombre();
            System.out.println(i+1 + ": " + tipo + " " + nombre);
        }
        System.out.println("----------------------------");
        System.out.println("Mostrem tota la llista extensa");
        System.out.println("----------------------------");
        for (int i = 0; i < inventari.length; i++) {
            Mascota m = inventari[i];
            inventari[i].muestra();
            System.out.println("----------------------------");
        }
        System.out.println("----------------------------");
        System.out.println("Mostrem dades de l'animal que vulguem");
        System.out.println("----------------------------");
        System.out.print("Nom de la mascota a mostrar: ");
        String nom_mascota=entrada.next();
        for (int i = 0; i < inventari.length; i++) {
            Mascota m = inventari[i];
            if(inventari[i].getNombre().equalsIgnoreCase(nom_mascota))
            {
                inventari[i].muestra();
            }
        }
        System.out.println("----------------------------");
        System.out.println("Borrem una mascota");
        System.out.println("----------------------------");
        System.out.print("Nom de la mascota a borrar: ");
        nom_mascota=entrada.next();
        int posicio_borrar = 10;
        for (int i = 0; i < inventari.length; i++) {
            Mascota m = inventari[i];
            if(inventari[i].getNombre().equalsIgnoreCase(nom_mascota))
            {
                posicio_borrar=i;
            }
        }
        if(posicio_borrar<=inventari.length){
            inventari[posicio_borrar]=null;
        }
        System.out.println("----------------------------");
        System.out.println("Mostrem tota la llista extensa");
        System.out.println("----------------------------");
        for (int i = 0; i < inventari.length; i++) {
            Mascota m = inventari[i];
            if(m!=null){
            inventari[i].muestra();
            System.out.println("----------------------------");
            }
        }
        System.out.println("----------------------------");
        System.out.println("Afegim una nova mascota (PENDENT)");
        System.out.println("----------------------------");
        
    }
}
