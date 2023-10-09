public class Task2 {
    public static void main(String[] args) {

        int[] values = {12, 13, 23, 17, 19, 23};

        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j + 1] < values[j]) {
                    int tmp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = tmp;
                }
            }
        }
        for (int i : values) {
            System.out.println(i);
        }

    }
}