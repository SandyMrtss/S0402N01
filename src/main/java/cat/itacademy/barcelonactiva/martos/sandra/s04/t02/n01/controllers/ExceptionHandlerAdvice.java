package cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n01.controllers;

import jakarta.persistence.EntityNotFoundException;
import org.hibernate.NonUniqueObjectException;
import org.springframework.http.*;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;


@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleValidationException(MethodArgumentNotValidException ex){
        return ResponseEntity.badRequest().body("Input not valid \n" + ex.getMessage());
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<String> handleNotFoundException(EntityNotFoundException ex){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No element found with id");
    }

}
