package NivelIntermediario.ClassesEObjetos;

public class Ninja {
    String nome;
    int idade;
    String aldeia;

    public void SharinganAtivado(){
        System.out.println("O Sharingan ativou!");
    }

    public String euSouUmNinja(){
        return "Eu sou um ninja!";
    }

    public int anosParaHokage(int idadeMin){
        return idadeMin - idade;
    }
}
