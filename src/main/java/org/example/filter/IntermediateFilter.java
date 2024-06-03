package org.example.filter;

import org.example.model.Player;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateFilter {
    public static void main(String[] args) {
        String [] logins = {"Login1", "Login2", "login3"};
        Stream<String> stream = Arrays.stream(logins);

        Stream<String> stringStream = stream.filter(s -> Character.isUpperCase(s.charAt(0)));


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
        players.add(new Player(10L, "Jack", LocalDate.of(2008, 10, 10)));


        //получили стрим из листа
        Stream<Player> stream1 = players.stream();
        //отфильтровали и получили новый стрим
        Stream<Player> playerStream = stream1.filter(player -> player.getFirstName().length() > 3);

        playerStream.forEach(player -> System.out.println(player.getFirstName()));

        System.out.println();
        Stream<Player> stream2 = players.stream();
        Stream<Player> playerStream1 = stream2.filter(player -> player.getID() > 5);
        playerStream1.forEach(player -> System.out.println(player));//финальный метод стрима

       Stream <Player> stream3  = players.stream();

        System.out.println();
       stream3.filter(player -> {
            LocalDate localDate = LocalDate.now();
            Period period = Period.between(player.getLocalDate(), localDate);
            return period.getYears() >= 18;
        })
        .forEach(player -> System.out.println(player));
    }
}
