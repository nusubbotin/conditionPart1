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

        System.out.println("task3:");
        int trainSeatsAll = 102;
        int seatPlace = 60;
        int standingPlace = trainSeatsAll - seatPlace;

        // ходные параметры
        int seatPlaceFact = 60; // фактическое количество сидячих мест
        int standingPlaceFact = 62; // фактическое количество стоячих мест


        if (seatPlaceFact < seatPlace) {
            System.out.println("В вагоне есть сидячие места");
        }

        if (standingPlaceFact < standingPlace) {
            System.out.println("В вагоне есть стоячие места");
        }

        if (seatPlaceFact >= seatPlace && standingPlaceFact >= standingPlace) {
            System.out.println("вагон уже полностью забит");
        }

        System.out.println("task1New:"); //Доработка Задания №1
        int childAge = 15;

        if (childAge >= 18) {
            System.out.println("Поздравляем Вас с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }

        System.out.println("task2New:"); //Доработка Задания №2
        int teenagerAge = 25;

        if (teenagerAge >= 24 ) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        } else {
            if (teenagerAge >= 18) {
                System.out.println("Человек уже закончил школу и может отправляться в университет");
            } else {
                if (teenagerAge >= 7) {
                    System.out.println("Ребенок ходит в школу");
                }
            }
        }
    }
}