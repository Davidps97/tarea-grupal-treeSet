
package tareagrupal;

public class TareaGrupal {

    public static void main(String[] args) {
        ARCHIVO a1 = new ARCHIVO("Manolo", 3);
        ARCHIVO a2 = new ARCHIVO("Brian", 4);
        ARCHIVO a3 = new ARCHIVO("David", 5);
        ARCHIVO a4 = new ARCHIVO("Kirian", 6);
        ARCHIVO a5 = new ARCHIVO("Tomate", 7);

        CARPETA c1 = new CARPETA("DAM");
        CARPETA c2 = new CARPETA("PRO");
        CARPETA c3 = new CARPETA("LND");
        CARPETA c4 = new CARPETA("Tema 1");
        CARPETA c5 = new CARPETA("Unidad 2");

        c1.agregarCarpeta(c2);
        c1.agregarCarpeta(c3);
        c2.agregarCarpeta(c4);
        c2.agregarCarpeta(c5);
        c3.agregarCarpeta(c5);
        c4.agregarArchivo(a5);

        c1.agregarArchivo(a1);
        c2.agregarArchivo(a5);
        c2.agregarArchivo(a3);
        c2.agregarArchivo(a2);
        c4.agregarArchivo(a4);

        c1.mostrarDirectorio();
        /*
        System.out.println("-------------------");
        c2.mostrarDirectorio();
        System.out.println("-------------------");
        c3.mostrarDirectorio();
        System.out.println("-------------------");
        c4.mostrarDirectorio();
        System.out.println("-------------------");
        c5.mostrarDirectorio();*/
    }
}
