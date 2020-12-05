package com.company;

import java.util.List;

public class Solution1 {

    public static void solve(List<Long> input) {
        for (int i=0; i<input.size(); i++){
            for(int j=0; j<input.size(); j++){
                if(i != j && input.get(i)+input.get(j)==2020) {
                    System.out.println(input.get(i)*input.get(j));
                    return;
                }
            }
        }
    }
}
