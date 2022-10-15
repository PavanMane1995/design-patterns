package creational.builder.carcomponents;

import lombok.Data;

@Data
public class MusicSystem {
    private boolean isPresent;
    private String brand;

    public MusicSystem(boolean isPresent, String brand) {
        this.isPresent = isPresent;
        this.brand = brand;
    }
}
