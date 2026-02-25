//Valid Anagram
//anagram
//nagaram
// I will review this more and enhance, I will finish first my exam then analyze it more

class Solution{
    public Boolean Confirm(String s, String t){
        if(s.length() != t.length()) return false;
        int [] char_count = new int[26];

        for(int i = 0; i < t.length();i++){
            char_count[s.charAt(i)- 'a']++;
            char_count[t.charAt(i)- 'a']--;
        }

        for(int count : char_count){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}


package ADDITIONAL;
public class Array09 {
    public static void main(String [] args){
        String s = "anagram";
        String t = "nagaram";

        Solution sol = new Solution();
        sol.Confirm(s, t);
    }
}
