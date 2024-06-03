package org.example.collect;

import org.example.model.Player;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Создание списка игроков
        List<Player> players = new ArrayList<>();

        // Добавление 10 объектов Player в список
        players.add(new Player(1L, "Alice", LocalDate.of(1990, 1, 1)));
        players.add(new Player(2L, "Bob", LocalDate.of(1992, 2, 2)));
        players.add(new Player(3L, "Charlie", LocalDate.of(1994, 3, 3)));
        players.add(new Player(4L, "David", LocalDate.of(1996, 4, 4)));
        players.add(new Player(5L, "Eve", LocalDate.of(1998, 5, 5)));
        players.add(new Player(6L, "Frank", LocalDate.of(2000, 6, 6)));
        players.add(new Player(7L, "Grace", LocalDate.of(2002, 7, 7)));
        players.add(new Player(8L, "Hank", LocalDate.of(2004, 8, 8)));
        players.add(new Player(9L, "Ivy", LocalDate.of(2006, 9, 9)));
        players.add(new Player(10L, "Jack", LocalDate.of(1999, 10, 10)));
        players.add(new Player(10L, "Jack", LocalDate.of(1999, 10, 10)));

        ArrayList<Player> collect = players.stream()
                .filter(player -> {
                    LocalDate localDate = LocalDate.now();
                    Period period = Period.between(player.getLocalDate(), localDate);
                    return period.getYears() >= 18;
                })
                .collect(Collectors.toCollection(ArrayList::new));



        List<Player> collect2 = players.stream()
                .filter(player -> {
                    LocalDate localDate = LocalDate.now();
                    Period period = Period.between(player.getLocalDate(), localDate);
                    return period.getYears() >= 18;
                })
                .collect(Collectors.toList());


        Set<Player> collect4 = players.stream()
                .filter(player -> {
                    LocalDate localDate = LocalDate.now();
                    Period period = Period.between(player.getLocalDate(), localDate);
                    return period.getYears() >= 18;
                })
                .collect(Collectors.toSet());



        List<Player> collect5 = players.stream()
                .filter(player -> {
                    LocalDate localDate = LocalDate.now();
                    Period period = Period.between(player.getLocalDate(), localDate);
                    return period.getYears() >= 18;
                })
                .toList();

        collect.forEach(e->System.out.println(e));
    }
}
