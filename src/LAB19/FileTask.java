package LAB19;

import java.io.*;
import java.util.Scanner;

public class FileTask {
    private FileReader read;
    private FileWriter write;
    private FileWriter writeA;
    private String str;
    private Scanner in;

    FileTask() {
        try {
            read = new FileReader("src/LAB19/text.txt");
            write = new FileWriter("src/LAB19/text.txt", false);
            writeA = new FileWriter("src/LAB19/text.txt", true);
            in = new Scanner(System.in);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void WriteToFile() throws IOException {
        System.out.println("Input text");
        String text = in.nextLine();
        try {
            write.write(text);
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            write.flush();
            write.close();
        }
    }

    public void Output() throws IOException {
        System.out.println("File's text:");
        int c;
        str = "";
        try {
            while((c = read.read()) != -1){
                System.out.print((char)c);
                str += ((char) c);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void ChangeText() throws IOException {
        System.out.println("\nInput text to change: ");
        String Old = in.nextLine();
        System.out.println("Input a new text: ");
        String New = in.nextLine();
        System.out.printf("Change %s to %s\n", Old, New);
        str = str.replace(Old, New);
        write = new FileWriter("src/LAB19/text.txt", false);
            try {
                write.write(str);
            } catch (IOException e){
                System.out.println(e.getMessage());
            } finally {
                write.flush();
            }
    }

    public void AppendText() throws IOException {
        System.out.println("Input text to append:");
        String text = " "+in.nextLine();
        try {
            writeA.write(text);
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            writeA.flush();
        }
    }

    public void CloseFiles() throws IOException {
        read.close();
        write.close();
        writeA.close();
    }

    public static void main(String[] args) throws IOException {
        FileTask f = new FileTask();
        f.WriteToFile();
        f.Output();
        f.ChangeText();
        f.AppendText();
        f.CloseFiles();
    }
}
