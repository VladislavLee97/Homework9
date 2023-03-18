public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println();
        System.out.println("Задача 1");
        int paymentsPerMonth = 0;
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            paymentsPerMonth = paymentsPerMonth + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + paymentsPerMonth + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int paymentsPerMonth = 0;
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            paymentsPerMonth = paymentsPerMonth + arr[i];
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int paymentsPerMonth = 0;
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            paymentsPerMonth += arr[i];
        }
        float averageValue = paymentsPerMonth / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int length = reverseFullName.length;

        for (int i = 0; i < length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[length - i - 1];
            reverseFullName[length - i - 1] = temp;
        }
        System.out.println(reverseFullName);

    }
}

