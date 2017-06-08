/**
 * Created by joseph on 5/25/17.
 */
public class ArraysAndStrings {

    /**
     * Method given a string find if it is unique
     * O(n) solution
     * @return boolean true or false
     */
    public boolean isUnique(String s){
        boolean[] characters = new boolean[128]; //ascii characters

        for(int i = 0; i < s.length(); i++){
            if(characters[s.charAt(i)] == true){
                return false;
            }

            characters[s.charAt(i)] = true;
        }

        return true;
    }

    /**
     * Given two strings is string 2 a permutation of string 1
     * @param s1
     * @param s2
     * @return boolean true or false
     */
    public boolean isPermutation(String s1, String s2){
        if(s1.length() != s2.length()){ // assume whitespaces are significant
            return false;
        }


    }

    /**
     * Method to urlify a string, ie turn all whitespaces into '%20'
     * Assume there is enough space in the character array for the new characters
     * @param s char[] original
     * @param len is the "true" length of the string
     * @return
     */
    public char[] urlIfy(char[] s, int len){
        char[] n = new char[len];

        int j = 0;
        for(int i = 0; i < s.length; i++){
            if(s[i] == ' '){
                n[j] = '%';
                j++;
                n[j] = '2';
                j++;
                n[j] = '0';
                j++;
            }else{
                n[j] = s[i];
                j++;
            }
        }

        return n;
    }

    /**
     * Method to check a string if it is a permutation of a palindrome
     * Assume characters are lowercase and letters, ignore whitespaces in consideration
     * @param n
     * @return boolean result
     */
    public boolean palindromePermutation(String n){

        return true;
    }
}
