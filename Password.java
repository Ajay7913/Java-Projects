import java.security.SecureRandom;

public class Password {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*_+";
    private static final int LENGTH = 10;

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(LENGTH);
        for (int i = 0; i < LENGTH; i++) {
            password.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        System.out.println("Genrated Password: " + password.toString());
    }
}
