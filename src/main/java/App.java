import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception{
        System.out.println("WELCOME TO THE CAESAR CIPHER");
        while (true) {
            System.out.println("CHOOSE 1 for Encryption or 2 for Decryption");
            Scanner input = new Scanner(System.in);
            String choice = input.nextLine().toLowerCase();
            if (choice.equals("1")) {
                System.out.println("Enter text to be encrypted: ");
                String plainText = input.nextLine().toLowerCase();
                System.out.println("Enter the shift value: ");
                int shiftValue = input.nextInt();
                EncryptDecrypt message = new EncryptDecrypt(plainText, shiftValue);
                System.out.println("Plain Text: " + message.getTextMessage() + "\n Shift Value of: " + message.getShiftBy());
                System.out.println("Encrypted Text: " + message.encryption());
                break;
            }else if (choice.equals("2")) {
                System.out.print("Enter text to be decrypted: ");
                String encryptedText = input.nextLine().toLowerCase();
                System.out.print("Enter the shift value: ");
                int reverseShiftValue = input.nextInt();
                EncryptDecrypt encryptText = new EncryptDecrypt(encryptedText, reverseShiftValue);
                System.out.print("Decrypted Message: " + encryptText.decryption());
                break;
            }else{
                System.out.println("Invalid choice. Try again");
            }
        }
    }
}
