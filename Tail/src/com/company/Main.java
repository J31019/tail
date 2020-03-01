package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String file = args[0];
        File f = new File(file);

        if (!f.exists())
            System.out.println("Будьте внимательны!");
        else {
            ArrayList<String> list = new ArrayList<>();
            try {
                FileReader fileReader = new FileReader(f);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = bufferedReader.readLine();

                while (line != null) {
                    list.add(line);
                    line = bufferedReader.readLine();
                }

                bufferedReader.close();
                fileReader.close();

                if (list.size() <= 10) {
                    for (String string : list)
                        System.out.println(string);
                }

                if (list.size() > 10) {
                    for (int i = list.size() - 10; i < list.size(); i++)
                        System.out.println(list.get(i));
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
