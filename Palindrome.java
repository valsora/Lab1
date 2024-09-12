public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(isPalindrome(args[i]) + " ");
        }
    }
    public static String reverseString(String s) {
        String reversedS = "";
        for (int i = s.length() - 1; i >= 0; i --) {
            reversedS += s.charAt(i);
        }
        return reversedS;
    }
    public static boolean isPalindrome(String s) {
        if (s.equals(reverseString(s))) return true;
        else return false;
    }
}