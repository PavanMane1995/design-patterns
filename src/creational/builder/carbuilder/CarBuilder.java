package creational.builder.carbuilder;

import creational.builder.carcomponents.*;

import java.util.List;

public class CarBuilder {

    private Engine engine;
    private Fuel fuel;
    private Seat seatList;
    private Airbag airbag;
    private MusicSystem musicSystem;
    private SunRoof sunRoof;

    public Engine getEngine() {
        return engine;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public Seat getSeatList() {
        return seatList;
    }

    public Airbag getAirbag() {
        return airbag;
    }

    public MusicSystem getMusicSystem() {
        return musicSystem;
    }

    public SunRoof getSunRoof() {
        return sunRoof;
    }

    public static Builder builder() {return new Builder();}

     public static class Builder{
        private Engine engine;
        private Fuel fuel;
        private Seat seatList;
        private Airbag airbag;
        private MusicSystem musicSystem;
        private SunRoof sunRoof;

        public Builder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public Builder setFuel(Fuel fuel) {
            this.fuel = fuel;
            return this;
        }

        public Builder setSeatList(Seat seatList) {
            this.seatList = seatList;
            return this;
        }

        public Builder setAirbag(Airbag airbag) {
            this.airbag = airbag;
            return this;
        }

        public Builder setMusicSystem(MusicSystem musicSystem) {
            this.musicSystem = musicSystem;
            return this;
        }

        public Builder setSunRoof(SunRoof sunRoof) {
            this.sunRoof = sunRoof;
            return this;
        }

        public CarBuilder build(){
            CarBuilder car = new CarBuilder();
            car.airbag = this.airbag;
            car.engine = this.engine;
            car.fuel = this.fuel;
            car.musicSystem = this.musicSystem;
            car.seatList = this.seatList;
            car.sunRoof = this.sunRoof;
            return car;
        }
    }
}
