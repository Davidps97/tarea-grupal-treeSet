
package tareagrupal;

import java.util.TreeSet;

public class CARPETA {

    protected String NOMBRE;
    TreeSet<CARPETA> CONTIENE = new TreeSet<>((CARPETA c1, CARPETA c2) -> (c1.NOMBRE).compareTo(c2.NOMBRE));
    TreeSet<ARCHIVO> ARCHIVOS = new TreeSet<>((ARCHIVO a1, ARCHIVO a2) -> (a1.NOMBRE).compareTo(a2.NOMBRE));
    TreeSet<String> result = new TreeSet<>((String s1, String s2) -> s1.compareTo(s2));

    public CARPETA(String NOMBRE) {
        
        this.NOMBRE = NOMBRE;
    }

    public void agregarCarpeta(CARPETA carpeta) {
        
        this.CONTIENE.add(carpeta);
        result.add(carpeta.NOMBRE + ".subCarpeta");
    }

    public void agregarArchivo(ARCHIVO archivo) {
        
        this.ARCHIVOS.add(archivo);
        result.add(archivo.NOMBRE + ".archivo");
    }

    public void mostrarDirectorio() {
        
        System.out.println("Carpeta: " + this.NOMBRE);
        
        for (String nombre : result) {
            
            System.out.println(nombre);
        }
    }
}
