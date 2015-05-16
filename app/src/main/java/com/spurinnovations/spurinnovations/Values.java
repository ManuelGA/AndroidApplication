package com.spurinnovations.spurinnovations;

import java.util.Arrays;

/**
 * Created by Manuel on 2015-05-11.
 */
public class Values {

    byte[] value;
    int length;

    Values(byte[] value, int length)
    {
        this.value = Arrays.copyOf(value, length);
        this.length = length;
    }

    public byte[] getValue()
    {
        return value;
    }

    public int getLength()
    {
        return length;
    }

}
