import java.util.*;

public class A1_1 {
    public int minimumDeletions(String s) {
        int len = s.length();
        if(len==1)return 0;
        int currSize = 1;
        char check = 'a';
        ArrayList<Pair> list = new ArrayList<>();
        for(int i=0;i<len;i++){
            if(s.charAt(i)==check){
                currSize++;
            }else{
                list.add(new Pair(check,currSize));
                currSize = 1;
                check = check=='a' ? 'b' : 'a' ; 
            }
        }

        return 345;
    }
class Pair{
    char s ;
    int count;
    public Pair(char s, int count){
        this.s = s;
        this.count = count;
    }
}
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();                
    }
}
