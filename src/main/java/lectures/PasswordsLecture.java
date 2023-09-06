package lectures;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordsLecture {
    public static void main(String[] args) {
        String plainTextPassword = "somepassword123";
        String hashedPassword = BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
        System.out.println(hashedPassword);

        boolean passwordsMatch = BCrypt.checkpw("somepassword123", hashedPassword);
        System.out.println(passwordsMatch);
    }
}
