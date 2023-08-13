package domain.exercise.bms.service;

import domain.exercise.bms.model.User;

public interface UserService {
    User getUserById(Long userId);
    // Add more methods based on your requirements

	User createUser(User user);
}
