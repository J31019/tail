package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        int row;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите путь к файлу");
        String way = sc.nextLine();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(way));
            String line = "";
            while ((line = reader.readLine()) != null) {
                s.add(line);
            }
            row = s.size(); /* подсчитываю кол-во строк */
            System.out.println("Количество строк  = " + row); /* проверка кол-ва строк и колонок */
            if (row < 11){
                for(int i = 0; i != row; i++){
                    System.out.println(s.get((0) + i));
                }
            }
            else{
                System.out.println("Последние 10 строк: ");
                for(int i =0; i != 10 ; i++){
                    System.out.println(s.get((row-10 ) + i));
                }}
            reader.close();
        } catch (IOException e) {
            System.out.println("Ошибка!");
            System.out.println("Неправильно указан путь к файлу или такого файла не существует!");
        }
    }}
