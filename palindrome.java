public class Main{

public static void main(String[]args){

System.out.print(palindrome("tacocat"));

}

public static boolean palindrome(String str) {
    String lower = str.toLowerCase();
    String nonLetters = ",.:;()[]{}!@#$%^&* '\"/?- ";
    
    int left = 0;
    int right = lower.length() - 1;
    
    while (left < right) {
        char leftChar = lower.charAt(left);
        char rightChar = lower.charAt(right);
        

        if (nonLetters.contains(leftChar + "")) {
            left++;
        }

        else if (nonLetters.contains(rightChar + "")) {
            right--;
        }

        else {
            if (leftChar != rightChar) {
                return false; 
            }
            left++;
            right--;
        }
    }
    
    return true;
}
}
