package thao.demospringboot.service.motor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import thao.demospringboot.model.motor.Motor;
import thao.demospringboot.service.IGeneralService;

public interface IMotorService extends IGeneralService<Motor> {
    Page<Motor> findAll(Pageable pageable);
    Iterable<Motor> findMotorByName(String name);
}
