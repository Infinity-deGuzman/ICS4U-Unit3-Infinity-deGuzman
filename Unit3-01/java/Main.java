/*
* This program recurses.
*
* @author  Infinity de Guzman
* @version 1.0
* @since   2024-06-25
*/

/**
* This runs testcases.
*/
final class Main {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final String og = "original string: ";
        final String reversed = "reversed string: ";
        // input
        String originalString = "Recursion";
        System.out.println(og + originalString);
        System.out.println(
            reversed + reverseString(originalString)
        );
        System.out.println();

        originalString = "";
        System.out.println(og + originalString);
        System.out.println(
            reversed + reverseString(originalString)
        );
        System.out.println();

        originalString = "Onomatopeia123";
        System.out.println(og + originalString);
        System.out.println(
            reversed + reverseString(originalString)
        );
        System.out.println();

        System.out.println("\nDone.");
    }

    /**
    * The reverseString() function.
    *
    * @param input string that is inputted
    *
    * @return reversed string
    */
    public static String reverseString(String input) {
        String inputString = input;
        if (inputString.length() > 0) {
            final char myChar = inputString.charAt(0);
            inputString = inputString.substring(1);
            inputString = reverseString(inputString);
            inputString += myChar;
        }
        return inputString;
    }
}
