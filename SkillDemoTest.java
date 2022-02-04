import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void concatinating(){
        assertEquals("good dog", SkillDemo.concat("good", "dog"));
    }
}


