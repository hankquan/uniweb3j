package com.xchainunion.web3j.tx;

import java.math.BigInteger;

public class FtGasProvider {

    public BigInteger getGasPrice() {
        return BigInteger.valueOf(100000000000L);
    }

    public BigInteger getGasLimit() {
        return BigInteger.valueOf(10000000L);
    }

}
