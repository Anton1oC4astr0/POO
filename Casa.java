package unidad1;
public class Casa {
    private String luzGeneral;  // Estado del interruptor general ("encendida" o "apagada")
    private Foco[] focos;  // Arreglo de focos en la casa

    // Constructor que inicializa los focos y la luz general apagada
    public Casa(int numFocos) {
        this.luzGeneral = "encendida";  // Inicialmente la luz general está encendida
        this.focos = new Foco[numFocos];
        for (int i = 0; i < numFocos; i++) {
            this.focos[i] = new Foco();  // Crea los focos
        }
    }

    // Método para encender la luz general
    public void encenderLuzGeneral() {
        this.luzGeneral = "encendida";
    }

    // Método para apagar la luz general (los focos se apagan cuando se apaga la luz general)
    public void apagarLuzGeneral() {
        this.luzGeneral = "apagada";
    }

    // Método para verificar el estado de un foco
    public boolean estadoFoco(int indice) {
        if (indice < 0 || indice >= focos.length) {
            System.out.println("Índice de foco no válido: " + indice);
            return false;
        }
        return focos[indice].estaEncendido(luzGeneral);
    }

    // Método para cambiar el estado de un foco (de encendido a apagado o viceversa)
    public void cambiarEstadoFoco(int indice, String estado) {
        if (indice < 0 || indice >= focos.length) {
            System.out.println("Índice de foco no válido: " + indice);
            return;
        }
        focos[indice].setEstado(estado);  // Cambiar el estado del foco
    }
}