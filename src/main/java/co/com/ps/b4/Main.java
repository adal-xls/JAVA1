package co.com.ps.b4;

public class Main {

    public static void main(String[] args) {

        Mascota mascota1;

        mascota1 = new Mascota(
                "bulldog",
                "simon",
                "negro",
                1.5f,
                "adalbert");

        Mascota mascota2;

        mascota2 = new Mascota(
                "criollo",
                "loki",
                "amarillo",
                2f,
                "yami");

        System.out.println(mascota1.Propietario);
        System.out.println(mascota2.Propietario);
    }
}