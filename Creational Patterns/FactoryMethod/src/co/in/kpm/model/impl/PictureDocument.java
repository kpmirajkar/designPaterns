package co.in.kpm.model.impl;

import co.in.kpm.model.Document;

public class PictureDocument implements Document {

  @Override
  public void open() {
    System.out.println("PictureDocument.open()");
  }


  @Override
  public void save() {
    System.out.println("PictureDocument.save()");
  }


  @Override
  public void saveAs() {
    System.out.println("PictureDocument.saveAs()");
  }


  @Override
  public void rename() {
    System.out.println("PictureDocument.rename()");
  }

}
