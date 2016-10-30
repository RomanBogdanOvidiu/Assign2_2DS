// package assign1_2;
//
// import org.junit.Before;
// import org.junit.Test;
//
// import com.bogdan.assign2.model.User;
// import com.bogdan.assign2.model.UserRole;
// import com.bogdan.assign2.repository.BaseRepository;
// import com.bogdan.assign2.service.LoginService;
//
// public class UserMethodsTest {
// private BaseRepository bs = new BaseRepository();
// private User user = new User();
//
// private LoginService ls = new LoginService();
//
// @Before
// public void initializeUser() {
// this.user.setId(new Long(0));
// this.user.setFirstName("Bogdan");
// this.user.setLastName("Roman");
// this.user.setUsername("romanb");
// this.user.setPassword("1212");
// this.user.setUserRole(UserRole.ADMIN);
//
// }
//
// @Test
// public void testSave() {
// User u = new User();
//
// u.setUsername("romanbbb");
// u.setPassword("1212");
// u = ls.login(u);
// if (u.getUserRole().name().equals("CLIENT")) {
// System.out.println(u.getUserRole().name());
// }
// }
//
// // @Test
// // public void testFindByUsername() {
// //
// // LoginService ls = new LoginService();
// //
// // assertEquals("Find by username: ", this.user.getUsername(),
// // ls.getUserByUsername(this.user.getUsername()).getUsername());
// // }
// }
