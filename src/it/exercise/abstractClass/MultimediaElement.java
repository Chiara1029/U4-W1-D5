package it.exercise.abstractClass;

public abstract class MultimediaElement {
    protected String title;

    public MultimediaElement(String title) {
        this.title=title;
    }

    public void getTitle() {
        this.title = title;
    }
}
