package org.example.CreateStream;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        int [] arr = {1,2,3,4,5};
        IntStream stream = Arrays.stream(arr);

        Integer []arr2 = {1,2,3,4,5};
        Stream<Integer> stream1 = Arrays.stream(arr2);

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list = new ArrayList<>(list1 );
        Stream<Integer> stream2 = list.stream();

        String text = "Hello World";
        IntStream chars = text.chars();

        Path path = Paths.get("C:\\Users\\user\\Desktop\\StremApi\\src\\main\\java\\org\\example\\CreateStream\\users.csv");
        Stream<String> lines = Files.lines(path);

        Stream<Integer> stream3 = Stream.of(12,3,4,32,34,5,34);


        //фильтр и вывод
        Stream<Integer> stream4 = stream3.filter((e) -> e > 10);//промежуточный метод

        stream4.forEach(e-> System.out.println(e));//терминальный метод


    }
}
