import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {

    @Test
    public void pingPong_forLengthOfArrayList_true() {
        PingPong testPingPong = new PingPong();

        assertEquals(5, testPingPong.pingPong(5).size());
    }

    /* @Test
    public void pingPong_forAnythingThatIsNotAnInteger_false() {
        PingPong testPingPong = new PingPong();
        assertEquals(1, testPingPong.pingPong(1).userInput);
        }
*/
    @Test
    public void pingPong_ForNumbersDivisbleByThreeAndFive_true(){
        PingPong testPingPong = new PingPong();

        assertEquals("ping-pong", testPingPong.pingPong(15).get(14));
        assertEquals("ping-pong", testPingPong.pingPong(34).get(29));
    }

    @Test
    public void pingPong_ForNumbersDivisibleByThree_true() {
        PingPong testPingPong = new PingPong();

        assertEquals("ping", testPingPong.pingPong(9).get(8));
        assertEquals("ping", testPingPong.pingPong(12).get(11));
    }

    @Test
    public void pingPong_ForNumbersDivisibleByFive_true() {
        PingPong testPingPong = new PingPong();

        assertEquals("pong", testPingPong.pingPong(10).get(9));
        assertEquals("pong", testPingPong.pingPong(20).get(19));
    }
}
