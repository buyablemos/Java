import org.backend.CurrencyAPI;
import org.backend.CurrencyData;
import org.backend.Database;
import org.backend.HashPassword;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestClass {

    @Test
    public void testGetExchangeRate() {

        String currencyCode = "USD";


        double rate =0;
        try {
            rate = CurrencyAPI.getExchangeRate(currencyCode);
        }
        catch (Exception e) {
            e.printStackTrace();
        }


        assertTrue(rate > 0.0 , "Otrzymano niepoprawną wartość kursu wymiany lub jej brak");
    }

    @Test
    public void testGetRates() {

        String currencyCode = "USD";


        List<CurrencyData> rates = Database.getRates(currencyCode);

        assertNotNull(rates);
        assertFalse(rates.isEmpty());
        assertEquals(currencyCode, rates.getFirst().getCurrencyCode());
    }

    @Test
    public void testSaveRate() {

        String currencyCode = "USD";
        double rate =0;
        try {
             rate = CurrencyAPI.getExchangeRate(currencyCode);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        Database.saveRate(currencyCode, rate);


        assertNotNull(Database.getLast(currencyCode));
        assertEquals(rate, Database.getLast(currencyCode).getRate());
        assertEquals(currencyCode, Database.getLast(currencyCode).getCurrencyCode());
    }


    @Test
    public void testAuthenticateUser() {
        //istniejacy uzytkownik w bazie danych
        String username = "a";
        String password = "a";


        boolean authenticated = Database.authenticateUser(username, password);


        assertTrue(authenticated);
    }

    @Test
    public void testAuthenticateUserWithWrongPassword() {

        String username = "a";
        String password = "b";


        boolean authenticated = Database.authenticateUser(username, password);

        assertFalse(authenticated);

    }

    @Test
    public void testHashing(){

        String correct_hash="c1ba60ce13586503a21a05e9ef0bb959f1ba74a1d37bcfcbf5fc6bfb548f684d";
        assertEquals(correct_hash, HashPassword.hash("Java"));
    }




}
