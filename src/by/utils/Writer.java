package by.utils;

import java.io.*;

public class Writer {
    public static void writeNew(String path, String text) throws IOException  {
        File file = new File(path);

        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(text);
        bufferedWriter.flush();
    }

    public static void writeAppend(String path, String text) throws IOException  {
        File file = new File(path);

        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(text);
        bufferedWriter.flush();
    }





}