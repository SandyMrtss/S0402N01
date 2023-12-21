package cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n01.model;

import jakarta.persistence.*;

@Entity
@Table(name="FRUITS")
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="NAME",length = 40, nullable = false)
    private String name;
    @Column(name="AMOUNT", length = 10, nullable = false)
    private int amountKg;

    public Fruit(){

    }

    public Fruit(String name, int amountKg) {
        this.name = name;
        this.amountKg = amountKg;
    }


}
