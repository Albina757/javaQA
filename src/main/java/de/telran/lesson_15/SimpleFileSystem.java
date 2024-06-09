package de.telran.lesson_15;

import java.io.File;

public class SimpleFileSystem {
    public static void main(String[] args) {


        File file = new File("file.txt");

        //проверка существование
        boolean isExists = file.exists();
        System.out.println("file exists " + isExists);

        // создание файла
        boolean wasCreatedFile = file.createNewFile();
        System.out.println("created file " + wasCreatedFile);

        File filePath = new File("d:/1/file.txt");
        wasCreatedFile = filePath.createNewFile();
        System.out.println("created filePath " + wasCreatedFile);

        // Размер файла
        long length = file.length();
        System.out.println("size file " + length);

        // Удаление файла
        boolean success = file.delete();
        System.out.println("delete file - " + success);


        //создание папки
        File dir = new File("new_dir");
        boolean wasCreated = dir.mkdir();
        System.out.println("created dir " + wasCreated);

        // создание вложенного файла или директория
        File file1 = new File(dir, "file1.txt");
        if (!file1.exists()) {
            System.out.println("created file " + file1.createNewFile());
        }

        // удаление каталоги
        success = dir.delete(); // только пустые каталоги можно удалить
        System.out.println("delete dir - " + success);

        // удаление каталога с вложенными объектами
        success = deleteDir(dir);
        System.out.println("delete dir included - " + success);
    }
}
