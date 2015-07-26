import java.io.Console;

public class HelloWorld {
  public static void main(String[] args) {
    Console console = System.console();
    String firstName = "Moss";
    console.printf("Hello, my name is %s\n", firstName);
  }
}
