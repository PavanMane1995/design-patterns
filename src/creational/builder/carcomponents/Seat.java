package creational.builder.carcomponents;

import lombok.Data;

@Data
public class Seat {
   private int count;

   public Seat(int count) {
      this.count = count;
   }
}
