package thao.demospringboot.service.motor;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import thao.demospringboot.model.motor.Motor;
import thao.demospringboot.repository.motor.IMotorRepository;

import java.util.Optional;

@Service
public class motorService implements IMotorService{
    @Autowired
    private IMotorRepository motorRepository;
    @Override
    public Iterable<Motor> findAll() {
        return motorRepository.findAll();
    }

    @Override
    public Optional<Motor> findById(Long id) {
        return motorRepository.findById(id);
    }

    @Override
    public Motor save(Motor motor) {
        return motorRepository.save(motor);
    }

    @Override
    public void remove(Long id) {
    motorRepository.deleteById(id);
    }

    @Override
    public Page<Motor> findAll(Pageable pageable) {
        return motorRepository.findAll(pageable);
    }

    @Override
    public Iterable<Motor> findMotorByName(String name) {
        return motorRepository.findMotorByName(name);
    }
}
