
package unidad2;

public class Prueba{

    public static void main(String[] args){
        Agenda a1 = new Agenda(3);
        Contacto c1 = new Contacto("Daniel", 1234567);
        a1.agregarContacto(c1);
        Contacto c2 = new Contacto("Juan", 2569);
        a1.agregarContacto(c2);
        Contacto c3 = new Contacto("Ivan", 542158);
        a1.agregarContacto(c3);
        Contacto c4 = new Contacto("Antonio", 145452);
        a1.agregarContacto(c4);
        //buscar
        a1.buscarContacto("Antonio");
    }
    
}
