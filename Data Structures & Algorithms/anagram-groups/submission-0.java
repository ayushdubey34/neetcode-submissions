class Solution {

    public boolean isAnagram(String s1, String s2) {
        
        if (s1.length() != s2.length()) return false;
        
        // Sort both strings
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        // Compare sorted strings
        return Arrays.equals(s1Array, s2Array);
    }


    public List<List<String>> groupAnagrams(String[] strs) {
        int l = strs.length;
        List<List<String>> val = new ArrayList<>();
        int[] flag = new int[l];
        for(int i=0;i<l;i++){
            String s1 = strs[i];
            List<String>data = new ArrayList<>();
            if(flag[i]!=1){
                data.add(s1);
                flag[i] = 1;
            }
            else{
                continue;
            }
            for(int j=i+1;j<l;j++){
                String s2 = strs[j];
                if(isAnagram(s1,s2)){
                    data.add(s2);
                    flag[j] = 1;
                }
            }
            val.add(data);
        }
        return val;
    }
}
