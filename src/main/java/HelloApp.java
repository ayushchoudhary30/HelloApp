/**
 * HelloApp - UC1-UC5: Progressive Hello App Implementation
 * UC1: Display "Hello World" in the console
 * UC2: Display "Hello" with Command-Line Argument
 * UC3: Display "Hello" with Command-Line Argument or Default Message
 * UC4: Display "Hello" with Multiple Command-Line Arguments or Default Message
 * UC5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For Loop
 * @author ayushchoudhary30
 * @version 1.0
 */
public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello World");
        } else {
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        }
    }
}
