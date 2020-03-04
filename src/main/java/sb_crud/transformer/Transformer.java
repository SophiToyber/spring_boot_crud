package sb_crud.transformer;

import sb_crud.dto.UserDto;
import sb_crud.entity.User;

public class Transformer {

	public static User toEntity(UserDto user) {
		return new User(user.getFirstName(), user.getSecondName());
	}

	public static UserDto toObject(User user) {
		return new UserDto(user.getFirstName(), user.getSecondName());
	}

}
