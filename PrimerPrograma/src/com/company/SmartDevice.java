package com.company;

public class SmartDevice {
    double pulgadas;
    String name;
    String modelo;
    String fabricante;
    double precio;

    public SmartDevice(double pulgadas, String name, String modelo, String fabricante, double precio) {
        this.pulgadas = pulgadas;
        this.name = name;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.precio = precio;
    }

    public SmartDevice() {

    }

    public static class SmartPhone extends SmartDevice{
          String sysOperativo;
          int numero;

        public SmartPhone(double pulgadas, String name, String modelo, String fabricante, double precio, String sysOperativo, int numero) {
            super(pulgadas, name, modelo, fabricante, precio);
            this.sysOperativo = sysOperativo;
            this.numero = numero;
        }

        public SmartPhone() {
            super();
        }
    }
    public static class SmartWatch extends SmartDevice{
        String color;
        int talla;

        public SmartWatch(double pulgadas, String name, String modelo, String fabricante, double precio, String color, int talla) {
            super(pulgadas, name, modelo, fabricante, precio);
            this.color = color;
            this.talla = talla;
        }

        public SmartWatch(){
            super();
        }
    }
}
