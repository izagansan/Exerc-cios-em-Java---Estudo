public class Lasagna {

    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int tempoMinutos) {
        return expectedMinutesInOven() - tempoMinutos;
    }

    public int preparationTimeInMinutes(int numeroDeCamadas) {
        return 2 * numeroDeCamadas;
    }

    public int totalTimeInMinutes(int numeroDeCamadas, int numeroDePreparo) {
        return numeroDePreparo + preparationTimeInMinutes(numeroDeCamadas);
    }

    public static void main(String[] args) {
        Lasagna val = new Lasagna();
        System.out.println(val.expectedMinutesInOven());
        System.out.println(val.remainingMinutesInOven(30));
        System.out.println(val.preparationTimeInMinutes(2));
        System.out.println(val.totalTimeInMinutes(3, 20));
    }
}
