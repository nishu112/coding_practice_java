package codechef;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class CHKPTS {

    private static void getMinRequiredCheckPoints(int[][] coordinates, int c) {

        Map<Pair<Double, Integer>, ArrayList<Double>> map = new HashMap<Pair<Double, Integer>, ArrayList<Double>>();

        Map<Pair<Double, Integer>, Set<Integer>> st = new HashMap();

        for (int i = 0; i < coordinates.length; ++i) {

            Double slope;
            Integer remain = coordinates[i][1] % c;
            if (coordinates[i][0] == 0) {
                slope = Double.MAX_VALUE;
            } else {
                slope = coordinates[i][1] * 1.0 / coordinates[i][0];
            }

            Pair<Double, Integer> key = new Pair<Double, Integer>(slope, remain);

            if (st.containsKey(key)) {
                continue;
            }

            for (int j = i + 1; j < coordinates.length; ++j) {

                if ((coordinates[i][0] - coordinates[j][0]) % c == 0 &&
                        (coordinates[i][1] - coordinates[j][1]) % c == 0) {

                    if (!map.containsKey(key)) {
                        double y1 = coordinates[i][1];
                        double x1 = coordinates[i][0];
                        double distStart = Math.sqrt((x1) * (x1) + (y1) * (y1));
                        ArrayList<Double> distance = new ArrayList<Double>();
                        distance.add(distStart);
                        map.put(key, distance);
                        Set<Integer> indexes = new HashSet<Integer>();
                        indexes.add(i);
                        st.put(key, new HashSet<Integer>(indexes));
                    }

                    double x2 = coordinates[j][0];
                    double y2 = coordinates[j][1];

                    double dist = Math.sqrt((x2) * (x2) + (y2) * (y2));
                    map.get(key).add(dist);
                    st.get(key).add(i);
                    st.get(key).add(j);

                }

            }

        }

        Integer minMoves = 0;

        for (Map.Entry<Pair<Double, Integer>, ArrayList<Double>> myMapEntry : map.entrySet()) {

            Pair<Double, Integer> slopeWithC = myMapEntry.getKey();
            ArrayList<Double> distanceFromOrigin = myMapEntry.getValue();
            Set<Integer> indexes = st.get(slopeWithC);
            Double sum = getSum(distanceFromOrigin)/indexes.size();


            for (Integer index : indexes) {
                minMoves+=(int)Math.abs(sum-getDistanceFromOrigin(coordinates[index][0],coordinates[index][1]));
            }



        }

        System.out.println(st.size() + " " + minMoves);
        System.out.println();


    }

    private static Double getSum(ArrayList<Double> distanceFromOrigin) {
        Double totalSum = 0.0;

        for (Double dist : distanceFromOrigin) {
            totalSum += dist;
        }

        return totalSum;

    }

    private static Double getDistanceFromOrigin(int x, int y) {
        return Math.sqrt((x) * (x) + (y) * (y));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();

            int[][] coordiantes = new int[n][2];

            for (int i = 0; i < n; ++i) {
                coordiantes[i][0] = sc.nextInt();
                coordiantes[i][1] = sc.nextInt();
            }

            getMinRequiredCheckPoints(coordiantes, c);

        }

    }
}
