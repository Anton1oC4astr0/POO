package ejemploarreglos;


public class EjemploArreglos {


    public static void main(String[] args) {
        int divi = 2, divid = 2, c = 0, primo = 0;
        //declaro un arreglo
        int z [] = new int [5];
        int a = 0; // indice
        do {
            for (divi = 2; divi <= divid; divi++) {
                if (divid % divi == 0) {
                    c++;
                }
            }
            if (c<2) {
                System.out.println("primo: " + divid);
                z [a] = divid;
                a++;
                primo++;
            }
            c = 0;
            divid++;
            
        } while (primo < 5);
        
        //cliclo para obtener los datos del arreglo 
        a = 0; //indice en cero
        while (a<z.length){
            System.out.println("z["+a+"] = "+z[a]);
            a++;
        }
    }
    
}
