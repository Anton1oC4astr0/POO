
package unidad2;

public class Contacto {
    //Creamos los atributos del contacto
    private String nombre;
    private int telefono;

    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    public Contacto(String nombre) {
        this.nombre = nombre;
        this.telefono = 0;// Valor de inicio por si no tengo ningun contacto
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    } 
    public boolean equals(Contacto contacto){//No pueden existir contactos con el mismo nombre
        if (nombre.trim().equalsIgnoreCase(contacto.getNombre().trim())){//trim()= borrar espacios en blanco de este atributo
            return true;
        }
        return false;
    }
}
