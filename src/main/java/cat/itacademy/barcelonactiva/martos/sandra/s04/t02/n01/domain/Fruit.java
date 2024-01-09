package cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n01.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name="fruits", uniqueConstraints = @UniqueConstraint(columnNames = {"name"}))
public class Fruit {
    //TODO manage validation, always throws internal server error
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    @NotEmpty(message = "Name cannot be empty nor null")
    private String name;

    @Column(nullable = false)
    @NotNull(message = "Amount cannot be null")
    @Min(message = "Can't have negative amount", value = 0)
    private int amountKg;

    public Fruit(){

    }

    public Fruit(String name, int amountKg) {
        this.name = name;
        this.amountKg = amountKg;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountKg() {
        return amountKg;
    }

    public void setAmountKg(int amountKg) {
        this.amountKg = amountKg;
    }
}
