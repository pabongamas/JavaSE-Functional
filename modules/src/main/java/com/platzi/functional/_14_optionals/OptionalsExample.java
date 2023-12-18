package com.platzi.functional._14_optionals;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class OptionalsExample {
    public static void main(String[] args) {
        List<String> names = getNames();
        if (names != null) {
            // operar con nombres.
        }

        Optional<List<String>> optionalNames = getOptionalNames();
        if (optionalNames.isPresent()) {

        }

        optionalNames.ifPresent(namesValue -> namesValue.forEach(System.out::println));

        Optional<String> valuablePlayer = optionalValuablePlayer();
        String valuablePlayerName = valuablePlayer.orElseGet(() -> "No player");
    }

    static List<String> getNames() {
        List<String> list = new LinkedList<>();
        return Collections.emptyList();
    }

    static String mostValuablePlayer() {
        return null;
    }

    static int mostExpensiveItem() {
        return -1;
    }

    static Optional<List<String>> getOptionalNames() {
        List<String> nameList = new LinkedList<>();
        // Obtencion de nombres
        return Optional.of(nameList);
    }

    static Optional<String> optionalValuablePlayer() {
        try {
            return Optional.of("jhon");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

}
