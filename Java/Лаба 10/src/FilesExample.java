import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.StandardOpenOption.APPEND;

public class FilesExample {
    private static void inputStreamCopy(String path, String fileInName, String fileOutName) {
        FileInputStream in;
        FileOutputStream out;
        // побайтовые чтение и запись
        try {
            in = new FileInputStream(path +
                    fileInName);
            out = new FileOutputStream(path +
                    fileOutName);
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("File copied with FileInputStream");
        } catch (IOException e) {
            System.out.println("Exception caught:");
            // вывод полной информации об исключении
            e.printStackTrace();
        }
    }

    private static void bufferedReaderCopy(String path, String fileInName, String fileOutName) {
        // построчные чтение и запись
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path + fileInName), Charset.defaultCharset())) {
            String line = null;
            try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(path + fileOutName), Charset.defaultCharset(), APPEND)) {
                while ((line = reader.readLine()) != null) {
                    writer.write(line, 0, line.length());
                    writer.write('\n');
                }
                System.out.println("File copied with BufferedReader");
            } catch (IOException e) {
                System.out.println("Exception caught (write):");
                System.err.format("IOException: % s % n", e);
            }
        } catch (IOException e) {
            System.out.println("Exception caught (read):");
            System.err.format("IOException: %s%n", e);
        }
    }

    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "/src/";
        BufferedReader inputBuf;
        List<String> students = new ArrayList<>();
        try {
            inputBuf = new BufferedReader(new InputStreamReader(System.in)); // для ввода с клавиатуры
            System.out.println("Enter student names ('0' - exit):");
            while (true) {
                // ввод с клавиатуры
                String input = inputBuf.readLine();
                if ("0".equals(input)) break;
                else students.add(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(students);
        inputStreamCopy(path, "fileIn.txt", "fileOut_01.txt");
        bufferedReaderCopy(path, "fileIn.txt", "fileOut_02.txt");
    }
}
