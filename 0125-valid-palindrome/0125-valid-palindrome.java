class Solution {
    public boolean isPalindrome(String s) {
        String a=s.toLowerCase();
        int start=0;
        int end=s.length()-1;
        while(start<=end){
            char cs=a.charAt(start);
            char ce=a.charAt(end);
            if(!Character.isLetterOrDigit(cs)){
                start++;
            }
            else if(!Character.isLetterOrDigit(ce)){
                end--;
            }
            else{
                if(cs!=ce){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}