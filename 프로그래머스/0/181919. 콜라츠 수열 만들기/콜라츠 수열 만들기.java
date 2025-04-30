import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int n) {
        // int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int i = 0;
        list.add(n);
        while(true){
            if(n%2==0){
                n = n/2;
            }else{
                n = (3*n)+1;
            }
            list.add(n);
            System.out.println(n);
            i += 1;
            if(n==1){
                break;
            }
        }
        System.out.println(list);
        // answer = list.toArray(new Integer[list.size()]);
        int[] answer = list.stream().mapToInt(j -> j).toArray();
        return answer;
    }
}