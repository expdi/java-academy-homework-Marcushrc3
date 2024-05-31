package expeditors.backend.week12.repository;

import expeditors.backend.week12.model.Adopter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdopterRepo extends JpaRepository<Adopter, Long> {

}
