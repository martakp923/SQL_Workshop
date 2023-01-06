package entity;

public class Test {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        //  User user = new User();
        //   user.setUserName("zdzislaw");
        //   user.setEmail("mail.zdzislawa@gmail.com");
        //  user.setPassword("haslo");
        //  userDao.create(user);
        //  User read = userDao.read(1);
        //   System.out.println(read);
        // User userToUpdate = userDao.read(1);
        // userToUpdate.setUserName("Arkadiusz");
        //  userToUpdate.setEmail("arek@coderslab.pl");
        //  userToUpdate.setPassword("superPassword");
        //  userDao.update(userToUpdate);
        User secondUser = new User();
        secondUser.setUserName("marek");
        secondUser.setEmail("marek@coderslab.pl");
        secondUser.setPassword("pass");
        userDao.create(secondUser);
        User[] all = userDao.findAll();
        for (User u : all) {
            System.out.println(u);
        }
    }
}

