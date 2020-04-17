package by.htp.hometask.view;

import by.htp.hometask.logic.ConsoleMenuLogic;

public class ConsolMenu {
	
	private ConsoleMenuLogic consoleMenuAction = new ConsoleMenuLogic();

    public void startConsoleMenu(){
        int choice;
        boolean isStopped = false;
        consoleMenuAction.printOptions();
        while (!isStopped) {
            System.out.println("Please enter the number of the operation. \nYour choice: ");
            choice = consoleMenuAction.makeChoice();
            isStopped = consoleMenuAction.processingOperation(choice);
        }
    }

}
