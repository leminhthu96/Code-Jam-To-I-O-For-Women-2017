/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeJam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author LmThu
 */
public class Prob2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numOfTest = in.nextInt();
        double result = 1;
        double ac1, ac2;

        int roles;
        ArrayList<Double> actor = new ArrayList<Double>();

        for (int i = 0; i < numOfTest; i++) {
            roles = in.nextInt();
            for (int j = 0; j < 2 * roles; j++) {
                actor.add(in.nextDouble());

            }
            Collections.sort(actor);
            for (int k = 0; k < roles; k++) {
                ac1 = actor.get(k);
                ac2 = actor.get(2 * roles - 1 - k);
                if (ac1 == 0.0 || ac2 == 0.0) {
//                    result *=1;
                } else {
                    result *= (1.0 - ac1 * ac2);
                }
            }

            System.out.println("Case #"+(i+1)+": "+result);
            result = 1;
            actor.clear();
        }

    }
}
