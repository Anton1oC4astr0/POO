
package Unidad2;

public class Banco{
    final private String nomBanco;
    double capital = 5.2;
    public String dirección = "Sin asignar";
    public Banco(String nomBanco){
        this.nomBanco = nomBanco;
    }
    public Banco(String nombre, double capital, String dirección){
        nomBanco = nombre;
        this.capital = capital;
        this.dirección = dirección;
    }
    public void mostrarInformación(){
        System.out.println("Nombre del banco: " + nomBanco);
        System.out.println("Capital: " + capital);
        System.out.println("Dirección: " + dirección);
    }
}
