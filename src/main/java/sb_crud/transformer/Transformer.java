package sb_crud.transformer;

import sb_crud.dto.UserDto;
import sb_crud.entity.User;

public class Transformer {

	public static User TO_USER_ENTITY(UserDto user) {
		return User.builder().firstName(user.getFirstName()).secondName(user.getSecondName()).build();
	}

	public static UserDto TO_USER_DTO(User user) {
		return new UserDto(user.getFirstName(), user.getSecondName());
	}

}
