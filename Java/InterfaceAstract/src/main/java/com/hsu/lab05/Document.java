package com.hsu.lab05;
import java.time.LocalDate;


public abstract class Document {
    String fileName;
    LocalDate createdDate = LocalDate.now();;
    LocalDate lastModifiedDate;
    String content;
    String newName;
    public Document() {

    }
    abstract void inputContent();
    abstract void save();
    abstract void saveAs(String newName);
    abstract void open();
}
