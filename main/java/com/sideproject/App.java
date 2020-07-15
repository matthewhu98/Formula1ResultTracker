package com.sideproject;

public class App {

	private UserInterface ui;
	private Controller controller;

	public App(UserInterface ui, String fileName) {
		this.ui = ui;
		this.controller = new Controller(fileName);
	}

	public static void main(String[] args) {
		UserInterface ui = new UserInterface();
		String fileName = "2020_formula1_season.txt";
		App app = new App(ui, fileName);

		app.run();
	}

	private void run() {
		boolean isFinished = false;
		while (!isFinished) {
			String response = ui.mainMenu();
			if (response.equals("1")) {
				ui.displayDriverInformation(controller.getTeamRoster());
				ui.displayConstructorInformation(controller.getTeamRoster());
			} else if (response.equals("2")) {
				addPointsToDriver();
			} else if (response.equals("3")) {
				System.exit(0);
			} else {
				ui.errorMessage();
			}
		}
	}

	private void addPointsToDriver() {
		boolean isFinished = false;
		String response = ui.selectDriver();
		while (!isFinished) {
			if (!controller.getTeamRoster().containsKey(response)) {
				ui.driverDoesNotExist();
				isFinished = true;
			} else {
				String points = ui.addPointsToDriver(controller.getTeamRoster().get(response).getDriverName());
				controller.addPointsToDriver(response, points);
				controller.addPointsToConstructor(response, points);
				isFinished = true;		
			}
		}
	}
}
