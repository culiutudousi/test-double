package mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MockDoorPanel extends DoorPanel {

    private Boolean isClosed = false;

    @Override
    public void close() {
        isClosed = true;
    }

    public void verifyThatCloseIsCalled () {
        assertEquals(true, isClosed);
    }
}
