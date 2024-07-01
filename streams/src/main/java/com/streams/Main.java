package com.streams;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Persona> listaPersone1 = List.of(new Persona("Giovanni", 26), new Persona("Pierluigi", 20), new Persona("Matteo", 24), new Persona("Davide", 25));
        List<Persona> listaPersone2 = List.of(new Persona("Luca", 29), new Persona("Filippo", 21), new Persona("Giovanni", 26), new Persona("Mauro", 17));
        List<List<Persona>> listaPersone = List.of(listaPersone1, listaPersone2);

        // calcolo età massima
        System.out.println("\nEtà massima");
        Optional<Integer> maxEta = listaPersone.stream()
                .flatMap(l -> l.stream())
                .map(x -> x.getEta())
                .max(Integer::compare);
        System.out.println(maxEta.get());

        // stampa lista senza doppioni ordinate
        System.out.println("\nPersone senza doppioni");
        listaPersone.stream()
                .flatMap(l -> l.stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // trova persone maggiorenni
        System.out.println("\nPersone maggiorenni");
        listaPersone.stream()
                .flatMap(l -> l.stream())
                .distinct()
                .filter(p -> p.getEta() >= 18)
                .map(x -> x.getNome())
                .forEach(System.out::println);

        // stampa media età
        System.out.println("\nMedia delle età");
        double media = listaPersone.stream()
                .flatMap(l -> l.stream())
                .distinct()
                .mapToInt(p -> p.getEta())
                .average()
                .getAsDouble();
        System.out.printf("%.2f", media);

        // stampa nome più lungo
        System.out.println("\nNome più lungo");
        Persona nomePiuLungo = listaPersone.stream()
                .flatMap(l -> l.stream())
                .max((x, y) -> Integer.compare(x.getNome().length(), y.getNome().length()))
                .get();

        System.out.println(nomePiuLungo.getNome());



    }
}