import java.util.Scanner;


public class Decode {
    static char[] text;
    static int key;
    final static int BITS = 8; // Number of bits in one byte
    final static int ALPHABET = 26; // Number of character in alphabet

    public static void getInput() {
        Scanner input = new Scanner(System.in);

        System.out.print("Input cypher text: ");
        text = input.nextLine().toCharArray();

        System.out.print("Input cypher key: ");
        key = input.nextInt();

        input.close();
    }

    /**
     * Convert from binary to decimal.
     * @param startIndex The start index of byte in text
     * @return Number in decimal base
     */
    public static int binToDec(int startIndex) {
        int decimal = 0;
        for (int index = startIndex; index < startIndex + BITS; index++) {
            if (text[index] == '1') {
                decimal += Math.pow(2, BITS - 1 - index + startIndex);
            }
        }
        return decimal;
    }

    public static void decrypt() {
        for (int textIndex = 0; textIndex < text.length; textIndex += BITS) {
            int asciiCode = binToDec(textIndex);

            if (!(asciiCode >= 65 && asciiCode <= 90) || !(asciiCode >= 97 && asciiCode <= 122)) {
                System.out.print((char)asciiCode);
                continue;
            }
            
            if (asciiCode >= 65 && asciiCode <= 90) {
                asciiCode -= key;
                if (asciiCode < 65) asciiCode += ALPHABET;
                System.out.print((char)asciiCode); 
                continue;
            }

            asciiCode -= key;
            if (asciiCode < 97) asciiCode += ALPHABET;
            System.out.print((char)asciiCode);
        }
    }

    public static void main(String args[]) {
        getInput();
        decrypt();
        System.out.println();
    }
}
