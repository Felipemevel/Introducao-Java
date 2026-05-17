package CursoBatismoJava.NivelIntermediario.Generics;

public class Main {
    public static void main(String[] args) {
        EquipamentosNinja kunai = new EquipamentosNinja("Kunai de ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken de chumbo");

        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamento(kunai);
        bolsaGenerica.adicionarEquipamento(shuriken);

        System.out.println(bolsaGenerica);
    }
}
