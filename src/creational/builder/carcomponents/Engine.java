package creational.builder.carcomponents;

import lombok.Data;

@Data
public class Engine {
    private String engineNo;
    private String type;

    public Engine(String engineNo, String type) {
        this.engineNo = engineNo;
        this.type = type;
    }
}
