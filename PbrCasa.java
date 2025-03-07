package unidad1;
public class PbrCasa{
    public static void main(String[] args) {
        // Crear una casa con 5 focos
        Casa miCasa = new Casa(5);

        // Encender algunos focos individualmente
        miCasa.cambiarEstadoFoco(0, "encendido");  // Foco 0 encendido
        miCasa.cambiarEstadoFoco(2, "encendido");  // Foco 2 encendido
        miCasa.cambiarEstadoFoco(4, "encendido");  // Foco 4 encendido

        // Verificar el estado de los focos con la luz general encendida
        miCasa.encenderLuzGeneral();
        
        if (miCasa.estadoFoco(0)) {
            System.out.println("Estado de foco 0: encendido");
        } else {
            System.out.println("Estado de foco 0: apagado");
        }

        if (miCasa.estadoFoco(1)) {
            System.out.println("Estado de foco 1: encendido");
        } else {
            System.out.println("Estado de foco 1: apagado");
        }

        if (miCasa.estadoFoco(2)) {
            System.out.println("Estado de foco 2: encendido");
        } else {
            System.out.println("Estado de foco 2: apagado");
        }

        if (miCasa.estadoFoco(4)) {
            System.out.println("Estado de foco 4: encendido");
        } else {
            System.out.println("Estado de foco 4: apagado");
        }

        // Apagar la luz general
        miCasa.apagarLuzGeneral();

        // Verificar el estado de los focos con la luz general apagada
        if (miCasa.estadoFoco(0)) {
            System.out.println("Estado de foco 0 con luz general apagada: encendido");
        } else {
            System.out.println("Estado de foco 0 con luz general apagada: apagado");
        }

        if (miCasa.estadoFoco(2)) {
            System.out.println("Estado de foco 2 con luz general apagada: encendido");
        } else {
            System.out.println("Estado de foco 2 con luz general apagada: apagado");
        }

        if (miCasa.estadoFoco(4)) {
            System.out.println("Estado de foco 4 con luz general apagada: encendido");
        } else {
            System.out.println("Estado de foco 4 con luz general apagada: apagado");
        }

        // Cambiar el estado del foco 0 a apagado manualmente
        miCasa.cambiarEstadoFoco(0, "encendido");  // Foco 0 apagado

        // Verificar el estado después del cambio manual
        if (miCasa.estadoFoco(0)) {
            System.out.println("Estado de foco 0 después de apagado manual: encendido");
        } else {
            System.out.println("Estado de foco 0 después de apagado manual: apagado");
        }
    }
}