/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeJam;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author LmThu
 */
public class Prob1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        int friends, size;
        int x, y, key;
        HashMap<Integer, LinkedList<Integer>> row = new HashMap<Integer, LinkedList<Integer>>();
        for (int i = 0; i < testCases; i++) {

            friends = in.nextInt();
            size = in.nextInt();
            int max = 0;
            for (int k = 0; k < friends; k++) {
                x = in.nextInt();
                y = in.nextInt();
                if (row.containsKey(x)) {
                    if (!row.get(x).contains(y)) {
                        row.get(x).add(y);
                    }

                } else {
                    row.put(x, new LinkedList<>());
                    row.get(x).add(y);

                }
                if (row.get(x).size() > max) {
                    max = row.get(x).size();
                }

                if (row.containsKey(y)) {
                    if (!row.get(y).contains(x)) {
                        row.get(y).add(x);
                    }
                } else {
                    row.put(y, new LinkedList<>());
                    row.get(y).add(x);
                }
                if (row.get(y).size() > max) {
                    max = row.get(y).size();
                }
            }

            System.out.println("Case #" + (i + 1) + ": " + max);
            row.clear();

        }

    }
}
