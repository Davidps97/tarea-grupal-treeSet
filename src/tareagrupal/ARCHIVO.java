
package tareagrupal;

public class ARCHIVO {

    public String NOMBRE;
    private int TAMAÑO;
    public ARCHIVO ICONO;

    public ARCHIVO(String NOMBRE, int TAMAÑO) {
        
        this.NOMBRE = NOMBRE;
        this.TAMAÑO = TAMAÑO;
    }

    public void agregarIcono(ARCHIVO ICONO) {
        
        this.ICONO = ICONO;
    }
}
