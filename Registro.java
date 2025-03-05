
package unidad2;

import java.util.Scanner;
import javax.swing.JOptionPane;//es una instrucción que permite utilizar la clase JOptionPane en Java. JOptionPane es una clase que se utiliza para crear cuadros de diálogo estándar, como cuadros de confirmación, de mensaje, de entrada, u de opciones. 

public class Registro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int opcion;
        int telefono;
        String nombre;
        Contacto contacto;
        int tamañoAgenda;
        
        tamañoAgenda = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño de la agenda"));//Permite convertir a entero un valor ingresado por el usuario en un cuadro de diálogo
        Agenda agendaTelefonica = new Agenda(tamañoAgenda);
        
        do{
            System.out.println("Bienvenido a la agenda");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Listar contactos");
            System.out.println("3. Buscar un contacto");
            System.out.println("4. Comprobar si existe un contacto");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Comprobar espacios disponibles");
            System.out.println("7. Comprobar si la agenda esta llena");
            System.out.println("8. Salir");
            System.out.println("Elija una opcion: ");
            opcion = teclado.nextInt();
            switch(opcion){
              //Añadimos un contacto
                case 1:
                    System.out.println("Digite su nombre: ");
                    nombre = teclado.next();
                    System.out.println("Digite su telefono: ");
                    telefono = teclado.nextInt();
                    contacto = new Contacto(nombre, telefono);
                    agendaTelefonica.añadirContacto(contacto);
                    System.out.println("");
                    break;
              //Listamos los contactos
                case 2:
                    agendaTelefonica.listarContactos();
                    System.out.println("");
                    break;
              //Buscamos un contacto
                case 3:
                    System.out.println("Escriba un nombre: ");
                    nombre = teclado.next();
                    agendaTelefonica.buscarContacto(nombre);
                    System.out.println("");
                    break;
              //Comprobamos si un contacto existe
                case 4:
                    System.out.println("Escriba un nombre: ");
                    nombre = teclado.next();
                    contacto = new Contacto(nombre);
                    if (agendaTelefonica.comprobarSiExisteContacto(contacto)){
                        System.out.println("El contacto existe");
                    }else{
                        System.out.println("El contacto NO existe");
                    }
                    System.out.println("");
                    break;
               //Eliminamos un contacto
                case 5:
                    System.out.println("Escriba un nombre: ");
                    nombre = teclado.next();
                    contacto = new Contacto(nombre);
                    agendaTelefonica.eliminarContacto(contacto);
                    System.out.println("");
                    break;
               //Comprobamos los contactos disponibles
                case 6:
                    System.out.println("Hay " + agendaTelefonica.espacioDisponible() + " espacios disponibles");
                    System.out.println("");
                    break;
               //Comprobamos si la agenda esta llena
                case 7:
                    if (agendaTelefonica.comprobarSiLaAgendaEstaLllena()){
                        System.out.println("La agenda esta llena");
                    }else{
                        System.out.println("Aun puedes registrar contactos");
                    }
                    System.out.println("");
                    break;
                case 8:
                    System.out.println("Gracias!");
                    opcion = 8;
                    break;
                default:
                    System.out.println("Opcion no valida, porfavor vuelva a elegir");
                    System.out.println("");
            }
        }while(opcion != 8);
    }
}