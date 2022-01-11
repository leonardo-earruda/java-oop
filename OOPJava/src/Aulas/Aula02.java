package Aulas;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.modelo = "Bic cristal";
        c1.cor = "Azul";
        c1.carga = 5;
        c1.status();
        c1.destampar();
        c1.rabiscar();
    }
}
