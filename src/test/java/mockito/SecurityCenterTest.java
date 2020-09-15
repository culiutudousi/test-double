package mockito;

import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class SecurityCenterTest {

    @Test
    public void verifyDoorPanelCloseIsCalled() {
        DoorPanel doorPanel = mock(DoorPanel.class);
        SecurityCenter securityCenter = new SecurityCenter(doorPanel);
        securityCenter.switchOn();
        verify(doorPanel, times(1)).close();
    }
}
