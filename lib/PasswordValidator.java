package lib;

public class PasswordValidator {

    /**
     * case  password must be 8-16 characters long.
     * case  password should have at least one appercase letter.
     * case  password should have at least one lowercase letter.
     * case  password should have at least one number. 
     * case  password should have at least one symbol.
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        
        if(password==null || password.length()<8)
           return PasswordStrength.INVALID;
        
        boolean hasLower = false ;
        boolean hasUpper = false ;
        boolean hasDigit = false ;
        //boolean hasAd = false ;

        for(char c : password.toCharArray()) {
            if(Character.isLowerCase(c))
            hasLower = true ;
            else if(Character.isUpperCase(c))
            hasUpper = true ;
            else if(Character.isDigit(c))
            hasDigit = true ;
            //else if(Character.isLetterOrDigit(c))
            //hasAd = true ;
        }

        if(hasUpper && !hasLower && !hasDigit) return PasswordStrength.WEAK ;

        if(!hasUpper && hasLower && !hasDigit) return PasswordStrength.WEAK ;

        if(!hasUpper && !hasLower && hasDigit) return PasswordStrength.WEAK ;

        if(hasUpper && hasLower && !hasDigit) return PasswordStrength.WEAK ;

        if(hasUpper ^ hasLower && hasDigit) return PasswordStrength.MEDIUM ;

        if(hasUpper && hasLower && hasDigit) return PasswordStrength.STRONG ;


        //int minLength = 8 ; // TODO: มีอะไรขาดหายไปที่บรรทัดนี้?
        
        return PasswordStrength.INVALID ; // TODO: การคืนค่านี้ถูกต้องหรือไม่?
    }
}