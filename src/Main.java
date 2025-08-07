class PasswordChecker {
    public boolean isVald(String password) {
        int length = password.length();
        return length >= 8 && length <= 16;
    }
}

class TestPasswordChecker {
    public static void main(String[] args) {
        PasswordChecker checker = new PasswordChecker();
        assert !checker.isVald("abcdefg") : "7 tekens moet ongeldig zijn";
        assert checker.isVald("abcdefgh") : "8 tekens moet geldig zijn";
        assert checker.isVald("abcdefghij") : "10 tekens moet geldig zijn";
        assert checker.isVald("abcdefghijklmnop") : "16 tekens moet geldig zijn";
        assert !checker.isVald("abcdefghijklmnopq") : "17 tekens moet ongeldig zijn";
        System.out.println("✅ Alle randwaardetests geslaagd.");
    }
}

