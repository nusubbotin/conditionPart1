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

        System.out.println("task3New:"); //Доработка Задания №3
        /**  Инициализацию переменных оставил с задачи task1 (чуть выше)
         * int trainSeatsAll = 102;
         * int seatPlace = 60;
         * int standingPlace = trainSeatsAll - seatPlace;
         *
         * // ходные параметры
         * int seatPlaceFact = 60; // фактическое количество сидячих мест
         * int standingPlaceFact = 62; // фактическое количество стоячих мест
         */

        if (seatPlaceFact >= seatPlace && standingPlaceFact >= standingPlace) {
            System.out.println("вагон уже полностью забит");
        } else {
            if (seatPlaceFact < seatPlace) {
                System.out.println("В вагоне есть сидячие места");
            } else {
                System.out.println("В вагоне есть стоячие места");
            }
        }

        System.out.println("Задание 8. Домашнее задание 3. Задание 1");
        int peopleAge = 5;

        // "Если человеку от 2 до 6 лет"
        // рассматриваю верхнюю границу включительно
        if (peopleAge >= 2 && peopleAge <= 6) {
            System.out.println("Если возраст человека равен " + peopleAge + ", то ему нужно ходить в детский сад");
        }

        // Если человек от 7 до 18 лет
        // рассматриваю верхнюю границу включительно
        if (peopleAge > 6 && peopleAge <= 18) {
            System.out.println("Если возраст человека равен " + peopleAge + ", то ему нужно ходить в школу");
        }

        if (peopleAge > 18 && peopleAge < 24) {
            System.out.println("Если возраст человека равен " + peopleAge + ", то ему нужно ходить в университет");
        }

        // Здесь по логике напрашивается знак >= Но оставляю чтотка по формулировке:
        // "А если человеку больше 24"
        if (peopleAge > 24) {
            System.out.println("Если возраст человека равен " + peopleAge + ", то ему нужно ходить на работу");
        }

        System.out.println("Задание 8. Домашнее задание 3. Задача 2");
        int babyAge = 5;

        if (babyAge < 5) {
            System.out.println("Ваш ребенок не может кататься на аттракционе. Ему меньше 5 лет.");
        }

        // По постановке, если воспринимать буквально, то нужно поставить знак стого >
        // Но это не логично, должно быит "Если ребенку больше или равно 5"
        if (babyAge >= 5 && babyAge < 14) {
            System.out.println("Ваш ребенок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя!");
        }

        if (babyAge >= 14) {
            System.out.println("Ваш ребенок может кататься без сопровождения взрослого!");
        }

        System.out.println("Задание 8. Домашнее задание 3. Задача 3");
        int one = 10;
        int two = 5;
        int free = 3;

        if (one > two) {
            if (one > free) {
                System.out.println("Большее число: " + one);
            } else {
                System.out.println("Большее число: " + free);
            }
        } else {
            if (two > free) {
                System.out.println("Большее число: " + two);
            } else {
                System.out.println("Большее число: " + free);
            }
        }
    }
}