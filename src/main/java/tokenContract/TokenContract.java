package tokenContract;

import address.Address;

public class TokenContract {
    //Atributos
    private Address address = null;
    private String name = "";
    private String symbol = "";
    private double totalSupply = 0;

    //Constructor
    public TokenContract(Address address) {
        this.address = address;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setTotalSupply(double totalSupply) {
        this.totalSupply = totalSupply;
    }

    //Getters
    public String getName() {
        return this.name;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public double getTotalSupply() {
        return this.totalSupply;
    }

    //Métodos

    /*@Override
    public String toString() {
        return "\n" + "name = " + TokenContract.getName() + "\n" +
                "symbol = " + getSymbol() + "\n" +
                "totalSupply = " + getTotalSupply() + "\n" +
                "owner PK = " + getAddOwner() + "\n";
    }*/
}