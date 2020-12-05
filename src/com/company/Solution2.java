package com.company;

import java.util.List;

public class Solution2 {

    public static void solve(List<Long> input) {
        for (int i=0; i<input.size(); i++){
            for(int j=0; j<input.size(); j++){
                for (int k = 0; k < input.size(); k++) {
                    boolean notSame = i != k || j != k;
                    if(notSame && input.get(i)+input.get(j) + input.get(k)==2020) {
                        System.out.println(input.get(i)*input.get(j) * input.get(k));
                        return;
                    }
                }
                            }
        }
    }
}
