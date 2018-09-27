/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolinomioInterpolNewthon;

/**
 *
 * @author tomas.quinonez
 */
public class Interpolacion {
    public static double difDivOrden1(int x0,int x1){
        return (f(x1)-f(x0))/(x1-x0);
    }
    public static double difDivOrden2(int x0,int x1,int x2){
        return ((difDivOrden1(x1,x2))-difDivOrden1(x0,x1))/(x2-x0);
    }
    public static double polInterpolacionNewthon(double x0,double x1,double x2){
        return 3;
    }
    public static double f(int x){
        double res=0;
        switch(x){
            case 0:
                res=2.8;break;
            case 1:
                res=3.75;break;
            case 2:
                res=3.1;break;
            case 3:
                res=2.4;break;
            case 4:
                res=1;break;
        }
        return res;
    }
}
