package tokenContract;

import address.Address;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;


public class TokenContract {
    //Atributos
    private Address address = null;
    private String name = "";
    private String symbol = "";
    private double totalSupply = 0;
    private Map<PublicKey, Double> balances = new HashMap<>();

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

    public double totalSupply() {
        return this.totalSupply;
    }

    public Map<PublicKey, Double> getBalances() {
        return this.balances;
    }

    //Métodos

    @Override
    public String toString() {
        return "\n" + "name = " + getName() + "\n" +
                "symbol = " + getSymbol() + "\n" +
                "totalSupply = " + totalSupply() + "\n" +
                "owner PK = " + address.getPK().hashCode() + "\n";
    }

    public void addOwner(PublicKey pk, double tokens) {
        balances.putIfAbsent(address.getPK(), tokens);
    }
}
