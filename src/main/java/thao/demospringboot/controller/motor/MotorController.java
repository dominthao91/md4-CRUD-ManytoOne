package thao.demospringboot.controller.motor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import thao.demospringboot.model.category.Category;
import thao.demospringboot.model.motor.Motor;
import thao.demospringboot.service.category.ICategoryService;
import thao.demospringboot.service.motor.IMotorService;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/motors")
@CrossOrigin("*")
public class MotorController {
    @Autowired
    private IMotorService motorService;
    @Autowired
    private ICategoryService categoryService;

    @ModelAttribute("categoryList")
    public Iterable<Category> categories() {
        return categoryService.findAll();
    }
//    @GetMapping("")
//    public ResponseEntity<Iterable<Motor>> showAllMotor(){
//        List<Motor> motors = (List<Motor>) motorService.findAll();
//        if (motors.isEmpty()){
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<>(motors,HttpStatus.OK);
//    }
    @PostMapping("/")
    public ResponseEntity<Motor> create(@RequestBody Motor motor){
        motorService.save(motor);
        return new ResponseEntity<>(motor, HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity<Iterable<Motor>>list(){
        return new ResponseEntity<>(motorService.findAll(),HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Motor> update( @RequestBody Motor motor) {
        return new ResponseEntity<>(motorService.save(motor), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Motor> showUpdate(@PathVariable Long id) {
        Optional<Motor> motor = motorService.findById(id);
        if (!motor.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(motor.get(),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Motor> delete(@PathVariable Long id){
        motorService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
