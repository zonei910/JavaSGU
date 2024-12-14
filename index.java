

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class index{
    public static void main(String[] args) throws IOException {
        File file = new File("\\C:\\Users\\14038\\Desktop\\input.txt\\");
//        FileWriter w = new FileWriter("\\C:\\Users\\14038\\Desktop\\input.txt\\");
        Scanner sc = new Scanner(file);

     
        while(sc.hasNext()){
              String s = sc.nextLine();
             System.out.println(s);
        }
       
    }
    
}