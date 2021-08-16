import org.junit.Test;
import static org.junit.Assert.*;


public class HerosTest {

    @Test
    public void newHeros_instantntiateCorrectly() {
        Heros hero = new Heros("","","","");
        assertTrue(hero instanceof Heros);

    }


    @Test
    public void Heros_instantiatesWithName_String() {
        Heros hero = new Heros("Moh","21","flash","time");
        assertEquals("Moh", hero.getName());

    }


    @Test
    public void Heros_instantiatesWithAge_int() {
        Heros hero = new Heros("Moh","21","flash","time");
        assertEquals("21", hero.getAge());

    }

    @Test
    public void Heros_instantiatesWithpower_String() {
        Heros hero = new Heros("Moh","21","flash","time");
        assertEquals("flash", hero.getPower());

    }


    @Test
    public void Heros_instantiatesWithPower_String() {
        Heros hero = new Heros("Moh","21","flash","time");
        assertEquals("time", hero.getWeakness());

    }


    @Test
    public void all_returnsAllInstancesOfHeros_true() {
        Heros heroOne = new Heros("Moh","21","flash","time");
        Heros heroTwo = new Heros("Tuma","21","Fire","time");

        assertTrue(Heros.all().contains(heroOne));
        assertTrue(Heros.all().contains(heroTwo));


    }

    @Test
    public void clear_emptiesAllHeros_0() {
        Heros heroOne = new Heros("Moh","21","flash","time");
        Heros.clear();
        assertEquals(Heros.all().size(),0);
    }


    @Test
    public void getId_heros_1() {
        Heros hero = new Heros("Moh","21","flash","time");
        
        assertEquals(3, hero.getmId());

    }




}
