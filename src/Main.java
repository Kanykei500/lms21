import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String[] alfavit = {"Aa", "Bb", "Cc", "Dd", "Ee", "Ff", "Gg", "Hh", "Ii", "Jj",
               "Kk", "Ll", "Mm", "Nn", "Oo", "Pp", "Qq", "Rr", "Ss", "Tt", "Uu", "Vv",
               "Ww", "Xx", "Yy", "Zz", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        try (FileWriter fileWriter = new FileWriter("alfavit.txt")){
            for (String a:alfavit) {
                fileWriter.write(a+"\n ");

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
           int counter = 0;
           FileReader fileReader=new FileReader("alfavit.txt");
           Scanner scanner=new Scanner(fileReader);
           while (scanner.hasNextLine()){
               counter++;
               System.out.println(counter+"-"+scanner.nextLine());
           }
       }catch (IOException e){
           e.printStackTrace();
       }
   }
}