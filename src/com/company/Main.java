package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nameFile = null;
        List<String> lines;
        File file;
        try {
            nameFile = args[0];
            file = new File(nameFile);

            if (file.exists()) {
                lines = Files.readAllLines(Paths.get(file.getName()), StandardCharsets.UTF_8);
                if (lines.size() < 10) {
                    for (String str : lines) {
                        System.out.println(str);
                    }
                } else {
                    for (int i = lines.size() - 10; i < lines.size(); i++) {
                        System.out.println(lines.get(i));
                    }
                }
            } else {
                throw new FileNotFoundException();
            }
        } catch (ArrayIndexOutOfBoundsException d) {
            System.err.println("Ошибка: забыли ввести путь к файлу или имя файла");
        } catch (FileNotFoundException k) {
            System.err.println(nameFile + " - этот файл в данной директории отсутствует");
        } catch (IOException e) {
            System.err.println("Ошибка: забыли ввести путь к файлу или имя файла - 2");
        }


    }
}
