import java.util.Scanner;


public class TikiTaka {

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        int total1 = 0;
        int total2 = 0;
        int total3 = 0;

        int suma = 0;

        System.out.println("Ingrese la cantidad de ventas");
        int ventas = entrada.nextInt();

        for (int i=1; i<=ventas; i++ ){

            System.out.println("Ingrese el total de la venta "+i);
            int totalVenta = entrada.nextInt();

            if (totalVenta >1000){
                total1 = total1 +totalVenta;

            }else if (totalVenta >500 && totalVenta <= 1000){
                total2 = total2+totalVenta;

            }else if (totalVenta <= 500){
                total3 = total3 + totalVenta;

            }
        }
        suma = total1+total2+total3;

        System.out.println(" El total de las ventas mayores a 1000 es: "+total1);
        System.out.println("El total de las ventas mayores a 500 o menores iguales a 1000 es: "+total2);
        System.out.println(" El total de las ventas menores o iguales a 500 es: "+total3);
        System.out.println(" la suma global de las categorias es: "+suma);

    }

}
