package nunes.tales.service;

import nunes.tales.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
