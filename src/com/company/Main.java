package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("   Задача 1");
        int ageBig = 20;
        int ageLittle = 17;
        if (ageBig >= 18) {
            System.out.println("Если возраст человека равен " + ageBig + ", то он совершеннолетний");
        }
        if (ageLittle < 18) {
            System.out.println("Если возраст человека равен " + ageLittle + ", он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("   Задача 2");
        short temperatureCold = -5;
        short temperatureHot = 5;
        if (temperatureCold < 5) {
            System.out.println("На улице " + temperatureCold + " градусов, нужно надеть шапку");
        }
        if (temperatureHot >= 5) {
            System.out.println("На улице " + temperatureHot + " градусов, можно идти без шапки");
        }

        System.out.println("   Задача 3");
        short speedBig = 80;
        short speedLittle = 20;
        if (speedBig > 60) {
            System.out.println("Если скорость " + speedBig + ", то придется заплатить штраф");
        }
        if (speedLittle <= 60) {
            System.out.println("Если скорость " + speedLittle + ", то можно ездить спокойно");
        }

        System.out.println("   Задача 4");
        short age = 75;
        if (age < 60) {
            if (age < 2) {
                System.out.println("Если возраст человека равен " + age + ", то ему пора спать");
            }
            if (age >= 2 && age <= 6) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
            }
            if (age >6 && age <= 18) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
            }
            if (age > 18 && age < 24) {
                System.out.println("Если возраст человека равен " + age + ", то его место в университете");
            }
            if (age >= 24) {
                System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
            }
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он может отдохнуть");
        }

        System.out.println("   Задача 5");
        int ageKids = 15;
        if (ageKids < 5) {
            System.out.println("Если возраст ребенка равен " + ageKids + ", то ему нельзя кататься на аттракционе");
        } else {
            if (ageKids >= 5 && ageKids < 14) {
                System.out.println("Если возраст ребенка равен " + ageKids + ", то ему можно кататься на аттракционе в сопровождении");
            }
            if (ageKids > 14) {
                System.out.println("Если возраст ребенка равен " + ageKids + ", то ему можно кататься на аттракционе без сопровождения взрослого");
            }
        }

        System.out.println("   Задача 6");
        int placeAll = 102;
        int placeSit = 60;
        int placeStand = placeAll - placeSit;
        int peopleInside = 80;
        int placeFree = placeAll - peopleInside;
        int placeFreeSit;
        int placeFreeStand;
        if (peopleInside < placeSit) {
            placeFreeSit = placeSit - peopleInside;
            placeFreeStand = placeStand;
        } else {
            placeFreeSit = 0;
            placeFreeStand = placeFree;
        }
        boolean people = peopleInside < placeAll;
        if (people) {
            System.out.println("Места есть: " + placeFree + " места. " + "Сидячих: "  + placeFreeSit + " и стоячих: " + placeFreeStand);
        } else {
            System.out.println("Мест нет, вагон полностью забит");
        }

        System.out.println("   Задача 7");
        int one = 5;
        int two = 10;
        int three = 56;
        if (one > two && one > three) {
            System.out.println(one);
        } else {
            if (two > three) {
                System.out.println(two);
            } else {
                System.out.println(three);
            }
        }
    }
}
