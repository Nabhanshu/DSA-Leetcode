class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length()!=t.length()){
            return false;
        }
        int arr1[] = new int [26];
        int arr2[] = new int [26];
        for(int i=0; i<s.length(); i++){
            int x = s.charAt(i)-97;
            int y = t.charAt(i)-97;
            arr1[x]++;
            arr2[y]++;
        }
        for(int i=0; i<26; i++){
            if(arr1[i]==arr2[i]){
                continue;
            }
            else{
                return false;
            }
        } return true;
        
    }
}