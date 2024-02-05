package TechnoHackTasks;

import java.security.SecureRandom;
public class Task_9 {
    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARS  = "!@#$%^&*()_-+=<>?";

    public static String generatePassword(int length , boolean useLowercase , boolean useUppercase , boolean useNumbers , boolean useSpecialChars){
        StringBuilder password = new StringBuilder() ;
        SecureRandom random = new SecureRandom();

        String Chars = "" ;
        if (useLowercase) Chars +=LOWERCASE_CHARS ;
        if (useUppercase) Chars += UPPERCASE_CHARS;
        if (useNumbers) Chars +=NUMBERS ;
        if (useSpecialChars) Chars +=SPECIAL_CHARS ;

        for (int i = 0 ; i<length ; i++){
            int randomIndex = random.nextInt(Chars.length());
            password.append(Chars.charAt(randomIndex));
        }

        return password.toString();
    };
    public static void main(String[] args){
        int length = 12 ; //default Password Length
        boolean useLowerCase = true ;
        boolean useUpperCase = true ;
        boolean useNumbers = true ;
        boolean useSpecialChars = true ;

        String password = generatePassword(length,useLowerCase,useUpperCase,useNumbers,useSpecialChars);
        System.out.println("Generated Password :"+password);
    }
}
