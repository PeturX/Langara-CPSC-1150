import java.util.Scanner;


public class Coder {
    static int key;
    static char[] text;

    /**
     * Convert number in decimal base to binary base
     * @param decimal Number in decimal base
     * @return Number in binary base
     */
    public static String decToBin(int decimal) {
        String binary = "";
        // For 2^7 to 2^0
        for (int exp = 7; exp >= 0; exp--) {
            if (decimal >= Math.pow(2, exp)) {
                binary += "1";
                decimal -= Math.pow(2, exp);
            } else binary += "0";
        }
        return binary;
    }

    public static String encrypt(char character) {
        // Convert character to ASCII code
        int asciiCode = (int)character;

        // If character is not in alphabet
        if (!(asciiCode >= 65 && asciiCode <= 90) || !(asciiCode >= 97 && asciiCode <= 122))
            return decToBin(asciiCode);

        // If character is uppercase
        if (asciiCode >= 65 && asciiCode <= 90) {
            asciiCode += key;
            // If character after encrypted is go over alphabet, then start back at the beginning
            if (asciiCode > 90) asciiCode -= 65;
            return decToBin(asciiCode);
        }

        // The only case is lowercase
        asciiCode += key;
        // If character after encrypted is go over alphabet, then start back at the beginning
        if (asciiCode > 122) asciiCode -= 97;
        return decToBin(asciiCode);
    }

    /**
     * Get input from key board
     */
    public static void getInput() {
        Scanner input = new Scanner(System.in);
        
        // Get message in String then convert to char and save to text.
        System.out.print("Enter cipher text: ");
        text = input.nextLine().toCharArray();

        System.out.print("Enter cipher key: ");
        key = input.nextInt();

        input.close();
    }

    public static void main(String args[]) {
        getInput();
        for (int index = 0; index < text.length; index++) {
            System.out.print(encrypt(text[index]));
        }
        System.out.println();
    }
}
