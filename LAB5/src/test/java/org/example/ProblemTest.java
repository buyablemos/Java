package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

    @Test
    public void czy_zwrocono_conajmniej_jeden() {

        Problem backpack = new Problem(1,1,1,10);
        backpack.Solve(15);


        assertFalse(backpack.map.isEmpty(),"Jeden przedmiot o wadze losowanej z przedzialu 1:10 powinien sie zmiescic w plecaku o pojemnosci 15");

    }

    @Test
    public void czy_zwrocono_puste() {

        Problem backpack = new Problem(1,1,5,10);
        backpack.Solve(4);

        assertTrue(backpack.map.isEmpty(),"Przedmiot o wadze losowanej w przedziale 5:10 nie powinien sie zmiescic w plecaku o pojemnosci 4");

    }


    @Test
    public void czy_mieszcza_sie_w_granicach() {

        int lower=30;
        int upper=60;

        Problem backpack = new Problem(40,1,lower,upper);

        for(Item i : backpack.przedmioty){

            assertAll("Testy wagi i wartossci",
                    ()->   assertTrue(i.weight>=lower&&i.weight<=upper,"Waga powinna miescic sie w przedziale <lowerBound,upperBound>"),
                    ()->   assertTrue(i.value>=lower&&i.value<=upper,"Wartosc powinna miescic sie w przedziale <lowerBound,upperBound>")
            );

        }

    }

@Test
    public void czy_waga_i_wartosc_sie_zgadza() {

        int testFinalValue=0;
        int testFinalWeight=0;

        Problem backpack = new Problem(5,1,20,100);
        backpack.przedmioty.clear();
        backpack.przedmioty=new ArrayList<Item>();
        backpack.przedmioty.add(new Item(0,4,10));
        backpack.przedmioty.add(new Item(1,2,10));
        backpack.przedmioty.add(new Item(2,2,20));
        backpack.przedmioty.add(new Item(3,1,40));
        backpack.przedmioty.add(new Item(4,2,100));
        backpack.Solve(11);

        assertAll("Testy konkretnej instancji:",
                ()-> assertEquals(540, backpack.finalvalue, "Wartosc nie zgadza sie z poprawnie wyliczona"),
                ()-> assertEquals(11, backpack.finalweight, "Waga nie zgadza sie z poprawnie wyliczona")
        );

    }

}