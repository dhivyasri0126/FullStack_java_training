package com.example.studentprofiledemo;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.*;

@RestController

public class SpiralController {

    @GetMapping("/test")
    public ArrayList<Integer> test() {

        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = mat.length;
        int cols = mat[0].length;

        ArrayList<Integer> result = new ArrayList<>();

        int t = 0, b = rows - 1;
        int l = 0, r = cols - 1;

        while (t <= b && l <= r) {

            for (int i = l; i <= r; i++) {
                result.add(mat[t][i]);
            }
            t++;

            for (int i = t; i <= b; i++) {
                result.add(mat[i][r]);
            }
            r--;

            if (t <= b) {
                for (int i = r; i >= l; i--) {
                    result.add(mat[b][i]);
                }
                b--;
            }

            if (l <= r) {
                for (int i = b; i >= t; i--) {
                    result.add(mat[i][l]);
                }
                l++;
            }
        }

        return result;
    }
}