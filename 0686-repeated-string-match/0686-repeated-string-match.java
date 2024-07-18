class Solution {
    public int repeatedStringMatch(String a, String b) {
        boolean[] map = new boolean[26];
        for(int i = 0; i < a.length(); i++){
            map[a.charAt(i)-'a'] = true; 
        }
        for(int i = 0; i < b.length(); i++){
            if(map[b.charAt(i)-'a'] == false){
                return -1; 
            }
        }
        int count = 1; 
        StringBuilder sb = new StringBuilder(a); 
        while(sb.length() < b.length()){
            sb.append(a); 
            count++; 
        }
        if(sb.indexOf(b)>=0){
            return count; 
        }
        sb.append(a); 
        count++; 
        if(sb.indexOf(b)>=0){
            return count; 
        }
        return -1; 

        
    }
}