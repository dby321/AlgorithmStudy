package com.yaxinanquan;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/9/17 14:53:12
 */
public class Problem3 {
    static ArrayList<ArrayList<int[]>> list=new ArrayList<>();
    static int[] arr=new int[2];
    public static void main(String[] args) {
        int[][] maze=new int[][]{{0, 0, 0},{0, 1, 0}, {0, 0, 0}};
        System.out.println(findPathsCnt(maze));
    }
    public static int findPathsCnt (int[][] maze) {
        boolean[][] visited=new boolean[maze.length][maze[0].length];
        arr=new int[]{maze.length-1,maze.length-1};
        int i = backTrack(maze, visited, 0, 0, new LinkedList<>());
//        list.forEach(item->{item.forEach(item1-> System.out.print(item1[0]+","+item1[1]+" "));
//            System.out.println();
//        });
        return i;
    }
    public static int backTrack(int[][] maze, boolean[][] visited,int nowI,int nowJ, LinkedList<int[]> trace){
        if(nowI<0||nowI>=maze.length||nowJ<0||nowJ>=maze.length){
            return 0;
        }
        if(maze[nowI][nowJ]==1){
            return 0;
        }
        if(visited[nowI][nowJ]&&(nowI!=0||nowJ!=0)){
            return 0;
        }
        if(nowI==0&&nowJ==0&&trace.contains(arr)){
            list.add(new ArrayList<>(trace));
            return 1;
        }
        //可以往上下左右走
        visited[nowI][nowJ]=true;
        if(nowI==maze.length-1&&nowJ==maze.length-1){
            trace.add(arr);
        }else {
            trace.add(new int[]{nowI, nowJ});
        }
        int one=backTrack(maze,visited,nowI+1,nowJ,trace);
        int two=backTrack(maze,visited,nowI-1,nowJ,trace);
        int three=backTrack(maze,visited,nowI,nowJ+1,trace);
        int four=backTrack(maze,visited,nowI,nowJ-1,trace);
        trace.removeLast();
        visited[nowI][nowJ]=false;
        return one+two+three+four;
    }
}
