import cla.SmartDevice;
import herencia.SmartPhone;
import herencia.SmartWhatch;

public class Main {

    static SmartDevice smartDevice;
    static SmartPhone iphone_7;
    static SmartWhatch appleWatch;

    public static void main(String[] args) {
        //CREANDO UN SmartPhone
        iphone_7 = new SmartPhone("1080x900", "12Mp", "12Mp",
                "touch ID", "Face ID", 256, "2G, 3G, 4G, 5G",
                "Wifi 6 802.11ac 2.4GHz", "bluetooth 3.0");
        smartDevice = new SmartDevice(5, 3, "Amoled", "5000Amp",
                "128GB", 0.3, 5, "white", "plastico",
                "iOS 15.6.1", "4GB", "512MB", "4 nucleo",
                "Ipod", "Ipod", "iphone 7", iphone_7);

        System.out.println("Este es un SmartPhone!\n Detalles del Equipo:\n" + smartDevice.toStringPhone() +
                "\n" + iphone_7.toString());

        //Creadon un SmartWatch

        appleWatch = new SmartWhatch("Lucces LED", "Clasico", 13, "802.11");

        smartDevice = new SmartDevice(0.8, 0.8, "Amoled", "2000A",
                "2GB", 0.05, 2, "white", "Metal",
                "iOS 15.6.1", "2GB", "512MB", "1 nucleo",
                "Apple", "Apple Watch", "Apple Watch Serie 7", appleWatch);

        System.out.println("Este es un SmartWhatch!\n Detalles del Equipo:\n" + smartDevice.toStringWatch() +
                "\n" + appleWatch.toStringWatch());


    }


}
