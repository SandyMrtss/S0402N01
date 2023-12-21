package cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n01.model.domain;

import jakarta.persistence.*;

@Entity
@Table(name="fruits")
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @Column(name="amount")
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
