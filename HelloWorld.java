import java.io.Console;

public class HelloWorld {
  public static void main(String[] args) {
    Console console = System.console();
    String name = console.readLine("Enter a name: ");
    String adjective = console.readLine("Enter an adjective: ");
    String noun = console.readLine("Enter a noun: ");
    String adverb = console.readLine("Enter an adjective: ");
    String verb = console.readLine("Enter a verb ending in -ing: ");
    console.printf("Your fun short story:\n-------------------\n");
    console.printf("%s is a %s %s.\n", name, adjective, noun);
    console.printf("%s is always %s %s.\n", name, adverb, verb);
  }
}
