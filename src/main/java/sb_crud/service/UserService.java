package sb_crud.service;

import static sb_crud.transformer.Transformer.TO_USER_DTO;
import static sb_crud.transformer.Transformer.TO_USER_ENTITY;

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
		repository.save(TO_USER_ENTITY(user));
	}

	public UserDto get(int id) {
		return TO_USER_DTO(repository.findById(id).get());
	}
	
	public void put(int id, UserDto user) {
		User entity = TO_USER_ENTITY(user);
		entity.setId(id);
		repository.save(entity);
	}

	public void delete(int id) {
		repository.deleteById(id);
	}
}