package sb_crud.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import sb_crud.dto.UserDto;
import sb_crud.service.UserService;

@Slf4j
@RestController
@RequestMapping(path = "/user")
@RequiredArgsConstructor
public class UserController {

	private final UserService service;

	@PostMapping("/")
	public void post(@RequestBody UserDto user) {
		try {
			service.post(user);
		} catch (Exception e) {
			log.error("Error:: INCORRECT REQUEST!!!");
		}
	}

	@GetMapping(path = "/{id}")
	public UserDto get(@PathVariable(value = "id") int id) {
		try {
			return service.get(id);
		} catch (Exception e) {
			log.error("Error:: ELEMENT IS NOW FOUND");
			return null;
		}
	}

	@PutMapping(path = "/{id}")
	public void put(@PathVariable(value = "id") int id, @RequestBody UserDto user) {
		try {

		} catch (Exception e) {
			log.error("Error:: INVALID PUT REQUEST!!!");
		}
		service.put(id, user);
	}

	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable(value = "id") int id) {
		try {
			service.delete(id);
		} catch (Exception e) {
			log.error("Error:: DELETE ERROR");
		}
	}
}
