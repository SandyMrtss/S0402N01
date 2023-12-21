package cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n01.controllers;

import cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n01.model.Fruit;
import cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n01.model.repository.FruitRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

//CRUD: create read update delete
@RestController
public class FruitController {
    @Autowired
    FruitRepository fruitRepository;

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruit>> getAll(){
        try{
            List<Fruit> fruits = new ArrayList<>();
            fruits.addAll(fruitRepository.findAll());
            if(fruits.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(fruits, HttpStatus.OK);
        }
        catch (Exception ex){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
