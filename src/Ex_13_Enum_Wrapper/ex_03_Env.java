package Ex_13_Enum_Wrapper;

public enum ex_03_Env {

    DEV("https://dev.myapp.com"),
    STAGING("https://staging.myapp.com"),
    PREPROD("https://preprod.myapp.com"),
    PROD("https://myapp.com");
    //   PREPROD( "http.//preprod.myaapp.com);


   private final String baseUrl;


    ex_03_Env(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getBaseUrl() {
        return baseUrl;
    }
}
