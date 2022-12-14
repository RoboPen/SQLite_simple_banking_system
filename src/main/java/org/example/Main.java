package org.example;

import org.example.handlers.AccountHandler;
import org.example.managers.DatabaseManager;
import org.example.managers.MenuManager;
import org.example.menus.MainMenu;

public class Main {

    public static void main(String[] args) {
        DatabaseManager databaseManager = DatabaseManager
                .getInstanceOfDatabaseManager("CARDS", "src/main/java/org/example/data/");
        databaseManager.createTable("cards");
        AccountHandler accountHandler = new AccountHandler(databaseManager);
        MenuManager.executeMenu(new MainMenu(accountHandler));
    }
}