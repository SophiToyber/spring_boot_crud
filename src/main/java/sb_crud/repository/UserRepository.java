package sb_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sb_crud.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
