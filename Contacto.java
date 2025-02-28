
package unidad2;

public class Contacto{
    private String nombre;
    private int telefono;
    public Contacto(String nombre, int telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }
    public Contacto(String nombre){
        this.nombre = nombre;
        telefono = 0;
    }
    public String getNombre(){
        return nombre;
    }
    public int getTelefono(){
        return telefono;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public boolean equals(Contacto contacto){//metodo trim: compara 2 cadenas y elimina espacios
        if (nombre.trim().equalsIgnoreCase(contacto.getNombre().trim())){
            return true;
        }
        return false;
    }
}
