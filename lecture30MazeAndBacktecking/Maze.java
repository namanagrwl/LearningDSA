package com.naman.lecture30MazeAndBacktecking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        System.out.println(path("",3,3));
    }

    static int count(int r, int c){
        if( r==1 || c==1){
            return 1;
        }

        int left = count(r-1, c);
        int right = count (r,c-1);

        return right+left;
    }

    static ArrayList<String> path(String p,int r, int c ){
        if (r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(r>1){
            ans.addAll(path(p + "D", r-1, c));
        }

        if (c>1){
            ans.addAll(path(p+"R", r, c-1));
        }


        return ans;
    }
}