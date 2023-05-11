import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void createFile(File file, StringBuilder info) {
        try {
            if (file.createNewFile())
                info.append("Файл ").append(file.getName()).append(" создан \n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void createDir(File dir, StringBuilder info) {
        if (dir.mkdir())
            info.append("Каталог ").append(dir.getName()).append(" создан \n");
    }

    public static void main(String[] args) {

        File dir1 = new File("C://Users//Games//src");
        File dir2 = new File("C://Users//Games//res");
        File dir3 = new File("C://Users//Games//savegames");
        File dir4 = new File("C://Users//Games//temp");

        File dir11 = new File("C://Users//Games//src//main");
        File dir12 = new File("C://Users//Games//src//test");

        File file1 = new File(dir11, "Main.java");
        File file2 = new File(dir11, "Utils.java");

        File dir21 = new File("C://Users//Games//res//drawables");
        File dir22 = new File("C://Users//Games//res//vectors");
        File dir23 = new File("C://Users//Games//src//icons");

        File file3 = new File(dir4, "temp.txt");

        StringBuilder info = new StringBuilder();

        createDir(dir1,info);
        createDir(dir2,info);
        createDir(dir3,info);
        createDir(dir4,info);
        createDir(dir11,info);
        createDir(dir12,info);


        createFile(file1,info);
        createFile(file2,info);

        createDir(dir21,info);
        createDir(dir22,info);
        createDir(dir23,info);

        createFile(file3,info);

        try (FileWriter writer = new FileWriter(file3, false)) {
            writer.write(info.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}