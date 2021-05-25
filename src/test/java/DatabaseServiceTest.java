import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.jhzeg.mocking.Database;
import com.jhzeg.mocking.DatabaseService;

@ExtendWith(MockitoExtension.class)
public class DatabaseServiceTest {
	
	@Mock
	Database databaseMock;
	
	@Test
	public void testQuery()
	{
		assertNotNull(databaseMock);
		when(databaseMock.isReady()).thenReturn(true);
		DatabaseService databaseService = new DatabaseService(databaseMock);
		boolean check = databaseService.query("SELECT * FROM users");
		assertTrue(check);
	}

}
