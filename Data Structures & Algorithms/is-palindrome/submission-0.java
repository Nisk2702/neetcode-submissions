class Solution {
    public boolean isPalindrome(String s) {

        String str = s.toUpperCase().replaceAll("[^a-zA-z0-9]", "");

        char[] ch = str.toCharArray();

        int i = 0;
        int j = str.length() - 1;

        while(i <= j){
            if(ch[i] == ch[j]){
                i++;
                j--;
            }
            else
             return false;
        }

        return true;
        
    }
}
