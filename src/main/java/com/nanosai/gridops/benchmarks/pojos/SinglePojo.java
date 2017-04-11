package com.nanosai.gridops.benchmarks.pojos;

/**
 * A "flat" pojo with no children and no array fields.
 *
 */
public class SinglePojo {
    public boolean aBoolean = true;

    public int     posInt1  = 1;
    public int     posInt2  = 1000000;
    public int     negInt1  = -1;
    public int     negInt2  = -2;

    public float   aFloat   = 1.23f;
    public double  aDouble  = 1.234567d;

    public String  shortString = "0123456789";
    public String  longString  = "abcdefghijklmnopqrstuvxyz0123456789\u0080\u0800";


}
