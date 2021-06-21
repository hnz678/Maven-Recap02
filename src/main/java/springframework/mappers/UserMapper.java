package springframework.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import springframework.domain.User;
import springframework.model.UserCommand;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserCommand userToUserCommand(User user);

    User userCommandToUser(UserCommand userCommand);
}
