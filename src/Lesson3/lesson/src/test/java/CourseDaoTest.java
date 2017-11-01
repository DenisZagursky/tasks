import com.netcracker.zagursky.dao.CourseDao;
import com.netcracker.zagursky.dao.DefaultCourseDao;
import com.netcracker.zagursky.entity.Course;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import static org.junit.Assert.*;

public class CourseDaoTest {
    private static final String PATH_TO_TEST_FILE = "src/test/resources/testingCourse.properties";
    private static CourseDao courseDao;
    private static Random random;
    private static Properties properties;
    private Course course = new Course();

    @BeforeClass
    public static void init() throws Exception {
        FileInputStream fileInputStream = new FileInputStream(PATH_TO_TEST_FILE);
        properties = new Properties();
        properties.load(fileInputStream);
        courseDao = DefaultCourseDao.getInstance();
        random = new Random();
    }

    @Before
    public void createTestCourse() {
        course.setId(Integer.parseInt(properties.getProperty("test.id")));
        course.setName(properties.getProperty("test.name"));
        course.setTrenerName(properties.getProperty("test.trenerName"));
        course.setTrenerLastName(properties.getProperty("test.trenerLastName"));
        course.setHour(Integer.parseInt(properties.getProperty("test.hour")));
        courseDao.addCourse(course);

    }

    @After
    public void removeTestCourse() {
        courseDao.delete(Integer.parseInt(properties.getProperty("test.id")));
    }

    @Test
    public void getCourses() throws Exception {
        List<Course> courses = courseDao.getCourses();
        assertNotNull(courses);
    }

    @Test
    public void getCourseId() throws Exception {
        Course course = courseDao.getCourseById(Integer.parseInt(properties.getProperty("test.id")));
        assertNotNull(course);
    }

    @Test
    public void addDeleteCourse() throws Exception {
        course.setId(Integer.parseInt(properties.getProperty("test.id")) + 1);
        course.setName(properties.getProperty("test.name"));
        course.setTrenerName(properties.getProperty("test.trenerName"));
        course.setTrenerLastName(properties.getProperty("test.trenerLastName"));
        course.setHour(Integer.parseInt(properties.getProperty("test.hour")));
        courseDao.addCourse(course);
        Course courseFromBd = courseDao.getCourseById(Integer.parseInt(properties.getProperty("test.id")) + 1);
        assertEquals(course, courseFromBd);
        courseDao.delete(course.getId());
        assertNull(courseDao.getCourseById(course.getId()));
    }

    @Test
    public void updateCourse() throws Exception {
        course.setName(properties.getProperty("test.updateName"));
        course.setTrenerName(properties.getProperty("test.updateTrenerName"));
        courseDao.update(course);
        Course courseUpdate = courseDao.getCourseById(course.getId());
        assertEquals(course.getName(), courseUpdate.getName());
        assertEquals(course.getTrenerName(), courseUpdate.getTrenerName());
    }

}
