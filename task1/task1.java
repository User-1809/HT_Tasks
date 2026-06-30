public class task1 {
    public static void main(String[] args) {
        if (args.length < 4) return;

        int argIndex = 0;

        for (int i = 1; i <= 2; i++) {
            int n = Integer.parseInt(args[argIndex++]);
            int m = Integer.parseInt(args[argIndex++]);

            int current = 0;
            do {
                System.out.print(current + 1);
                current = (current + m - 1) % n;
            } while (current != 0);
        }
        System.out.println();
    }
}
