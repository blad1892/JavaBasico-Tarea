package cla;

import herencia.SmartPhone;
import herencia.SmartWhatch;

public class SmartDevice {
    double heightPantalla;
    double widthPantalla;
    String tipoPantalla;
    String bateria;
    String memoriaInterna;
    double peso;
    int cantidadBotones;
    String color;
    String tipoMaterial;
    String sistemaOperativo;
    String memoriaRam;
    String memoriaRom;
    String cpu;
    String fabricante;
    String modelo;
    String marca;
    SmartPhone smartPhone;
    SmartWhatch smartWhatch;

    public SmartDevice() {
    }

    public SmartDevice(double heightPantalla, double widthPantalla, String tipoPantalla, String bateria, String memoriaInterna, double peso, int cantidadBotones, String color, String tipoMaterial, String sistemaOperativo, String memoriaRam, String memoriaRom, String cpu, String fabricante, String marca, String modelo, SmartPhone smartPhone) {
        this.heightPantalla = heightPantalla;
        this.widthPantalla = widthPantalla;
        this.tipoPantalla = tipoPantalla;
        this.bateria = bateria;
        this.memoriaInterna = memoriaInterna;
        this.peso = peso;
        this.cantidadBotones = cantidadBotones;
        this.color = color;
        this.tipoMaterial = tipoMaterial;
        this.sistemaOperativo = sistemaOperativo;
        this.memoriaRam = memoriaRam;
        this.memoriaRom = memoriaRom;
        this.cpu = cpu;
        this.fabricante = fabricante;
        this.modelo=modelo;
        this.marca=marca;
        this.smartPhone=smartPhone;
    }
    //Metodo toString para SmartPhone

    public String toStringPhone() {
        return "SmartDevice{" +
                "heightPantalla=" + heightPantalla +
                ", widthPantalla=" + widthPantalla +
                ", tipoPantalla='" + tipoPantalla + '\'' +
                ", bateria='" + bateria + '\'' +
                ", memoriaInterna='" + memoriaInterna + '\'' +
                ", peso=" + peso +
                ", cantidadBotones=" + cantidadBotones +
                ", color='" + color + '\'' +
                ", tipoMaterial='" + tipoMaterial + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", memoriaRam='" + memoriaRam + '\'' +
                ", memoriaRom='" + memoriaRom + '\'' +
                ", cpu='" + cpu + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", smartPhone=" + smartPhone +
                '}';
    }
    //Metodo toString() para smartWatch


    public String toStringWatch() {
        return "SmartDevice{" +
                "heightPantalla=" + heightPantalla +
                ", widthPantalla=" + widthPantalla +
                ", tipoPantalla='" + tipoPantalla + '\'' +
                ", bateria='" + bateria + '\'' +
                ", memoriaInterna='" + memoriaInterna + '\'' +
                ", peso=" + peso +
                ", cantidadBotones=" + cantidadBotones +
                ", color='" + color + '\'' +
                ", tipoMaterial='" + tipoMaterial + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", memoriaRam='" + memoriaRam + '\'' +
                ", memoriaRom='" + memoriaRom + '\'' +
                ", cpu='" + cpu + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", smartWhatch=" + smartWhatch +
                '}';
    }

    public SmartDevice(double heightPantalla, double widthPantalla, String tipoPantalla, String bateria, String memoriaInterna, double peso, int cantidadBotones, String color, String tipoMaterial, String sistemaOperativo, String memoriaRam, String memoriaRom, String cpu, String fabricante, String modelo, String marca, SmartWhatch smartWhatch) {
        this.heightPantalla = heightPantalla;
        this.widthPantalla = widthPantalla;
        this.tipoPantalla = tipoPantalla;
        this.bateria = bateria;
        this.memoriaInterna = memoriaInterna;
        this.peso = peso;
        this.cantidadBotones = cantidadBotones;
        this.color = color;
        this.tipoMaterial = tipoMaterial;
        this.sistemaOperativo = sistemaOperativo;
        this.memoriaRam = memoriaRam;
        this.memoriaRom = memoriaRom;
        this.cpu = cpu;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.marca = marca;
        this.smartWhatch = smartWhatch;
    }
}
