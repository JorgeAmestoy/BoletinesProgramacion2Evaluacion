package boletin20_2;

public class Boletin20_2 {

    public static void main(String[] args) {

        Avestruz truz = new Avestruz();
        String truzz = truz.caminar("A avestruz pode caminar");
        System.out.println(truzz);

        Papagaio papa = new Papagaio();
        String papa1 = papa.volar("O papagaio pode voar\n");
        String papa2 = papa.caminar("O papagaio pode caminar");
        System.out.println(papa1 + papa2);
        Morcego cego = new Morcego();
        String cego1 = cego.caminar("O morcego pode caminar\n");
        String cego2 = cego.volar("O morcego pode volar");
        System.out.println(cego1 + cego2);
        Felino felicianoLopez = new Felino();
        String fel = felicianoLopez.caminar("O felino pode caminar\n");
        String fel2 = felicianoLopez.nadar("O felino pode nadar");
        System.out.println(fel + fel2);
        Gato gatito = new Gato();
        String miau = gatito.caminar("O gato pode caminar\n");
        String miau2 = gatito.nadar("O gato poder nadar");
        System.out.println("miau+miau2");

    }

}
