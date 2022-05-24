import com.codeborne.selenide.Selenide
import com.codeborne.selenide.Configuration
import org.junit.jupiter.api.Test

class GoogleTest {

    @Test
    fun searchTest(){
        Configuration.browserSize = "1920x1080";
        Selenide.open("https://www.google.com/")
    }
}