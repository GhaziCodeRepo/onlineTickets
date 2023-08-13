package domain.exercise.bms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.exercise.bms.model.User;
import domain.exercise.bms.repository.UserRepository;
import domain.exercise.bms.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserById(Long userId) {
		return null;
        // Implement logic to get user by userId
    }

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

    // Implement other methods as needed
}
