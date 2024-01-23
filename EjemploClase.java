package ejemploclase;


public class EjemploClase {

    public static void main(String[] args) {
        int a,b,c, suma;
        suma = c = 0;
        a = 2;
        System.out.println("1 al cubo es: 1 ");
        for (b = 2; b <= 5; b++) 
        {
            while (c<b)
            {
             if (a % 2 !=0) 
                 {
                   suma += a;
                   c++;
                 }
             a++;   
            }
             if (b == c) 
             {
               System.out.println(b + " al cubo es: " + suma);
               suma = c = 0;
             }            
        }
        

       
    }
    
}
