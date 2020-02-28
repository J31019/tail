package com.company;

import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Long, String> strMap = new HashMap<>();
        long linesCovered = 1;
        try {
            RandomAccessFile randomFile = new RandomAccessFile(args[0], "r");
            long fileLength = randomFile.length();
            long filePos = fileLength - 1;
            for (linesCovered = 1; linesCovered < 10; filePos--) {
                if (filePos >= 0) {
                    randomFile.seek(filePos);
                    if (randomFile.readByte() == 0xA) {
                        strMap.put(linesCovered++, randomFile.readLine());
                    }
                }else {
                    strMap.put(linesCovered++, randomFile.readLine());
                    randomFile.seek(filePos+1);
                    System.out.print((char) randomFile.read());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long startPosition = linesCovered;

        while (startPosition != 0) {
            if (strMap.containsKey(startPosition)) {
                System.out.println(strMap.get(startPosition));
            }
            startPosition--;
        }
    }
}
