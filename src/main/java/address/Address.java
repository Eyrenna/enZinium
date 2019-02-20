package address;

import enzinium.GenSig;
import tokenContract.TokenContract;

import java.security.PrivateKey;
import java.security.PublicKey;

public class Address {
    //Atributos
    private PublicKey PK = null;
    private PrivateKey SK = null;
    private double balance = 0d;


    //Constructor
    public Address() {
    }

    //Setters
    public void setPK(PublicKey pk) {
        this.PK = pk;
    }

    public void setSK(PrivateKey sk) {
        this.SK= sk;
    }


    //Getters
    public PublicKey getPK() {
        return PK;
    }

    public PrivateKey getSK() {
        return SK;
    }

    public double getBalance() {
        return this.balance;
    }

    //Métodos
    public void generateKeyPair() {
        setPK(GenSig.generateKeyPair(getPK()).getPublic());
        setSK(GenSig.generateKeyPair(getPK()).getPrivate());
    }

    @Override
    public String toString() {
        return "\n" + "Pk = " + getPK().hashCode() + "\n" +
                "balance = " + getBalance() + " EZI" + "\n";
    }



}
