package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int M = 5, N = 5;
        int x1 = 0, y1 = 0, x2 = 0, y2 = 3, x3 = 4, y3 = 0;
        float l1 = rasL(x1, y1, x2, y2), l2 = rasL(x2, y2, x3, y3), l3 = rasL(x1, y1, x3, y3);
        ArrayList<Treangle> treangles = new ArrayList<>();
        ArrayList<Ravn> ravns = new ArrayList<>();

        int i = 0;
        while (i != M) {
            x1 = -10 + (int) (Math.random() * 10);
            y1 = -10 + (int) (Math.random() * 10);
            x2 = -10 + (int) (Math.random() * 10);
            y2 = -10 + (int) (Math.random() * 10);
            x3 = -10 + (int) (Math.random() * 10);
            y3 = -10 + (int) (Math.random() * 10);
            l1 = rasL(x1, y1, x2, y2);
            l2 = rasL(x2, y2, x3, y3);
            l3 = rasL(x1, y1, x3, y3);
            if ((Math.pow(l1, 2) + Math.pow(l2, 2)) > Math.pow(l3, 2)
                    && (Math.pow(l3, 2) + Math.pow(l2, 2)) > Math.pow(l1, 2)
                    && (Math.pow(l1, 2) + Math.pow(l3, 2)) > Math.pow(l2, 2)) {
                treangles.add(i,new Treangle(x1, y1, x2, y2, x3, y3, l1, l2, l3));
                System.out.println("Треугольник " + (i+1) + " : "
                        + "x1,y1,x2,y2,x3,y3=" + x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3
                        + "; S=" + treangles.get(i).getS()
                        + "; L1,L2,L3=" + l1 + " " + l2 + " " + l3
                        + "; Периметр=" + treangles.get(i).getPer()
                        + "; Углы A,B,C=" + treangles.get(i).getA() + " " + treangles.get(i).getB() + " " + treangles.get(i).getC());
                i++;
            }
        }

        i = 0;
        while (i != N) {
            x1 = -10 + (int) (Math.random() * 10);
            y1 = -10 + (int) (Math.random() * 10);
            x2 = -10 + (int) (Math.random() * 10);
            y2 = -10 + (int) (Math.random() * 10);
            x3 = -10 + (int) (Math.random() * 10);
            y3 = -10 + (int) (Math.random() * 10);
            l1 = rasL(x1, y1, x2, y2);
            l2 = rasL(x2, y2, x3, y3);
            l3 = rasL(x1, y1, x3, y3);
            if ((Math.pow(l1, 2) + Math.pow(l2, 2)) == Math.pow(l3, 2) && l1 > 0 && l2 >0 && l3 > 0) {
                ravns.add(i,new Ravn(x1, y1, x2, y2, x3, y3, l1, l2, l3));
                System.out.println("Прямоугольный треугольник " + (i+1) + " : "
                        + "x1,y1,x2,y2,x3,y3=" + x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3
                        + "; S=" + ravns.get(i).getS()
                        + "; L1,L2,L3=" + l1 + " " + l2 + " " + l3
                        + "; Периметр=" + ravns.get(i).getPer()
                        + "; Углы A,B,C=" + ravns.get(i).getA() + " " + ravns.get(i).getB() + " " + ravns.get(i).getC());
                i++;
            }
        }

        float maxS = treangles.get(0).getS();
        int nom = 0;
        for (i=0; i<M; i++){
            if (treangles.get(i).getS() > maxS){
                maxS = treangles.get(i).getS();
                nom = i;
            }
        }
        System.out.println("Максимальная площадь у треугольника: " + (nom+1) + " Она равна " + treangles.get(nom).getS());

        for (i=0; i<N; i++){
            for (int k = N-1; k>0; k--){
                if (ravns.get(i).getL1() == ravns.get(k).getL1() && ravns.get(i).getL2() == ravns.get(k).getL2() && ravns.get(i).getL3() == ravns.get(k).getL3()){
                    if (k != i && i>k)
                    System.out.println("Равны " + (i+1) + " и " + (k+1));
                }
            }
        }



    }

    public static float rasL(int xx1,int yy1,int xx2,int yy2){
        return (float) Math.sqrt(Math.pow((xx2-xx1),2) + Math.pow((yy2-yy1),2));
    }

}
