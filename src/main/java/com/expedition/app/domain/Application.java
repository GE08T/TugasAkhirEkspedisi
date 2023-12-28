package com.expedition.app.domain;

import com.expedition.app.domain.interfaces.IPresenter;

/**
 * * Application is to implement and logic of IPresenter 
 */
public class Application {
  private final IPresenter ui;
  
  public Application(IPresenter presenter) {
    this.ui = presenter;
  }

  public void run() {
    while (true) {
      boolean isAdmin = ui.showLoginAdminScreen();
      boolean isEmployee = ui.showLoginEmployeeScreen();
      if (!isAdmin && !isEmployee) continue;
      boolean shouldContinue = isAdmin ? ui.showAdminScreen() : ui.showEmployeeScreen();
      if (!shouldContinue) break;
      continue;
    }
  }
}
