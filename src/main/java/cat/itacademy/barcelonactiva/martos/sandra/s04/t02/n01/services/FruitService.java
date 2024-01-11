package cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n01.services;

import cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n01.domain.Fruit;

import java.util.*;

public interface FruitService {
    public void addFruit(Fruit fruit);
    public void updateFruit(Fruit fruit);
    public void deleteFruit(long id);
    public Fruit getOneFruit(long id);
    public List<Fruit> getAllFruit();

}
