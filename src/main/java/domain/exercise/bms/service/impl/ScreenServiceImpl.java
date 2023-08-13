package domain.exercise.bms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.exercise.bms.model.Screen;
import domain.exercise.bms.repository.ScreenRepository;
import domain.exercise.bms.service.ScreenService;

@Service
public class ScreenServiceImpl implements ScreenService {

    private final ScreenRepository screenRepository;

    @Autowired
    public ScreenServiceImpl(ScreenRepository screenRepository) {
        this.screenRepository = screenRepository;
    }

    @Override
    public List<Screen> getScreensByTheatre(Long theatreId) {
		return null;
        // Implement logic to get screens by theatreId
    }

	@Override
	public List<Screen> getAllScreens() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Screen getScreenById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Screen createScreen(Screen screen) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Screen updateScreen(Long id, Screen screen) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteScreen(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

    // Implement other methods as needed
}
