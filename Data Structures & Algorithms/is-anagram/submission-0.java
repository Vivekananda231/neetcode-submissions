class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int a[]= new int[26];
        for(int i=0; i<s.length(); i++){
            char ch1= s.charAt(i);
            a[ch1-'a']++;   
        }

        for(int i=0; i<t.length(); i++){
            char ch2= t.charAt(i);
            a[ch2-'a']--;
            
        }
        for(int i=0; i<a.length; i++){
            if(a[i]!=0){
                return false;
            }
        }
        return true;
    }
}
