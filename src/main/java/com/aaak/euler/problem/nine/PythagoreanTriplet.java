package com.aaak.euler.problem.nine;

public class PythagoreanTriplet {

    public static void main(String [] args){
        int requiredSum = 1000;

        //This is not DONE
        PTriplet pTriplet = new PTriplet(requiredSum);

        Triplet triplet = pTriplet.next();
        while ( triplet != null ){
            System.out.println(triplet);
            triplet = pTriplet.next();
            break;
        }
    }
}
