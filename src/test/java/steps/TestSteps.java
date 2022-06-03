package steps;

import io.cucumber.java.en.Given;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.EnvironmentVariables;

public class TestSteps {
    private EnvironmentVariables environmentVariables;

    @Given("I am making a test")
    public void thisIsATest(){
        System.out.println("This is just a simple test");
    }

    @Given("I say hello")
    public void sayHello(){
        System.out.println("I say hello");
        System.out.println(EnvironmentSpecificConfiguration.from(this.environmentVariables).getProperty("manue.poot"));
    }

    @Given("I say good bye")
    public void sayGoodBye(){
        System.out.println("God bye!!!");
    }

}
