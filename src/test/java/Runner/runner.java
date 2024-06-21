package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features", // Feature dosyalarınızın yolu
        glue = {"StepDefinition"} // Step definitions sınıflarınızın paket adı
        // plugin = {"pretty"}
)
public class runner {
    // Herhangi bir kod gerekmiyor
}