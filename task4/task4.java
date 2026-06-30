import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class task4 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Укажите путь к файлу в аргументах командной строки.");
            return;
        }

        List<Integer> nums = new ArrayList<>();

        try {
            Scanner sc = new Scanner(new File(args[0]));
            while (sc.hasNextInt()) {
                nums.add(sc.nextInt());
            }
            sc.close(); // Хорошая практика — закрывать ресурсы
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + args[0]);
            return;
        }

        if (nums.isEmpty()) return;

        Collections.sort(nums);

        int median = nums.get(nums.size() / 2);

        int moves = 0;
        for (int n : nums) {
            moves += Math.abs(n - median);
        }

        if (moves > 20) {
            System.out.println("20 ходов недостаточно для приведения всех элементов массива к одному числу");
        } else {
            System.out.println(moves);
        }
    }
}
