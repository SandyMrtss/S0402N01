package cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n01.services;

import cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n01.domain.Fruit;

import java.util.*;

public interface FruitService {
    public boolean addFruit(Fruit fruit);
    public boolean updateFruit(Fruit fruit);
    public boolean deleteFruit(long id);
    public Fruit getOneFruit(long id);
    public List<Fruit> getAllFruit();

}
