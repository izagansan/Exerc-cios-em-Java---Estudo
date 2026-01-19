public class JedliksToyCar {

    private int distanceDriven = 0;
    private int batteryPercentage = 100;

    // 1️⃣ Compra um novo carro
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    // 2️⃣ Mostra a distância
    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    // 3️⃣ Mostra a bateria
    public String batteryDisplay() {
        if (batteryPercentage == 0) {
            return "Battery empty";
        }
        return "Battery at " + batteryPercentage + "%";
    }

    // 4️⃣ Dirige o carro
    public void drive() {
        if (batteryPercentage > 0) {
            distanceDriven += 20;
            batteryPercentage -= 1;
        }
    }
}
