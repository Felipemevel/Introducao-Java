package CursoBatismoJava.NivelAvancado.StreamsP2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ninja> ninjaList = new ArrayList<>();
        ninjaList.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        ninjaList.add(new Ninja("Sasuke Uchiha", 18, "Konoha"));
        ninjaList.add(new Ninja("Gaara", 18, "Suna"));
        ninjaList.add(new Ninja("Temari", 19, "Suna"));
        ninjaList.add(new Ninja("Rock Lee", 17, "Konoha"));
        ninjaList.add(new Ninja("Sakura Haruno", 17, "Konoha"));

        // .stream

//        ninjaList.stream()
//                .sorted((n1, n2) -> n1.getNome().compareTo(n2.getNome()))
//                .forEach(System.out::println);

//        ninjaList.stream()
//                .map(Ninja::getNome)
//                .forEach(System.out::println);

        Ninja ninjaMaisVelho = ninjaList.stream()
                .max((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .orElse(null);

        System.out.println(ninjaMaisVelho);
    }
}
