package domain.exercise.bms.service;

import java.util.List;
import domain.exercise.bms.model.Screen;

public interface ScreenService {
    List<Screen> getAllScreens();
    Screen getScreenById(Long id);
    Screen createScreen(Screen screen);
    Screen updateScreen(Long id, Screen screen);
    boolean deleteScreen(Long id);
    List<Screen> getScreensByTheatre(Long theatreId);

}
