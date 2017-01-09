package com.company;

public class Treangle {
    public int X1,Y1,X2,Y2,X3,Y3;
    public float L1,L2,L3,Per,S,A,B,C;

    Treangle(int x1,int y1,int x2,int y2, int x3, int y3, float l1, float l2, float l3){
        X1 = x1;
        Y1 = y1;
        X2 = x2;
        Y2 = y2;
        X3 = x3;
        Y3 = y3;
        L1 = l1;
        L2 = l2;
        L3 = l3;
        Per = L1+L2+L3;
        S = rasS();
        A = rasAngle(L1, L3, L2);
        B = rasAngle(L2, L3, L1);
        C = rasAngle(L1, L2, L3);
    }

    public float getA() {
        return A;
    }

    public float getB() {
        return B;
    }

    public float getC() {
        return C;
    }

    public int getX1() {
        return X1;
    }

    public int getY1() {
        return Y1;
    }

    public int getX2() {
        return X2;
    }

    public int getY2() {
        return Y2;
    }

    public int getX3() {
        return X3;
    }

    public int getY3() {
        return Y3;
    }

    public float getPer() {
        return Per;
    }

    public float getS(){
        return S;
    }

    public float getL1() {
        return L1;
    }

    public float getL2() {
        return L2;
    }

    public float getL3(){
        return L3;
    }

    protected float rasL(int xx1,int yy1,int xx2,int yy2){
        return (float) Math.sqrt(Math.pow((xx2-xx1),2.0) + Math.pow((yy2-yy1),2.0));
    }

    protected float rasS(){
        float p = Per/2;
        return (float) Math.sqrt(p*(p-L1)*(p-L2)*(p-L3));
    }

    protected float rasAngle(float a, float b, float c){
        return (float) Math.toDegrees(Math.acos((Math.pow(a,2.0)+ Math.pow(b,2.0) - Math.pow(c,2.0))/(2.0*a*b)));
    }
}
