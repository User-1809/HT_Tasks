import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x0 = sc.nextDouble();                // Координаты центра и радиуса
        double y0 = sc.nextDouble();
        double a = sc.nextDouble(); 
        double b = sc.nextDouble();

        while (sc.hasNextDouble()) {                // Координаты точек
            double x = sc.nextDouble();
            double y = sc.nextDouble();
                            
     double val = ((x - x0) * (x - x0)) / (a * a) + ((y - y0) * (y - y0)) / (b * b);  // Уравнение эллипса
                                                                
            if (Math.abs(val - 1) < 1e-9) System.out.println(0);   // Положение точки относительно 1
            else if (val < 1) System.out.println(1);       
            else System.out.println(2);                      
        }
    }
}
