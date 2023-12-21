package cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n01.controllers;

import cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n01.model.domain.Fruit;
import cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n01.model.services.FruitService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

//CRUD: create read update delete
@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class FruitController {
    @Autowired
    private FruitService fruitService;


    @PostMapping("/add")
    public ResponseEntity<HttpStatus> createFruit(@RequestBody Fruit fruit){
        boolean created = fruitService.addFruit(fruit);
        if(created){
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
        else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<HttpStatus> updateFruit(@PathVariable long id, @RequestBody Fruit fruit){
        try{
            Fruit _fruit = fruitService.getOneFruit(id);
            _fruit.setName(fruit.getName());
            _fruit.setAmountKg(fruit.getAmountKg());
            if(fruitService.updateFruit(_fruit)){
                return new ResponseEntity<>(HttpStatus.OK);
            }
            else throw new EntityNotFoundException();
        }
        catch (EntityNotFoundException ex){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteFruit(@PathVariable() long id){
        boolean created = fruitService.deleteFruit(id);
        if(created){
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
        else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruit> getOne(@PathVariable() long id){
        try{
            Fruit fruit = fruitService.getOneFruit(id);
            return new ResponseEntity<>(fruit, HttpStatus.OK);
        }
        catch (EntityNotFoundException ex){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruit>> getAll(){
        try{
            List<Fruit> fruits = fruitService.getAllFruit();
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
