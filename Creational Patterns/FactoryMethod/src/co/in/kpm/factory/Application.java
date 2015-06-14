package co.in.kpm.factory;

import java.util.ArrayList;
import java.util.List;

import co.in.kpm.model.Document;

public abstract class Application implements Document {

  private Document document;
  private final List<Document> docs = new ArrayList<>();


  public abstract Document createDocument();


  public void newDocument() {
    document = createDocument();
    docs.add(document);
  }


  public void save() {
    document.save();
  }


  @Override
  public void open() {
    document.open();
  }


  @Override
  public void saveAs() {
    document.saveAs();
  }


  @Override
  public void rename() {
    document.rename();
  }
}
