package dev.nanoservices;

import dev.nanoservices.world.manifestation.port.System;

public class Main {

    public static void main(String[] args){

        System system = new HelloSystem();

        system.setVersion("v0.0.1");


    }

}
