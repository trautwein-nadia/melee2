package com.meleeChat;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Created by nadia on 2/18/2016.
 */
public final class SecureRandomString {
    private SecureRandom random = new SecureRandom();

    public String nextString() {
        return new BigInteger(130, random).toString(32);
    }

}
