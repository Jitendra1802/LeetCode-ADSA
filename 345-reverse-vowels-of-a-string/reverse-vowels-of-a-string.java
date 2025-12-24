class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        char ch[]=s.toCharArray();
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(!isVowel(ch[l])){
                l++;
            }
            else if(!isVowel(ch[r])){
                r--;
            }else{
                char temp=ch[l];
                ch[l]=ch[r];
                ch[r]=temp;
                l++;
                r--;
            }
        }
        return String.valueOf(ch);

    }
    public static boolean isVowel(char ch){
        if(ch=='a'|| ch=='e' ||ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }
}