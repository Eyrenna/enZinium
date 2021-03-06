package tokenContactTest;

import org.junit.Test;
import address.Address;
import tokenContract.TokenContract;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TokenContractTest {

    @Test
    public void payable_test() {

        Address rick = new Address();
        rick.generateKeyPair();
        TokenContract ricknillos = new TokenContract(rick);
        ricknillos.addOwner(rick.getPK(), 100d);
        Address morty = new Address();
        morty.generateKeyPair();

        /*morty.addEZI(20d);*/

        /*// verifico la transferencia de entradas
        ricknillos.payable(morty.getPK(), morty.getBalance());
        assertEquals(4d, ricknillos.balanceOf(morty.getPK()), 0d);

        // verifico la trasnferencia de EZI
        assertEquals(20d, ricknillos.owner().getBalance(), 0d);*/
    }

    @Test
    public void balanceTest() {
        Address rick = new Address();
        rick.generateKeyPair();
        TokenContract ricknillos = new TokenContract(rick);
        ricknillos.addOwner(rick.getPK(), 100d);

        assertEquals(1, ricknillos.getBalances().size());
    }

    @Test
    public void numOwnersTest() {
        Address rick = new Address();
        rick.generateKeyPair();
        TokenContract ricknillos = new TokenContract(rick);
        ricknillos.addOwner(rick.getPK(), 100d);

        assertEquals(1, ricknillos.numOwners());
    }
}
