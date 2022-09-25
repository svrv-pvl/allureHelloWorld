import org.example.Car;
import org.example.EngineMode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ShouldStopEngineTest {
    private static Car car;

    @BeforeAll
    public static void createCarStartEngineStopEngine(){
        car = new Car();
        car.startEngine();
        car.stopEngine();
    }

    @Test
    public void shouldStopEngineAfterStoppingEngineTest(){
        Assertions.assertEquals(EngineMode.STOPPED, car.getEngineMode());
    }
}
