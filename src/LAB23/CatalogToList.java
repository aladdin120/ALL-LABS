package LAB23;

//Part 4

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogToList {

    List<Object> list = new ArrayList<>();
    String[] array;

    CatalogToList() {
        File file = new File("/Users/Fedor/IdeaProjects/practic");

        if(file.exists()) {
            array = file.list();
            list.addAll(Arrays.asList(array));
            System.out.println("First five elements of catalog by path "+file.getAbsolutePath());
            for (int i = 0; i < 5; i++)
                System.out.println(list.get(i));
        } else {
            System.out.println("No catalog for this pathname");
        }
    }
}
