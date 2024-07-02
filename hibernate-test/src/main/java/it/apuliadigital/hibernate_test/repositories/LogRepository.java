package it.apuliadigital.hibernate_test.repositories;

import it.apuliadigital.hibernate_test.entities.LogEntity;
import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<LogEntity, String> {
}
