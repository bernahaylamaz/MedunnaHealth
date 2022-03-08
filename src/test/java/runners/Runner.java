package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        features = "./src/test/resources/features",
        glue = {"stepdefinitions", "Hooks/Hooks"},
        tags = "@UIMyApp",
        dryRun = false
)
public class Runner {
}

//        git init
//        git add README.md
//        git commit -m "first commit"
//        git branch -M main
//        git remote add origin https://github.com/Bbican/HelthProject.git
//        git push -u origin main