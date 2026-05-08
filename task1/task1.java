import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        for (int i = 1; i <= 2; i++) {
            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                int m = sc.nextInt();

                int current = 0; // индекс + 1 (массив от 1 до n)
                do { System.out.print(current + 1);
                    current = (current + m - 1) % n; }
                while (current != 0); // повтор, пока не вернемся в начало
                
            }
        }
    }
}
