package CursoBatismoJava.NivelAvancado.StreamsP1;

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

        ninjaList.stream()
                .filter(ninja -> ninja.getVila().equals("Konoha"))
                .sorted((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .forEach(System.out::println); // soutc
    }
}
