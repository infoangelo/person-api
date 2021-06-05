package pw.angelo.personapi.repository;
import pw.angelo.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, Long> {

}
