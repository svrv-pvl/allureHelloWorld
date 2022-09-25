import org.example.Car;
import org.example.EngineMode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ShouldStartEngineTest {
    private static Car car;

    //Arrange
    @BeforeAll
    public static void createCarAndStartEngine(){
        car = new Car();
        car.startEngine();
    }

    @Test
    public void engineShouldBeStartedAfterStartingEngine(){
        Assertions.assertEquals(EngineMode.STARTED, car.getEngineMode());
    }
}
