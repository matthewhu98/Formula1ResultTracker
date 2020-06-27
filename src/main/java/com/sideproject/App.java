package com.sideproject;


public class App {

    private UserInterface ui;
    private Controller controller;

    public App(UserInterface ui, String fileName) {
        this.ui = ui;
        this.controller = new Controller(fileName);
    }

    public static void main( String[] args )
    {
        UserInterface ui = new UserInterface();
        String fileName = "2020_formula1_season.txt";
        App app = new App(ui, fileName);

        app.run();
    }

    private void run() {
        boolean isFinished = false;
        while(!isFinished) {
            String response = ui.mainMenu();
            if (response.equals("1")) {
                ui.displayDriverInformation(controller.getAllTeams());
            } else {
                System.exit(0);
            }
        }
    }
}
