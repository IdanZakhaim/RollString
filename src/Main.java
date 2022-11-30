import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println(roll(sentence));
    }

    public static StringBuilder roll (String sentence){
        StringBuilder reverseSentence = new StringBuilder();
        reverseSentence.append(sentence);
        reverseSentence.reverse();
        return reverseSentence;
    }
}