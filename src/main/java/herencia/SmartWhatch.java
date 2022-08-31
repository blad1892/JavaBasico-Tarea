package herencia;

import cla.SmartDevice;

public class SmartWhatch extends SmartDevice {
    String sensorPulso;
    String estilo;
    double tamanoPulcera;
    String conectividadBluetoo;

    public SmartWhatch() {
    }

    public SmartWhatch(String sensorPulso, String estilo, double tamanoPulcera, String conectividadBluetoo) {
        this.sensorPulso = sensorPulso;
        this.estilo = estilo;
        this.tamanoPulcera = tamanoPulcera;
        this.conectividadBluetoo = conectividadBluetoo;
    }

    @Override
    public String toString() {
        return "SmartWhatch{" +
                "sensorPulso='" + sensorPulso + '\'' +
                ", estilo='" + estilo + '\'' +
                ", tamanoPulcera=" + tamanoPulcera +
                ", conectividadBluetoo='" + conectividadBluetoo + '\'' +
                '}';
    }
}
