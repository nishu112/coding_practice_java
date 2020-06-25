package codechef;

import java.util.Scanner;

public class CACHEHIT {

    private static Integer getMinCacheHit(int n,int b,int m,int[] queries){
        Integer hits =0;

        int previousCacheBlock =-1;
        int newBlock ;

        for(int i=0;i<queries.length;++i){
            newBlock = (int)Math.ceil((queries[i])/b);
            if(previousCacheBlock != newBlock){
                previousCacheBlock = newBlock;
                hits++;
            }
        }


        return hits;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            int n = sc.nextInt();
            int b = sc.nextInt();
            int m = sc.nextInt();

            int[] queries = new int[m];

            for (int i = 0; i < m; ++i) {
                queries[i] = sc.nextInt();
            }

            System.out.println(getMinCacheHit(n, b, m, queries));

        }

    }
}
