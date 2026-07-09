class Solution {
    public boolean isPalindrome(String s) {
        String pallindrom = s.replace(" ","").toLowerCase();
        int l = pallindrom.length();
        int p1 = 0;
        int p2 = l-1;
        while(p2>=p1){
            char c1 = pallindrom.charAt(p1);
            char c2 = pallindrom.charAt(p2);
            if(!Character.isLetterOrDigit(c1)){
                p1++;
                continue;
            }
            if(!Character.isLetterOrDigit(c2)){
                p2--;
                continue;
            }
            if(c1==c2){
                p1++;
                p2--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
