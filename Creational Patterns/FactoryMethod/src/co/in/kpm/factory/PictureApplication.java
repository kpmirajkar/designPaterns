package co.in.kpm.factory;

import co.in.kpm.model.Document;
import co.in.kpm.model.impl.PictureDocument;

public class PictureApplication extends Application {

  @Override
  public Document createDocument() {
    return new PictureDocument();
  }

}
