package LAB20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.*;


public class Book {

    private Map<String, Integer> dict;

    Book() throws IOException {
        dict = new HashMap<>();
        FileWriter writer = new FileWriter("src/LAB20/War and Peace2.txt", false);
        writer.write("");
        writer.flush();
        writer.close();
    }

    public void Change() throws IOException {
        Scanner scanner = new Scanner(Paths.get("src/LAB20/War and Peace.txt"), StandardCharsets.UTF_8.name());
        String data = scanner.nextLine();
        FileWriter writer = new FileWriter("src/LAB20/War and Peace2.txt", true);
        while (!data.equals("THE END")) {
            data = data.replaceAll("\\s", "#");
            writer.write(data+"\n");
            writer.flush();
            data = scanner.nextLine();
        }
        writer.close();
        System.out.println("/The spaces in \"War and Peace2.txt\" have been replaced by #");
    }

    public void Top() throws IOException {
        Scanner scanner = new Scanner(Paths.get("src/LAB20/War and Peace.txt"), StandardCharsets.UTF_8.name());
        String data = scanner.nextLine();
        while(!data.equals("THE END")) {

            String[] arr;
            data = data.replaceAll("[^a-zA-Z\\s]", "");
            arr = data.split(" ");

            for (String s : arr) {
                if (dict.containsKey(s))
                    dict.replace(s, dict.get(s) + 1);
                else
                    dict.put(s, 1);
            }
            data = scanner.nextLine();
        }
        dict.remove("");
        scanner.close();

        List<Integer> key = new ArrayList<>(dict.values());
        Collections.sort(key);
        Collections.reverse(key);
        System.out.println("Top-10 words:");
        for (int i = 0; i < 10; i++) {
            int k = key.get(i);
            System.out.printf("Word \"%s\" repeats %d times\n", KeyForValue(k), k);
        }
    }

    public String KeyForValue(int k) {
        Collection<String> collection= dict.keySet();
        for (String key : collection) {
            int obj = dict.get(key);
            if (key != null) {
                if (obj == k) {
                    return key;
                }
            }
        }
        return "";
    }

    public static void main(String[] args) throws IOException {
        Book book = new Book();
        book.Top();
        book.Change();
    }

}
