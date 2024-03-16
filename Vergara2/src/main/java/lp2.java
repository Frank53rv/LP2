public class lp2 {
    public static void main(String[] args){
    
        int e1 = 15;
        int e2 = 52;
        int e3 = 34;
        int e4 = 18;
        int e5 = 23;
        
        int suma = e1 + e2 + e3 + e4 + e5;
        double prom = suma / 5.0; //  5.0 para obtener un resultado decimal.
        System.out.println("El promedio total es " + prom);
        
        int mayores = 0;
        int sumamayores = 0; // 
        int menores = 0;
        int sumamenores = 0; // 
        double promayor = 0;
        double promenor = 0;
        switch(e1 > 17 ?1 :0){
        case 1:
        sumamayores += e1;
        mayores++;
        break;
        default:
        sumamenores += e1;
        menores++;
       }
        switch(e2 > 17 ?1 :0){
        case 1:
        sumamayores += e2;
        mayores++;
        break;
        default:
        sumamenores += e2;
        menores++;
       }
        switch(e3 > 17 ?1 :0){
        case 1:
        sumamayores += e3;
        mayores++;
        break;
        default:
        sumamenores += e3;
        menores++;
       }
        switch(e4 > 17 ?1 :0){
        case 1:
        sumamayores += e4;
        mayores++;
        break;
        default:
        sumamenores += e4;
        menores++;
       }
        switch(e5 > 17 ?1 :0){
        case 1:
        sumamayores += e5;
        mayores++;
        break;
        default:
        sumamenores += e5;
        menores++;
       }
        promayor = sumamayores / mayores;
        promenor = sumamenores / menores;
        
        
        System.out.println("El promedio de los números menores a 18 es: " + promenor);
        System.out.println("El promedio de los números mayores a 17 es: " + promayor);
    }
}
        
