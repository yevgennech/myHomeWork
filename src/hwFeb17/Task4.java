package hwFeb17;
/*
Provide Implementation for the diagram below. Then
create a test class in which you need to create Objects of
ChromeDriver, FirefoxDrive and SafariDriver classes and
see which methods available to them.
 */

public class Task4 {
}

interface WebDriver {
    void open();
    void close();
    String getTitle();
}

interface RemoteWebDriver extends WebDriver{
    void navigate();
}

interface TakesScreenshot extends RemoteWebDriver{
    void getScreenshot();

}

class ChromeDriver implements RemoteWebDriver{

    @Override
    public void navigate() {
        System.out.println("navigate() -- ChromeDriver");
    }

    @Override
    public void open() {
        System.out.println("open() -- ChromeDriver");
    }

    @Override
    public void close() {
        System.out.println("close() -- ChromeDriver");
    }

    @Override
    public String getTitle() {
        System.out.println("getTitle() -- ChromeDriver");
        return null;
    }
}

class FirefoxDriver implements RemoteWebDriver{

    @Override
    public void navigate() {
        System.out.println("navigate() -- FirefoxDriver");
    }

    @Override
    public void open() {
        System.out.println("open() -- FirefoxDriver");
    }

    @Override
    public void close() {
        System.out.println("close() -- FirefoxDriver");
    }

    @Override
    public String getTitle() {
        System.out.println("getTitle() -- FirefoxDriver");
        return null;
    }
}

class SafariDriver implements RemoteWebDriver{

    @Override
    public void navigate() {
        System.out.println("navigate() -- SafariDriver");
    }

    @Override
    public void open() {
        System.out.println("open() -- SafariDriver");
    }

    @Override
    public void close() {
        System.out.println("close() -- SafariDriver");
    }

    @Override
    public String getTitle() {
        System.out.println("getTitle() -- SafariDriver");
        return null;
    }
}
