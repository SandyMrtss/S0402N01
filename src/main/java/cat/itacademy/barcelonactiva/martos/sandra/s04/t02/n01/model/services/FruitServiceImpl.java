package cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n01.model.services;

import cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n01.model.domain.Fruit;
import cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n01.model.repository.FruitRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FruitServiceImpl implements FruitService{
    @Autowired
    private FruitRepository fruitRepository;

    @Override
    public boolean addFruit(Fruit fruit) {
        try{
            fruitRepository.save(fruit);
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }

    @Override
    public boolean updateFruit(Fruit fruit) {
        try{
            fruitRepository.save(fruit);
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }

    @Override
    public boolean deleteFruit(long id) {
        try{
            fruitRepository.deleteById(id);
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }

    @Override
    public Fruit getOneFruit(long id) throws EntityNotFoundException{
        return fruitRepository.getReferenceById(id);
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
