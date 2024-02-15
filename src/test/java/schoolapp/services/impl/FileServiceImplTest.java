package schoolapp.services.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class FileServiceImplDiffblueTest {
    /**
     * Method under test: {@link FileServiceImpl#getListOfStudentsFromFile()}
     */
    @Test
    void testGetListOfStudentsFromFile() throws IOException {
        // Arrange, Act and Assert
        assertEquals(10, (new FileServiceImpl()).getListOfStudentsFromFile().size());
    }

    /**
     * Method under test: {@link FileServiceImpl#getListOfStaffFromFile()}
     */
    @Test
    void testGetListOfStaffFromFile() throws IOException {
        // Arrange, Act and Assert
        assertEquals(10, (new FileServiceImpl()).getListOfStaffFromFile().size());
    }
}
