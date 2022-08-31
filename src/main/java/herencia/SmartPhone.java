package herencia;

import cla.SmartDevice;

public class SmartPhone extends SmartDevice {

    String resolucionPantalla;
    String megaPx_camara_frontal;
    String megaPx_camara_trasera;
    String sensorHuellaDatilares;
    String reconocimientoFacial;
    double almacenaminetoExt;
    String redMovil;
    String redWifi;
    String redbluetooth;

    public SmartPhone() {
    }

    public SmartPhone(String resolucionPantalla, String megaPx_camara_frontal, String megaPx_camara_trasera, String sensorHuellaDatilares, String reconocimientoFacial, double almacenaminetoExt, String redMovil, String redWifi, String redbluetooth) {
        this.resolucionPantalla = resolucionPantalla;
        this.megaPx_camara_frontal = megaPx_camara_frontal;
        this.megaPx_camara_trasera = megaPx_camara_trasera;
        this.sensorHuellaDatilares = sensorHuellaDatilares;
        this.reconocimientoFacial = reconocimientoFacial;
        this.almacenaminetoExt = almacenaminetoExt;
        this.redMovil = redMovil;
        this.redWifi = redWifi;
        this.redbluetooth = redbluetooth;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "resolucionPantalla='" + resolucionPantalla + "\n" +
                ", megaPx_camara_frontal='" + megaPx_camara_frontal + "\n" +
                ", megaPx_camara_trasera='" + megaPx_camara_trasera + "\n" +
                ", sensorHuellaDatilares='" + sensorHuellaDatilares + "\n"+
                ", reconocimientoFacial='" + reconocimientoFacial + "\n" +
                ", almacenaminetoExt=" + almacenaminetoExt +
                ", redMovil='" + redMovil + "\n" +
                ", redWifi='" + redWifi + "\n" +
                ", redbluetooth='" + redbluetooth + "\n" +
                '}';
    }
}
