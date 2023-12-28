package com.expedition.app.domain.interfaces;

/**
 * * IPresenter is an Layer of Presentation 
 * * Use to show login & admin & employee Screen
 * !
 * ?
 * 
*/
public interface IPresenter {
  boolean showLoginAdminScreen();
  boolean showLoginEmployeeScreen();
  boolean showAdminScreen();
  boolean showEmployeeScreen();
}
