import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter a word");
        System.out.println("the program will stop when you enter the word \"DONE\"");
        String word = keyboard.nextLine();
        while (!(word.equalsIgnoreCase("done")))
        {
            System.out.println("you entered the word: " + word);
            System.out.println("The Program will check if its first and last characters are same");
            char first = word.charAt(0);
            char last = word.charAt(word.length()-1);
            if(first == last)
            {
                System.out.println("word: " + word +" first and last chars are equal");
                System.out.println("first: " + first + " last: " + last);
            }
            else
                System.out.println("first and last char is not equal of word: " + word);
            System.out.println("enter another word and the program will test");
            word = keyboard.nextLine();
        }
        System.out.println("you entered the word: " + word);

    }
}
