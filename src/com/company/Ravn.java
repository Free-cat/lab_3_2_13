package com.company;

public class Ravn extends Treangle {
    Ravn(int x1, int y1, int x2, int y2, int x3, int y3, float l1, float l2, float l3) {
        super(x1, y1, x2, y2, x3, y3, l1, l2, l3);
        Per = L1+L2+L3;
        S = rasS();
        A = rasAngle(L1, L3, L2);
        B = rasAngle(L2, L3, L1);
        C = rasAngle(L1, L2, L3);
    }
}
