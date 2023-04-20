package creational.builder;

import creational.builder.carbuilder.CarBuilder;
import creational.builder.carcomponents.*;

public class Factory {

    public static void main(String[] args) {
        Engine engine = new Engine("EN123", "4Stroke");
        Fuel fuel = new Fuel("petrol");
        Seat seat = new Seat(4);
        Airbag airbag = new Airbag(true,4);
        MusicSystem musicSystem = new MusicSystem(true, "Boos");

        CarBuilder tataSumo = CarBuilder.builder().setEngine(engine)
                .setAirbag(airbag)
                .setFuel(fuel)
                .setSeatList(seat)
                .build();

        System.out.println(tataSumo.getEngine().getEngineNo());

    }
}
