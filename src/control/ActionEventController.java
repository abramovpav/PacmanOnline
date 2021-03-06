package control;

import java.awt.event.ActionListener;

import view.MainWindow;
import view.MenuBarItem;

public class ActionEventController {
	public static ActionListener getAction(final MenuBarItem item, final MainWindow window) {
		switch (item) {
			case START:
				return new StartEvent(window);
			case PAUSE:
				return new PauseEvent();
			case EXIT:
				return new ExitEvent();
			case MAIN_MENU:
				return new ExitEvent();
			case SCREENSHOT:
				return new ScreenShotEvent(window);
			case ABOUT:
				return new AboutEvent();
			default:
				throw new IllegalArgumentException();
		}
	}
}
