import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String wordBackwards = "";
        String word1 = scan.next();

        for(int i=0; i<word1.length(); i++){
            wordBackwards+=word1.charAt(word1.length()-i-1);
        }

        System.out.println(wordBackwards);

        boolean e = wordBackwards.equals(word1);
        System.out.println(e);


    }




}
