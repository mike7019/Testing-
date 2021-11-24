import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver robot = new ChromeDriver();
        robot.get("http://automationpractice.com/index.php");
        robot.manage().window().maximize();

        //mapeo de elemento

        By llbSignin = By.className("login");
        By txtemail_Create = By.name("email_create");
        By btnSubmitcreate =By.name("SubmitCreate");
        By rdoButtom = By.id("id_gender1");
        By txtcustomerfirstname = By.id("customer_firstname");
        By txtcustomerlastname = By.id("customer_lastname");
        By txtPasswd = By.name ("passwd");
        By lstDays = By.name("days");
        By lstMonths = By.name("months");
        By lstYears = By.name("years");
        By chkBox = By.name("newsletter");
        By chkBox2 = By.name("optin");
        By txtCompany = By.id("company");
        By txtAddress = By.id("address1");
        By txtAddress2 = By.id("address2");
        By txtCity =By.name("city");
        By lstidstate = By.name("id_state");
        By txtZip = By.name("postcode");
        By lstCountry = By.name("id_country");
        By txtOther = By.name("other");
        By txtPhone = By.name("phone");
        By txtPhone_mobile = By.name("phone_mobile");
        By txtAlias = By.name("alias");
        By btnsubmitAccount = By.name("submitAccount");
        By llbWomen = By.xpath("//a[contains(., 'Women')]");








        //acciones

        robot.findElement(llbSignin).click();
        Thread.sleep(3000);
        JavascriptExecutor jse = (JavascriptExecutor)robot;
        WebElement element = robot.findElement(txtemail_Create);
        jse.executeScript("arguments[0].scrollIntoView()", element);
        robot.findElement(txtemail_Create).sendKeys("amph79@gmail.com");
        robot.findElement(btnSubmitcreate).click();
        Thread.sleep(3000);
        robot.findElement(rdoButtom).click();
        robot.findElement(txtcustomerfirstname).sendKeys("Sir Ulrich");
        robot.findElement(txtcustomerlastname).sendKeys("Von Liechtenstein");
        robot.findElement(txtPasswd).sendKeys("streichholzschachtelchen");
        robot.findElement(lstDays).sendKeys("1");
        robot.findElement(lstMonths).sendKeys("April");
        robot.findElement(lstYears).sendKeys("1993");
        robot.findElement(chkBox).click();
        robot.findElement(chkBox2).click();
        robot.findElement(txtCompany).sendKeys("Mercedez Benz");
        robot.findElement(txtAddress).sendKeys("cra 16 b # 7-4 Bonda");
        robot.findElement(txtAddress2).sendKeys("cra 16 b # 7-4 Bondaa");
        robot.findElement(txtCity).sendKeys("Stutgard");
        robot.findElement(lstidstate).sendKeys("Georgia");
        robot.findElement(txtZip).sendKeys("32545");
        robot.findElement(lstCountry).sendKeys("United States");
        robot.findElement(txtOther).sendKeys("ich bin suche gut gebauten achtzehn bis-dreissig jährigen schlachten...");
        robot.findElement(txtPhone).sendKeys("4339153");
        robot.findElement(txtPhone_mobile).sendKeys("304326092");
        robot.findElement(txtAlias).sendKeys("amphard");
        robot.findElement(btnsubmitAccount).click();
        /* robot.findElement(llbWomen).click(); */




    }
}
