package sb_crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sb_crud.dto.UserDto;
import sb_crud.service.UserService;

@RestController
@RequestMapping(path = "/user")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/")
	public void post(@RequestBody UserDto user) {
		service.post(user);
	}

	@GetMapping(path = "/{id}")
	public UserDto get(@PathVariable(value = "id") int id) {
		return service.get(id);
	}

	@PutMapping(path = "/{id}")
	public void put(@PathVariable(value = "id") int id, @RequestBody UserDto user) {
		service.put(id, user);
	}

	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable(value = "id") int id) {
		service.delete(id);
	}
}
