package com.expedition.app.presentation.utils;

import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InputScanner {
  private final Scanner scanner;

  /**
   * * i know this for declaration of scanner but why?
   * ? i dont know this function and usability
   */
  public InputScanner(InputStream source) {
    this.scanner = new Scanner(source).useDelimiter(Pattern.compile("\r\n|\n"));
  }

  public void close() {
    scanner.close();
  }

  public String getString(String prompt) {
    System.out.print(prompt);
    return scanner.next().trim();
  }

  public String getNonEmptyString(String prompt, String warning) {
    while (true) {
      String userInput = getString(prompt);
      if(!userInput.trim().isEmpty()) {
        return userInput;
      }
      System.out.println(warning);
    }
  }
}
