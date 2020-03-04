package sb_crud.service;

import static sb_crud.transformer.Transformer.toEntity;
import static sb_crud.transformer.Transformer.toObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sb_crud.dto.UserDto;
import sb_crud.entity.User;
import sb_crud.repository.UserRepository;;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public void post(UserDto user) {
		repository.save(toEntity(user));
	}

	public UserDto get(int id) {
		return toObject(repository.findById(id));
	}
	
	public void put(int id, UserDto user) {
		User entity = toEntity(user);
		entity.setId(id);
		repository.save(entity);
	}

	public void delete(int id) {
		repository.deleteById(id);
	}
}
