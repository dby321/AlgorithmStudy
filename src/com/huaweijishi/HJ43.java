package com.huaweijishi;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/3 16:36:35
 */
public class HJ43 {
    static HashMap<String, Boolean> memo = new HashMap<>();
    static List<List<int[]>> bigList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] arr = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            LinkedList<int[]> trace = new LinkedList<>();
            trace.add(new int[]{0, 0});
            memo.put("0_0", true);
            backTrack(arr, 0, trace, 0, 0);
            List<int[]> ints = bigList.stream().sorted((i1, i2) -> {
                return i1.size() - i2.size();
            }).collect(Collectors.toList()).get(0);
            printTrace(ints);
        }
    }

    public static void backTrack(int[][] arr, int minPath, LinkedList<int[]> trace, int nowN, int nowM) {
        if (nowN == arr.length - 1 && nowM == arr[0].length - 1 && arr[nowN][nowM] == 0) {
            bigList.add(new ArrayList<>(trace));
            return;
        }
        if (arr[nowN][nowM] == 1) {
            return;
        }
        int[][] plus = new int[4][2];
        plus[0] = new int[]{0, 1};
        plus[1] = new int[]{1, 0};
        plus[2] = new int[]{0, -1};
        plus[3] = new int[]{-1, 0};
        for (int i = 0; i < 4; i++) {
            if (nowN + plus[i][0] >= 0 && nowN + plus[i][0] < arr.length && nowM + plus[i][1] >= 0 && nowM + plus[i][1] < arr[0].length) {
                if (!memo.containsKey(nowN + plus[i][0] + "_" + nowM + plus[i][1])) {
                    trace.addLast(new int[]{nowN + plus[i][0], nowM + plus[i][1]});
                    memo.put(nowN + plus[i][0] + "_" + nowM + plus[i][1], true);
                    backTrack(arr, minPath + 1, trace, nowN + plus[i][0], nowM + plus[i][1]);
                    trace.removeLast();
                    memo.remove(nowN + plus[i][0] + "_" + nowM + plus[i][1]);
                }
            }
        }
    }

    public static void printTrace(List<int[]> trace) {
        for (int i = 0; i < trace.size(); i++) {
            System.out.println("(" + trace.get(i)[0] + "," + trace.get(i)[1] + ")");
        }
    }
}
