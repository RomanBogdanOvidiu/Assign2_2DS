package assign1_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bogdan.assign2.model.User;
import com.bogdan.assign2.model.UserRole;
import com.bogdan.assign2.repository.BaseRepository;
import com.bogdan.assign2.service.LoginService;

public class UserMethodsTest {
    
    private BaseRepository bs = new BaseRepository();
    
    private User user = new User();
    
    private LoginService ls = new LoginService();
    
    //TODO Should use @BeforeClass to create a test user and 
    // @AfterClass to remove the user at the end of the test
    // @Before = code is executed before each test
    //@BeforeClass runs once at the begining of the test class
    //same with @after, @afterclass
    @Before
    public void initializeUser() {
        this.user.setId(new Long(0));
        this.user.setFirstName("Bogdan");
        this.user.setLastName("Roman");
        this.user.setUsername("romanb");
        this.user.setPassword("1212");
        this.user.setUserRole(UserRole.ADMIN);
       // bs.save(user);
    }
    
    //this test is not a test
    @Test
    public void testSave() {
        User u = new User();
        u.setUsername("romanbbb");
        u.setPassword("1212");
        u.setUserRole(UserRole.CLIENT);
        u = ls.login(u);
    }
    
    @Test
    public void testFindByUsername() {
        
        LoginService ls = new LoginService();
        assertEquals("Find by username: ", this.user.getUsername(), ls.getUserByUsername(this.user.getUsername())
                .getUsername());
    }
}
