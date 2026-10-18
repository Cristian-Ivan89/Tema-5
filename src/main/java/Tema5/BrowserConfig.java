package Tema5;

public class BrowserConfig {

    private BrowserType browser;
    private String version;
    private boolean isHeadless;

   // constructorul principal

    public BrowserConfig(BrowserType browser, String version, boolean isHeadless){
        this.browser = browser;
        this.version = version;
        this.isHeadless = isHeadless;

    }

// browser + version, isHeadless = false
public BrowserConfig(BrowserType browser, String version) {
    this(browser, version, false);
}
    // doar browser, version = "latest", isHeadless = false
    public BrowserConfig(BrowserType browser) {
        this(browser, "latest");
    }


    // Metodă factory
    public static BrowserConfig createDefaultChromeConfig() {
        return new BrowserConfig(BrowserType.CHROME, "latest", true);
    }

    public void afiseazaConfig() {
        System.out.println("=== Configurație browser ===");
        System.out.println("Browser:  " + browser);
        System.out.println("Versiune: " + version);
        System.out.println("Headless: " + (isHeadless ? "da" : "nu"));
    }

    public BrowserType getBrowser() {
        return browser;
    }

    public void setBrowser(BrowserType browser) {
        this.browser = browser;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isHeadless() {
        return isHeadless;
    }

    public void setHeadless(boolean isHeadless) {
        this.isHeadless = isHeadless;
    }

    @Override
    public String toString() {
        return "BrowserConfig{" +
                "browser=" + browser +
                ", version='" + version + '\'' +
                ", isHeadless=" + isHeadless +
                '}';
    }

}
