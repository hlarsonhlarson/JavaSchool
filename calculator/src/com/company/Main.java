package com.company;

import java.util.Scanner;

import static java.lang.System.*;

public class Main{

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
       int num1 = readNumber(scanner);
       char operation = readOperation(scanner);
       int num2 = readNumber(scanner);
       perfomOperation(num1, num2, operation, scanner);
    }

    public static int readNumber(Scanner scanner){
        System.out.println("Введите число");
        int num;

        if (scanner.hasNextInt()){
           num = scanner.nextInt();
        }
        else{
            System.out.println("Повторите ввод числа");
            scanner.next();
            num = readNumber(scanner);
        }
        return num;
    }

    public static char readOperation(Scanner scanner){
        System.out.println("Введите операцию");
        char op;
        if (scanner.hasNext()){
            op = scanner.next().charAt(0);
        }
        else {
            out.println("Повторите ввод операции");
            scanner.next();
            op = readOperation(scanner);
        }
        return op;
    }

    public static void perfomOperation(int num1, int num2, char operation, Scanner scanner){
       if (operation == '+' ){
           out.println(num1 + num2);
       }
       else if (operation == '-'){
           out.println(num1 - num2);
       }
       else if (operation == '*'){
           out.println(num1 * num2);
       }
       else if (operation == '/') {
           if (num2 == 0) {
               out.println("Деление на ноль");
           } else {
               out.println(num1 / num2);
           }
       }
       else{
           out.println("Неправильная операция повторите заново");
           perfomOperation(num1, num2, readOperation(scanner), scanner);
           }
       }
    }
