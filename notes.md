# Truffula Notes
As part of Wave 0, please fill out notes for each of the below files. They are in the order I recommend you go through them. A few bullet points for each file is enough. You don't need to have a perfect understanding of everything, but you should work to gain an idea of how the project is structured and what you'll need to implement. Note that there are programming techniques used here that we have not covered in class! You will need to do some light research around things like enums and and `java.io.File`.

PLEASE MAKE FREQUENT COMMITS AS YOU FILL OUT THIS FILE.

## App.java
- App recieves the raw argument but does not interpet them
- It passes them too TruffulaOptions.java

## ConsoleColor.java
- This is where colors are defined.
- This file is a enum class and stores colors.
- the getCode() returns ansi escape codes with a certain color and returns it as a string.
- Does not seem to reference any other classes.

## ColorPrinter.java / ColorPrinterTest.java
- This is file is where printing the color happens
- This file also is connected to ConsoleColor.java for printing colored text using the ansi escape codes.
- Contains two constrcutors, one with just a defualted color.
- All four print methods eventually call print(message, reset);

## TruffulaOptions.java / TruffulaOptionsTest.java
- A regular class with three private variables.
- It stores root, showHidden and useColor.
- Getters return the value stored.
- Connceted too truffulaPrinter.
- TODO will throw two exceptions.

## TruffulaPrinter.java / TruffulaPrinterTest.java
- Contains private fields with options, colorSequence and out and with constructors using output stream.
- printTree builds the tree and only uses java.io


## AlphabeticalFileSorter.java
- This arranges an array of files in alphabetic order.
- This is also a regular utility class.
- Only has one job.