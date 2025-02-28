
package unidad2;

public class Agenda{
    private Contacto contactos[];
    private boolean registro;
    
    public Agenda(){
        contactos = new Contacto[10];
    }
    public Agenda(int tamaño){
        contactos = new Contacto [tamaño];
    }
    public boolean existeContacto(Contacto contacto){
        for (int i = 0; i < contactos.length; i++){
            if (contactos[i]!= null && contactos[i].equals(contacto)){
                return true;
            }
        }
        return false;
 }
    public boolean agendaLlena(){
        for (int i = 0; i < contactos.length; i++){
            if (contactos[i] == null){
                return false;
            }
        }
        return true;
    }
    public void agregarContacto(Contacto contacto){
        if (existeContacto(contacto)){
            System.out.println("Ya existe un contacto con ese nombre, escribe otro nombre");
            System.out.println("");
        }else if (agendaLlena()){
            System.out.println("La agenda está llena!!!");
            System.out.println("");
        }else{
            boolean registro = false;
            int i = 0;
            while(i<contactos.length && !registro)
                if (contactos [i] == null){
                    contactos[i] = contacto;
                    registro = true;
                }
            i++;
        }
        if (registro){
            System.out.println("El contacto se ha registrado");
        }else{
            System.out.println("No se ha podido registrar el contacto");
        }
    }
    public void buscarContacto(String nombre){
        boolean encontrado = false;
        int i = 0;
        while(i<contactos.length && !encontrado){
            if (contactos [i] != null && contactos [i].getNombre().trim().equalsIgnoreCase(nombre.trim())){
                System.out.println("Contacto encontrado!!! su telefono es " + contactos[i].getTelefono());
                encontrado = true;
            }
            i++;
        }
        if (!encontrado){
            System.out.println("No se ha encontrado el contacto");
        }
    }
    public void eliminarContacto(Contacto contacto){
        boolean eliminado = false;
        int i = 0;
        while(i<contactos.length && !eliminado){
            if (contactos [i] != null && contactos[i].equals(contacto)){
                contactos [i] = null;
                eliminado = true;
            }
            i++;
        }
        if (eliminado){
            System.out.println("El contacto ha sido eliminado");
        }else{
            System.out.println("El contacto NO ha sido eliminado");
        }
    }
    public int espacioDisponible(){
        int cont = 0;
        for (int i = 0; i < contactos.length; i++){
            if (contactos[i] == null){
                cont++;
            }
        }
        return cont;
    }
    public void listarContactos(){
        if (espacioDisponible() == contactos.length){
            System.out.println("No hay contactos por listar");
        }else{
            for (int i = 0; i < contactos.length; i++){
                if (contactos[i] != null){
                    System.out.println("Nombre: " + contactos[i].getNombre());
                    System.out.println("Telefono: " + contactos[i].getTelefono());
                }
            }
        }
    }
}
