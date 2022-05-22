package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileScanInteractive {

    public int countTokens(String file, String search) throws IOException {
        int instanceCount = 0;
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr);
             Scanner s = new Scanner(br)) {
            s.useDelimiter("\\W");
            while (s.hasNext()) {
                if (search.equalsIgnoreCase(s.next().trim())) {
                    instanceCount++;
                }
            }
        } // try-with-resources will close the connections
        return instanceCount;
    }

    public static void main(String[] args) {
        if (args.length < 1){
            System.exit (-1);
        }
        String file = args[0];
        System.out.printf("Реализована функция поиска в следующем файле: %s\n", file);
        System.out.print("Введите слово для поиска или q для выхода: ");
        FileScanInteractive scanner = new FileScanInteractive();
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String word;
            while (!(word = reader.readLine()).equalsIgnoreCase("q")){
                System.out.printf("Слово \n'%s' встречается в файле %s раз.\n", word, scanner.countTokens(file, word));
                System.out.print("Введите слово для поиска или q для выхода: ");
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}