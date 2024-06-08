package org.backend;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String currencyCode="USD";

        try {
            double rate = CurrencyAPI.getExchangeRate(currencyCode);
            System.out.println("%s i %s".formatted(rate, 1/rate));
            Database.saveRate(currencyCode,rate);
            List<CurrencyData> dane=Database.getRates(currencyCode);
            for(CurrencyData d:dane){
                System.out.println(d.getCurrencyCode()+" "+d.getRate());
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}