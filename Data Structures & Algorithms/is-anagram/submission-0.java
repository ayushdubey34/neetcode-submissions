class Solution {
    public boolean isAnagram(String s, String t) {
        int l1= s.length();
        int l2 = t.length();
        boolean val = false;
        if(l1!=l2){
            return val;
        }
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String sort1 = new String(arr1);
        String sort2= new String(arr2);
        for(int i=0;i<l1;i++){
            char s1 = sort1.charAt(i);
            char s2 = sort2.charAt(i);
            if(s1!=s2){
                return val;
            }
        }
        val =true;
        return val;
    }
}
