package unidad1;
public class Foco {
    private String encendido;  // Estado del foco ("encendido" o "apagado")
    private String interruptorIndividual;  // Estado del interruptor individual ("encendido" o "apagado")

    // Constructor para inicializar el foco
    public Foco() {
        this.encendido = "encendido";  // Inicialmente apagado
        this.interruptorIndividual = "encendido";  // Interruptor individual apagado
    }

    // Método para encender el foco
    public void encender() {
        if (this.interruptorIndividual.equals("encendido")) {
            this.encendido = "encendido";  // Cambia el estado a encendido si el interruptor está encendido
        }
    }

    // Método para apagar el foco
    public void apagar() {
        if (this.interruptorIndividual.equals("encendido")) {
            this.encendido = "apagado";  // Cambia el estado a apagado si el interruptor está encendido
        }
    }

    // Método para cambiar el estado del interruptor individual
    public void cambiarInterruptor() {
        if (this.interruptorIndividual.equals("encendido")) {
            this.interruptorIndividual = "apagado";  // Cambia el interruptor a apagado
        } else {
            this.interruptorIndividual = "encendido";  // Cambia el interruptor a encendido
        }
    }

    // Método para cambiar el estado del foco directamente
    public void setEstado(String estado) {
        if (estado.equals("encendido") || estado.equals("apagado")) {
            this.encendido = estado;  // Cambia el estado si es 'encendido' o 'apagado'
        } else {
            System.out.println("Estado inválido. Debe ser 'encendido' o 'apagado'.");
        }
    }

    // Método para obtener el estado del foco (sin la verificación de luz general aquí)
    public String getEstado() {
        return this.encendido;
    }

    // Método para verificar si el foco está encendido, tomando en cuenta el interruptor individual y la luz general
    public boolean estaEncendido(String luzGeneral) {
        if (this.interruptorIndividual.equals("encendido") && this.encendido.equals("encendido") && luzGeneral.equals("encendida")) {
            return true;  // El foco está encendido solo si el interruptor está encendido, el foco está encendido y la luz general está encendida
        }
        return false;  // Si cualquiera de las condiciones no se cumple, el foco está apagado
    }
}