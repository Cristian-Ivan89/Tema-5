package Tema5;

public class TestConfigRunner {
    public static void main(String[] args) {
        BrowserConfig  browser1 = new BrowserConfig(BrowserType.FIREFOX,"v2.0",true);
        BrowserConfig  browser2 = new BrowserConfig(BrowserType.EDGE,"v2.6");
        BrowserConfig  browser3 = new BrowserConfig(BrowserType.CHROME);
        BrowserConfig defaultChromeConfig = BrowserConfig.createDefaultChromeConfig();
        browser1.afiseazaConfig();
        browser2.afiseazaConfig();
        browser3.afiseazaConfig();
        defaultChromeConfig.afiseazaConfig();

    }
}
