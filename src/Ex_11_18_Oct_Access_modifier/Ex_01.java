package Ex_11_18_Oct_Access_modifier;

public class Ex_01 {
    static void main(String[] args) {
        //TestCase tc=new Testcase();


    }
}
class BaseClass{
    BaseClass(){
        System.out.println("Default Constructor");
    }
    BaseClass(String browser){
        this.browser=browser;
        System.out.println("PC constructor");
    }

    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    void openBrowser(){
        System.out.println("Opening Browser!!");

    }
    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }
    void closeBrowser() {
        System.out.println("Close Browser!!");
    }
}

class Testcase extends BaseClass{
    void TestC(){}
    Testcase(){
//        super();
        super("Chrome");
        super.openBrowser();
        super.openBrowser("Chrome");
        super.closeBrowser();
        System.out.println(super.getBrowser());
        super.setBrowser("firefox");
    }


}

