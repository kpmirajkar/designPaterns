package co.in.kpm.client;

import co.in.kpm.factory.Application;
import co.in.kpm.factory.PictureApplication;
import co.in.kpm.factory.TextApplication;

public class Client {
  public static void main(String[] args) {
    Application application = new PictureApplication();
    application.newDocument();
    application.open();
    application.save();
    application.saveAs();
    application.rename();

    System.out.println();

    application = new TextApplication();
    application.newDocument();
    application.open();
    application.save();
    application.saveAs();
    application.rename();
  }
}
