public class Main {
    public static void main(String[] args) {

        System.out.println("task1:");
        int age = 35;

        if (age >= 18) {
            System.out.println("Поздравляем Вас с совершеннолетием!");
        }

        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }

        System.out.println("task2:");
        int personAge = 5;

        if (personAge >= 7 && personAge < 18) {
            System.out.println("Ребенок ходит в школу");
        }

        if (personAge >= 18 && personAge < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }

        if (personAge >= 24 ) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
    }
}