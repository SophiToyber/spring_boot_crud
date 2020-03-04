package sb_crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sb_crud.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	User findById(int id);
}
