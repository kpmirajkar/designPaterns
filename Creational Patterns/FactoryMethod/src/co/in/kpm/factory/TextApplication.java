package co.in.kpm.factory;

import co.in.kpm.model.Document;
import co.in.kpm.model.impl.TextDocument;

public class TextApplication extends Application {

  @Override
  public Document createDocument() {
    return new TextDocument();
  }

}
