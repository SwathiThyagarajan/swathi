package MAY.ex_25052024;

public enum PAGES {
    // what are the different pages in a website we are keeping them separately
    // we can use these now in Lab 217/Test case
    // suppose url changes in PAGES no need to change in Lab217/Testcase u must change only in enum class PAGES

    // After Generate constructor, getter & setter the below will take url
    HOMEPAGE("https://app.vwo.com/","Home page"),
    LOGIN("https://app.vwo.com/#login","Login page"),
    DASHBOARD("https://app.vwo.com/dasbhoard", "Dashboard page");

    // every page will have different url
    String url;
    String page;
    // Home page --> https://app.vwo.com/
    // Login page will have this url-->https://app.vwo.com/login
    // Dashboard -> https://app.vwo.com/dasbhoard

// Generate constructor
    PAGES(String url, String page) {
        this.url = url;
        this.page = page;
    }
    // Generate getter
    public String getUrl() {
        return url;
    }

    public String getPage() {
        return page;
    }

    // Generate setter
    public void setUrl(String url) {
        this.url = url;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
