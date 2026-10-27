class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb= new StringBuilder();
        int c=0;
        for(int i=0; i<strs[0].length(); i++){
            char ch=strs[0].charAt(c);
            sb.append(ch);
           for (int j = 0; j < strs.length; j++) {
                if (strs[j].length() < i + 1 ||
                    !strs[j].substring(0, i + 1).equals(sb.toString())) {

                    sb.deleteCharAt(sb.length() - 1);
                    return sb.toString();
                }
            }
            c++;
        }
        return sb.toString();

    }
}