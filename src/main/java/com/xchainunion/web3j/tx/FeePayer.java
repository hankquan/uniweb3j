package com.xchainunion.web3j.tx;

import org.web3j.crypto.Credentials;

import java.math.BigInteger;

/**
 * @author howaric@163.com
 * @date 2019/12/12
 */
public class FeePayer {

    private BigInteger gasPrice;
    private String payerAccount;
    private Credentials payerCredential;

    public BigInteger getGasPrice() {
        return gasPrice;
    }

    public void setGasPrice(BigInteger gasPrice) {
        this.gasPrice = gasPrice;
    }

    public String getPayerAccount() {
        return payerAccount;
    }

    public void setPayerAccount(String payerAccount) {
        this.payerAccount = payerAccount;
    }

    public Credentials getPayerCredential() {
        return payerCredential;
    }

    public void setPayerCredential(Credentials payerCredential) {
        this.payerCredential = payerCredential;
    }

}
