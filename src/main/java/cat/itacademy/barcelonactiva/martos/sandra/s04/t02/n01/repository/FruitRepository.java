package cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n01.repository;

import cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n01.domain.Fruit;

import org.springframework.data.jpa.repository.*;

public interface FruitRepository extends JpaRepository<Fruit, Long> {

}
