package program;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String path = "C:\\Windows\\System32\\drivers\\etc\\hosts";
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            while (bufferedReader.readLine() != null){
                System.out.println(bufferedReader.readLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                if(fileReader != null){
                    fileReader.close();
                }
                if(bufferedReader != null){
                    bufferedReader.close();
                }
            }catch (IOException e){
                System.out.println(e.getMessage());
            }

        }
    }
}
