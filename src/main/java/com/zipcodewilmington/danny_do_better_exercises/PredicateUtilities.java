package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class PredicateUtilities {
    /**
     * @param x
     * @param y
     * @return true if `x` is greater than `y`
     */
    public Boolean isGreaterThan(int x, int y) {

        boolean greater = false;

        if(x > y) {
            greater = true;
        } else {
            greater = false;
        }

        return greater;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than `y`
     */
    public Boolean isLessThan(int x, int y) {

        boolean less = false;

        if (x < y) {
            less = true;
        } else {
            less = false;
        }

        return less;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is greater than or equal to `y`
     */
    public Boolean isGreaterThanOrEqualTo(int x, int y) {

        boolean greatEqual = false;

        if (x >= y) {
            greatEqual = true;
        } else {
            greatEqual = false;
        }

        return greatEqual;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than or equal to `y`
     */
    public Boolean isLessThanOrEqualTo(int x, int y) {

        boolean lessEqual = false;

        if (x <= y) {
            lessEqual = true;
        } else {
            lessEqual = false;
        }

        return lessEqual;
    }


    /**
     * @return true
     */
    public Boolean returnTrue() {


        return true;
    }

    /**
     * @return false
     */
    public Boolean returnFalse() {
        return false;
    }

}