class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String a1 = my_string.substring(0,s);
        String a2 = my_string.substring(s,e+1);
        String a3 = my_string.substring(e+1,my_string.length());
        //System.out.println(a1+"/"+a2+"/"+a3);
        String reverse = "";
        for(int i=a2.length()-1;i>=0;i--){
            reverse = reverse + a2.charAt(i);
        }
        answer = a1 + reverse + a3;
        return answer;
    }
}