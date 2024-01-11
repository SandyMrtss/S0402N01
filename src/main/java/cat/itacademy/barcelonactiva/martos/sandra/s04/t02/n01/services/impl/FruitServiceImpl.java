package cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n01.services.impl;

import cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n01.domain.Fruit;
import cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n01.repository.FruitRepository;

import cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n01.services.FruitService;
import jakarta.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FruitServiceImpl implements FruitService {
    @Autowired
    private FruitRepository fruitRepository;

    @Override
    public void addFruit(Fruit fruit) {
        fruitRepository.save(fruit);
    }

    @Override
    public void updateFruit(Fruit fruit) {
        fruitRepository.save(fruit);
    }

    @Override
    public void deleteFruit(long id) {
        Optional<Fruit> fruit = fruitRepository.findById(id);
        if(fruit.isPresent()){
            fruitRepository.deleteById(id);
        }
        else{
            throw new EntityNotFoundException();
        }
    }

    @Override
    public Fruit getOneFruit(long id) throws EntityNotFoundException{
        Optional<Fruit> fruit = fruitRepository.findById(id);
        if(fruit.isPresent()){
            return fruit.get();
        }
        else {
            throw new EntityNotFoundException();
        }
    }

    @Override
    public List<Fruit> getAllFruit() {
        try{
            return fruitRepository.findAll();
        }
        catch (Exception ex){
            return new ArrayList<>();
        }
    }
}
