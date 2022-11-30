package ge.me.springneo4jdemo.repository;

import ge.me.springneo4jdemo.model.Aircraft;
import org.springframework.data.repository.CrudRepository;

public interface AircraftRepository extends CrudRepository<Aircraft, Long> {
}
