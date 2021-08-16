import org.junit.Test;
import static org.junit.Assert.*;


public class SquadTest {


        @Test
        public void newSquad_instantntiateCorrectly() {
            Squad squad = new Squad("","","");
            assertTrue(squad instanceof Squad);

        }

    @Test
    public void Squad_instantiatesWithName_String() {
        Squad squad = new Squad("Mumu", "Save the universe", "12");
        assertEquals("Mumu", squad.getName());

    }
//    private void assertArrayEquals(String moh, String name) {
//    }

    @Test
    public void Squad_instantiatesWithCauseForFighting_Sting() {
        Squad squad = new Squad("Mumu", "Save the universe", "12");
        assertEquals("Save the universe", squad.getCauseForFighting());

    }

    @Test
    public void Squad_instantiatesWithSize_Sting() {
        Squad squad = new Squad("Mumu", "Save the universe", "12");
        assertEquals("12", squad.getSize());

    }

    @Test
    public void Squad_instantiatesWithAge_int() {
        Squad squad = new Squad("Mbogi", "Save the universe", "12");
        assertEquals("Save the universe", squad.getCauseForFighting());

    }
}


