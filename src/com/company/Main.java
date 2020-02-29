package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String file = args[0];
        File f = new File(file);
        if(!f.exists()){
            System.err.println("Неверно введен адрес файла!");
            System.err.println("Проверьте место расположения файла!");
        }else {
            ArrayList list = new ArrayList();
            try {
                FileReader fr = new FileReader(f);
                BufferedReader bf = new BufferedReader(fr);
                String readLine = bf.readLine();
                while (readLine != null) {
                    list.add(readLine);
                    readLine = bf.readLine();
                }
                if (list.size() <= 10) {
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                }
                if (list.size() > 10) {
                    for (int i = list.size() - 10; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
