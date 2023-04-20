package creational.builder.carcomponents;

import lombok.Data;

@Data
public class Airbag {
    private boolean isPresent;
    private int count;

    public Airbag(boolean isPresent, int count) {
        this.isPresent = isPresent;
        this.count = count;
    }
}
