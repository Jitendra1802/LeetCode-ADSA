class Solution {
    public String reverseWords(String s) {
        String word[]=s.trim().split("\\s+");
        String a="";
        for(int i=word.length-1;i>=0;i--){
            a=a+word[i];
            if(i!=0){
                a+=" ";
            }
        }
        return a;
    }
}