
package unidad2;

public class Agenda {
    private Contacto contactos[];

    //Le establecemos un tamaño por defecto de 10 contactos
    public Agenda() {
        contactos = new Contacto [10];
    }
    public Agenda(int tamaño){//Estableciendo el tamaño de la agenda de contactos
        contactos = new Contacto [tamaño];
    }
    //Creamos el metodo para añadir contactos a la agenda 
    public void añadirContacto(Contacto contacto){
        if (comprobarSiExisteContacto(contacto)) {
             System.out.println("Ya existe un contacto con ese nombre, porfavor digite otro nombre");
             System.out.println(""); 
        }
        else if (comprobarSiLaAgendaEstaLllena()) {
            System.out.println("La agenda esta llena");
        }
        else{
           boolean registro = false;
            for (int i = 0; i < contactos.length && !registro; i++) {
                if (contactos[i] == null) {
                    contactos[i] = contacto;
                    registro = true;
                }
            }
            if (registro == true) {
                System.out.println("El contacto se ha registrado con exito");
            }else{
                System.out.println("No se ha podido registrar el contacto");
            }
        }
    }
    //Creamos el metodo para comprobar si existe un contacto con el mismo nombre
    public boolean comprobarSiExisteContacto(Contacto contacto){
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contactos[i].equals(contacto)){
                return true;
            }
        }
        return false;
    }
    //Creamos el metodo para comprobar si la agenda esta llena
    public boolean comprobarSiLaAgendaEstaLllena(){
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                return false;
            }
        }
        return true;
    }
    //Creamos el metodo para listar los contactos 
    public void listarContactos(){
        if (espacioDisponible() == contactos.length) {
            System.out.println("No hay contactos para listar");
        }
        else{
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] != null) {
                    System.out.println("Nombre: " + contactos[i].getNombre());
                    System.out.println("Telefono: " + contactos[i].getTelefono());
                    System.out.println("");
                }
            }
        }
    }
    //Creamos el metodo para comprobar si hay espacios disponibles en el arreglo
    public int espacioDisponible(){
        int cont = 0;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                cont ++;
            }
        }
        return cont;
    }
    //Creamos un metodo para buscar un contacto por nombre
    public void buscarContacto(String nombre){
        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if (contactos[i] != null && contactos[i].getNombre().trim().equalsIgnoreCase(nombre.trim())) {
                System.out.println("Contacto encontrado, su telefono es: " + contactos[i].getTelefono());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado el contacto");
        }
    }
    //Creamos el metodo para eliminar un contacto
    public void eliminarContacto(Contacto contacto){
        boolean eliminado = false;
        for (int i = 0; i < contactos.length && !eliminado; i++) {
            if (contactos[i] != null && contactos[i].equals(contacto)) {
                contactos[i] = null;
                eliminado = true;
            }
        }
        if (eliminado == true) {
            System.out.println("El contacto se ha eliminado");
        }else{
            System.out.println("El contacto NO se ha eliminado");
        }
    }
}
