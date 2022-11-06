package udemy.interfaces;

public interface Browser {
    String ENGINE = "WebKit";
    public void getEngine();
    public void goToPage(String url);
    public void refreshPage();
    public void bookmarkPage();
}
