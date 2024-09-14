import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class LargestSumCycle {

    public static int largestSumCycle(int n, ArrayList<Integer> edges) {
        int[] count = new int[n];
        for (int it : edges) {
            if (it == -1) continue;
            count[it]++;
        }
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (count[i] == 0) {
                vis[i] = true;
                q.offer(i);
            }
        }
        while (!q.isEmpty()) {
            int s = q.poll();
            int p = edges.get(s);
            if (p == -1) continue;
            count[p]--;
            if (count[p] == 0) {
                q.offer(p);
                vis[p] = true;
            }
        }
        int res = -1;
        for (int i = 0; i < n; i++) {
            if (vis[i]) continue;
            int val = 0;
            for (int st = i; !vis[st]; st = edges.get(st)) {
                val += st;
                vis[st] = true;
            }
            res = Math.max(res, val);
        }
        return res;
    }
    public static void main(String[] ak){
        ArrayList<Integer> edges = new ArrayList<>(Arrays.asList(1,3,5,5,6,4,64,6,4,5,54,3,4,5));
        int n = 23;
        int []a = new int[] {435,234,35,4,54634,54,34};
    }
}