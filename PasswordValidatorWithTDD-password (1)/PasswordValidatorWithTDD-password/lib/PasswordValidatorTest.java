package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        PasswordStrength result1 = PasswordValidator.validate("123");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        }

        PasswordStrength result2 = PasswordValidator.validate("phatnarin");
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed: Having only lowercase letters is WEAK."); 
        } else {
            System.out.println("Test Case 2 FAILED: Expected INVALID but got " + result2);
        }

        PasswordStrength result3 = PasswordValidator.validate("Phatnarin");
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 Passed: Having uppercase letters and lowercase letters is MEDIUM."); 
        } else {
            System.out.println("Test Case 3 FAILED: Expected INVALID but got " + result3);
        }

        PasswordStrength result4 = PasswordValidator.validate("Phatdk01");
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 Passed: Having uppercase letters, lowercase letters and number is STRONG."); 
        } else {
            System.out.println("Test Case 4 FAILED: Expected INVALID but got " + result4);
        }
        



        // --- เขียน Test Case อื่นๆ ต่อ ---

        System.out.println("--------------------------------");
    }
}
