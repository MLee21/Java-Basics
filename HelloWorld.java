import java.io.Console;

public class HelloWorld {
  public static void main(String[] args) {
    Console console = System.console();
    String firstName = console.readLine("Enter your name: ");
    String adjective = console.readLine("Enter an adjective: ");
    console.printf("%s is very %s", firstName, adjective);
  }
}
