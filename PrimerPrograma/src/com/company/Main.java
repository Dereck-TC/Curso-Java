package com.company;

import com.company.SmartDevice;

public class Main {
    public static void main(String[] args) {

        SmartDevice smartdevice = new SmartDevice();
        SmartDevice.SmartPhone smartphone = new SmartDevice.SmartPhone(7,"xiaomi","modelo1","fabricante1",980.90,"android",987654321);
        SmartDevice.SmartWatch smartwatch = new SmartDevice.SmartWatch(2.5,"samsung","modelo2","fabricante2",872.50,"negro",20);

        System.out.println(smartphone.pulgadas);
        System.out.println(smartphone.name);
        System.out.println(smartphone.modelo);
        System.out.println(smartphone.fabricante);
        System.out.println(smartphone.precio);
        System.out.println(smartphone.sysOperativo);
        System.out.println(smartphone.numero);

        System.out.println(smartwatch.pulgadas);
        System.out.println(smartwatch.name);
        System.out.println(smartwatch.modelo);
        System.out.println(smartwatch.fabricante);
        System.out.println(smartwatch.precio);
        System.out.println(smartwatch.color);
        System.out.println(smartwatch.talla);

    }
}