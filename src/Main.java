class PasswordChecker {
    public boolean isValid(String password) {
        int length = password.length();
        return length >= 8 && length <= 16;
    }
}

class TestPasswordChecker {
    public static void Main(String[] args) {
        PasswordChecker checker = new PasswordChecker();
        assert !checker.isValid("abcdefg") : "7 characters must be invalid";
        assert checker.isValid("abcdefgh") : "8 characters must be valid";
        assert checker.isValid("abcdefghij") : "10 characters must be valid";
        assert checker.isValid("abcdefghijklmnop") : "16 characters must be valid";
        assert !checker.isValid("abcdefghijklmnopq") : "17 characters must be invalid";
        System.out.println("✅ All edge value tests succeeded.");
    }
}


 

