import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Optional;

public class Test {

    public static User newUser() {
        User user = new User();
        user.setName("Daniel Defoe");
        user.setUsername("Elen_Isatr");
        user.setEmail("danielyurchenc0@gmail.com");
        user.setPhone("+38 063 763 3808");
        user.setWebsite("GMM.com");
        Address address = new Address();
        address.setStreet("Lisova");
        address.setSuite("144");
        address.setCity("Vorzel");
        address.setZipcode("08167");
        Geo geo = new Geo();
        geo.setLat("23.4567");
        geo.setLng("-120.7677");
        address.setGeo(geo);
        user.setAddress(address);
        Company company = new Company();
        company.setName("GMM");
        company.setCatchPhrase("Buy & large");
        company.setBs("revolutionize bar concept");
        user.setCompany(company);
        return user;
    }






    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        System.out.println("Methods.addUser(newUser()) = " + Methods.addUser(newUser()));
        Optional<User> update = Methods.getIdUsers(5);
        if (update.isPresent()) {
            User toUpdate = update.get();
            toUpdate.setUsername("Danone");
            Optional<User> updatedUser = Methods.updateUser(toUpdate);
            updatedUser.ifPresent(System.out::println);
        } else {
            System.out.println("empty"); 
        }
        System.out.println("Methods.deleteUser(4) = " + Methods.deleteUser(4));
        System.out.println("Methods.getInfoAllUsers() = " + Methods.getInfoAllUsers());
        System.out.println("Methods.getIdUsers(2) = " + Methods.getIdUsers(2));
        System.out.println("Methods.getUsersName(\"Bret\") = " + Methods.getUsersName("Bret"));
        System.out.println("Methods.getCommentsOfUsersLastPost(10) = " + Methods.getCommentsOfUsersLastPost(10));
        System.out.println("Methods.getUncomletedTasks(5) = " + Methods.getUncomletedTasks(5));


    }
}
