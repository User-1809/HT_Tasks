import java.util.*;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();      // Динамический список

        while (sc.hasNextInt()) {
            nums.add(sc.nextInt());
        }
      
        if (nums.isEmpty()) return;

        Collections.sort(nums);                      // Находим медиану

        int median = nums.get(nums.size() / 2);

        int moves = 0;                               // Считаем общее количество ходов
        for (int n : nums) {
            moves += Math.abs(n - median);
        }
      
        if (moves > 20) {
            System.out.println("20 moves are not enough");
        } 
        
        else {
            System.out.println(moves);
        }
    }
}
