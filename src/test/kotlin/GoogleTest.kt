import com.codeborne.selenide.Selenide
import org.junit.jupiter.api.Test

class GoogleTest {

    @Test
    fun searchTest(){
        Selenide.open("https://www.google.com/")
    }
}