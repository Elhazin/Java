import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


class Program {
    public static void main(String[] args) {
        File file = new File("abouzanb.jpg"); // Change this to your file name
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] signature = new byte[8]; // Read the first 8 bytes for the signature
            int bytesRead = fis.read(signature);

               String hex = bytesToHex(signature);


            System.out.println(hex);

              
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
      public static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            // Mask with 0xFF to get unsigned value, then convert to hex string
            hexString.append(String.format("%02X", b & 0xFF));
        }
        return hexString.toString();
    }
}
