package by.htp.hometask.main;

import by.htp.hometask.bean.Cave;
import by.htp.hometask.view.ConsolMenu;

public class Main {

	public static Cave dragon = new Cave("Dragon");

	public static void main(String[] args) {
		ConsolMenu consoleMenu = new ConsolMenu();
		dragon.setNumberOfTreasure(100);
		consoleMenu.startConsoleMenu();
	}
}
