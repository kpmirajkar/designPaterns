package co.in.kpm.model.impl;

import co.in.kpm.model.Document;

public class TextDocument implements Document {

  @Override
  public void open() {
    System.out.println("TextDocument.open()");
  }


  @Override
  public void save() {
    System.out.println("TextDocument.save()");
  }


  @Override
  public void saveAs() {
    System.out.println("TextDocument.saveAs()");
  }


  @Override
  public void rename() {
    System.out.println("TextDocument.rename()");
  }

}
