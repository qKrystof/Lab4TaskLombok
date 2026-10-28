import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "brand")
@ToString(exclude = "quantity")
public class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;

    private int quantity;
}