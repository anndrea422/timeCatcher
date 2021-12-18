package User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer > {

    List<User> findAllByNameContaining(String search);

    List<User> findAllById(String search);
}
