//Reverse a Palindrome String
class Solution {   
    public boolean palindromeCheck(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            // compare characters at l and r (case-insensitive)
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true; // if no mismatch found
    }
}


//Just Reverse a string 
char[] arr = s.toCharArray();
int left = 0, right = arr.length - 1;
while (left < right) {
    char temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
    left++;
    right--;
}
return new String(arr);
