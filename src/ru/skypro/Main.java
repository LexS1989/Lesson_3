package ru.skypro;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// Задача №1
        {

            int clientOS = 0; // 0 - IOS; 1 - Android
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для IOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Проверьте правильность ввода данных");
            }
        }

    // Задача №2
        {
            int clientOS = 1; // 0 - IOS; 1 - Android
            int clientDeviceYear = 2017;
            if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для IOS по ссылке");
            } else if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else if (clientOS == 1 && clientDeviceYear >= 2015){
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientOS == 1 && clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Проверьте правильность ввода данных");
            }
        }
    // Задача №3
        {
            int year = 2021;
            if (((year % 4 == 0 && year % 100 != 0)) || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }

    // Задача №4
        {
            int deliveryDistance = 95;
            int deliveryDay = 1;
            if (deliveryDistance >= 0 && deliveryDistance <= 20) {
                System.out.println("Срок доставки составит: " + deliveryDay + " день.");
            } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Срок доставки составит: " + (deliveryDay + 1) + " дня.");
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Срок доставки составит: " + (deliveryDay + 2) + " дня.");
            } else {
                System.out.println("По вопросу доставки в ближайшее время с вами свяжеться наш менеджер.");
            }
        }

    // Задача №5
        {
            int monthNumber = 8;
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зимний сезон");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весенний сезон");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Летний сезон");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осенний сезон");
                    break;
                default:
                    System.out.println("Проверьте правильность ввода данных");
            }
        }

//        Задача №6
        {
            int age = 19;
            int salary = 58_000;
            double creditLimit = 0;
            if (age <= 23) {
                creditLimit = salary * 2;
            } else {
                creditLimit = salary * 3;
            }
            if (salary >= 80_000) {
                creditLimit = creditLimit * 1.5;
            } else if (salary >= 50_000) {
                creditLimit = creditLimit * 1.2;
            }
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом = " + creditLimit + " рублей");
        }

//        Задача №7
        {
            int age = 25;
            int salary = 60_000;
            int wantedSum = 330_000;
            double percent = 10; // %
            int creditTerm = 12;
            int maxPayment = salary / 2;
            if (age < 25) {
                percent = percent * 1.1;
            } else if (age < 30) {
                percent = percent * 1.05;
            }
            if (salary > 80_000) {
                percent = percent / 1.07;
            }
            double paymentMonth = (wantedSum + (wantedSum * (percent / 100))) / creditTerm;
//            System.out.println("percent = " + percent + " %");
//            System.out.println("maxPayment = " + maxPayment);
//            System.out.println("paymentMonth = " + paymentMonth);
            System.out.print("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. " +
                    "Платеж по кредиту " + paymentMonth + " рублей.");
            if ((maxPayment) >= paymentMonth) {
                System.out.println(" Одобрено.");
            } else {
                System.out.println(" Отказано.");
            }
        }

        }
    }
