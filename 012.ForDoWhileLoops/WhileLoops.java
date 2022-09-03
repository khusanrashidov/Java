import java.util.ArrayList;
import java.util.Scanner;
public class WhileLoops {
    public static void main(String[] args) {
        // while(true) { //while it is true code will run forever
        //     System.out.println("hi");
        // }
        // while(false) { //unreachable code
        //     System.out.println("hi");
        // }
        // int a = 0;
        // while (a < 10) {
        //     System.out.println("a is less than 10>" + a);
        //     a++;
        // }
        // for (int i = 0; i < 10 ; i++) {
        //     System.out.println("i is less than 10>" + i);
        // }
        // int k;
        // k = 0;
        // do {
        //     System.out.println("k is less than 10>" + k);
        // } while(k == 0);
        String sentence = "flapjacks are awesome!";
        Scanner scan = new Scanner(sentence);
        ArrayList<String> words = new ArrayList<String>();
        while(scan.hasNext()) {
            words.add(scan.next());
        }
        System.out.println(words);
    }
}