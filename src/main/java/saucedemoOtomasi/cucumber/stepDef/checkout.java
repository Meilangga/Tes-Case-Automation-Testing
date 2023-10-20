package saucedemoOtomasi.cucumber.stepDef;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class checkout {
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com";

    @Given("User membuka halaman login")
    public void userMembukaHalamanLogin() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(baseUrl);

        String loginPage = driver.findElement(By.xpath("//div[contains(text(), 'Swag Labs')]")).getText();
        Assert.assertEquals(loginPage, "Swag Labs");
    }

    @When("User memasukan username")
    public void userMemasukanUsername() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @And("User memasukan password")
    public void userMemasukanPassword() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("User menekan tombol login")
    public void userMenekanTombolLogin() {
        driver.findElement(By.xpath("//*[@type='submit']")).click();
    }

    @Then("User berhasil login")
    public void userBerhasilLogin() {
        driver.findElement(By.xpath("//div[contains(text(), 'Swag Labs')]"));
    }

    @And("User membuka halaman produk")
    public void userMembukaHalamanProduk() {
        driver.findElement(By.xpath("//span[contains(text(), 'Products')]"));
    }

    @And("User memilih produk dengan menekan tombol tambah ke keranjang")
    public void userMemilihProdukDenganMenekanTombolTambahKeKeranjang() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @And("User menekan tombol icon keranjang")
    public void userMenekanTombolIconKeranjang() {
        driver.findElement(By.id("shopping_cart_container")).click();
    }

    @And("User membuka halaman cart")
    public void userMembukaHalamanCart() {
        driver.findElement(By.xpath("//span[contains(text(), 'Your Cart')]"));
    }

    @And("User menekan tombol checkout")
    public void userMenekanTombolCheckout() {
        driver.findElement(By.id("checkout")).click();
    }

    @And("User memasukan first name")
    public void userMemasukanFirstName() {
        driver.findElement(By.id("first-name")).sendKeys("Testing aee bos");
    }

    @And("User memasukan last name")
    public void userMemasukanLastName() {
        driver.findElement(By.id("last-name")).sendKeys("Testing aee bos");
    }

    @And("User memasukan postal code")
    public void userMemasukanPostalCode() {
        driver.findElement(By.id("postal-code")).sendKeys("Testing aee bos");
    }

    @And("User menekan tombol continue")
    public void userMenekanTombolContinue() {
        driver.findElement(By.id("continue")).click();
    }

    @And("User membuka halaman checkout overview")
    public void userMembukaHalamanCheckoutOverview() {
        driver.findElement(By.xpath("//span[contains(text(), 'Checkout: Overview')]"));

    }

    @And("User menekan tombol finish")
    public void userMenekanTombolFinish() {
        driver.findElement(By.id("finish")).click();

    }

    @And("User membuka halaman checkout complete")
    public void userMembukaHalamanCheckoutComplete() {
        driver.findElement(By.xpath("//span[contains(text(), 'Checkout: Complete!')]"));

    }

    @Then("User menekan tombol back")
    public void userMenekanTombolBack() {
        driver.findElement(By.id("back-to-products")).click();

    }
}

