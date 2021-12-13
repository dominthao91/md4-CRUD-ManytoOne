package thao.demospringboot.repository.motor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thao.demospringboot.model.motor.Motor;
@Repository
public interface IMotorRepository extends JpaRepository<Motor,Long> {
    Iterable<Motor> findMotorByName(String name);
    Page<Motor> findAll(Pageable pageable);
}
