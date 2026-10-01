import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ColorPrinterTest {

  @Test
  void testPrintlnWithRedColorAndReset() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.RED);

    // Act: Print the message
    String message = "I speak for the trees";
    printer.println(message);


    String expectedOutput = ConsoleColor.RED + "I speak for the trees" + System.lineSeparator() + ConsoleColor.RESET;

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testPrintDefualtColorAndMessage() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
   

    // Act: Print the message
    String message = "I speak for the trees";
    printer.print(message);


    String expectedOutput = ConsoleColor.WHITE + "I speak for the trees" + ConsoleColor.RESET;

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testForPrintWhenResetIsOff() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
   

    // Act: Print the message
    String message = "I speak for the trees";
    printer.print(message, false);

    String expectedOutput = ConsoleColor.WHITE + "I speak for the trees";

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }

   @Test
  void testForTwoArgumentConstructorColor() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream, ConsoleColor.BLUE);
   

    // Act: Print the message
    String message = "I speak for the trees";
    printer.print(message, false);

    String expectedOutput = ConsoleColor.BLUE + "I speak for the trees";

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testForChangingColorBetweenTwoPrints() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream, ConsoleColor.BLUE);
   

    // Act: Print the message
    String message = "I speak for the trees";
    printer.print(message);
    printer.setCurrentColor(ConsoleColor.PURPLE);
    printer.print("Hello world");

    String expectedOutput = ConsoleColor.BLUE + message + ConsoleColor.RESET + ConsoleColor.PURPLE + "Hello world" + ConsoleColor.RESET;

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }
}
