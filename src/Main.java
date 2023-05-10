import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
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

        if (dir1.mkdir())
            info.append("Каталог src создан " + "\n");
        if (dir2.mkdir())
            info.append("Каталог res создан " + "\n");
        if (dir3.mkdir())
            info.append("Каталог savegames создан " + "\n");
        if (dir4.mkdir())
            info.append("Каталог temp создан " + "\n");
        if (dir11.mkdir())
            info.append("Каталог main создан " + "\n");
        if (dir12.mkdir())
            info.append("Катало test создан " + "\n");

        try {
            if (file1.createNewFile())
                info.append("Файл Main.java был создан" + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            if (file2.createNewFile())
                info.append("Файл Utils.java был создан" + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        if (dir21.mkdir())
            info.append("Каталог drawables создан " + "\n");
        if (dir22.mkdir())
            info.append("Каталог vectors создан " + "\n");
        if (dir23.mkdir())
            info.append("Каталог icons создан " + "\n");

        try {
            if (file3.createNewFile())
                info.append("Файл temp.txt был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileWriter writer = new FileWriter(file3, false)) {
            writer.write(info.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}