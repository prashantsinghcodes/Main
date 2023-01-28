package dsa.array.easy.promblemsonarray;

public class P3 {
    public static void main(String[] args) {
        System.out.print(isPalindrome(""));
    }

    private static boolean isPalindrome(String input) {
        if(input.length() == 0 || input.length() == 1)
            return true;
        if(input.charAt(0) == input.charAt(input.length() - 1)) {
            return isPalindrome(input.substring(1, input.length()-1));
        } else {
            return false;
        }
    }
}
