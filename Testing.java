package _3esercizi.Maps;

import java.util.HashMap;
import java.util.Map;

public class Testing {
    public static void main(String[] args) {
        HashMap<Integer, String> oneToFiveNumbers = new HashMap();
        oneToFiveNumbers.put(1, "One");
        oneToFiveNumbers.put(2, "Two");
        oneToFiveNumbers.put(3, "Three");
        oneToFiveNumbers.put(4, "Four");
        oneToFiveNumbers.put(5, "Five");

        HashMap<Integer, String> oddsNumbersItalians = new HashMap<>();
        oddsNumbersItalians.put(1, "Uno");
        oddsNumbersItalians.put(3, "Tre");
        oddsNumbersItalians.put(5, "Cinque");
        oddsNumbersItalians.put(7, "Sette");
        oddsNumbersItalians.put(9, "Nove");

        oddsNumbersItalians.putAll(oneToFiveNumbers);

        for (Map.Entry<Integer, String> entry : oddsNumbersItalians.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }

        for (int i = 5; i < 10; i++) {
            if (oddsNumbersItalians.containsKey(i)) {
                System.out.println(oddsNumbersItalians.get(i));
            } else {
                System.out.println("No associated value");
            }
        }

    }
}


