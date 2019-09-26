import java.util.Random;

public class PasswordRandomizer {
    private int passwordLength;
    private Random random;

    public PasswordRandomizer(int length) {
        random = new Random();
        this.passwordLength = length;
    }

    public String createPassword() {
        String password = "";
        int x = 0;
        while (x < this.passwordLength){
            int index = random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(index);
            password += symbol;
            x++;
        }
        return password;
    }
}
