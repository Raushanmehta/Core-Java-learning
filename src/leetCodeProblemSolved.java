

public class leetCodeProblemSolved {

    public boolean isPalindrome(int x) {
        // If x is negative or ends with a zero (except zero itself), it cannot be a palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        // Reverse the second half of the number and compare it with the first half
        while (x > reversed) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // For even-length numbers, x and reversed are equal; for odd-length numbers, reversed/10 will remove the middle digit
        return x == reversed || x == reversed / 10;
    }
}
