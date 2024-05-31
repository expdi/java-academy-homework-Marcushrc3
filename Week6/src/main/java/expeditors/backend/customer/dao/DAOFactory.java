package expeditors.backend.customer.dao;

import java.util.ResourceBundle;


public class DAOFactory {

    private static ResourceBundle bundle = ResourceBundle.getBundle("backend");
    private static String profile;
    static {
       profile = bundle.getString("backend.profile");
    }

    public static CustomerDAO customerDAO() {
        return switch(profile) {
            case "dev" -> new InMemoryCustomerDAO();
            case "prod" -> new JPACustomerDAO();
            default -> throw new RuntimeException("Unknown profile: " + profile);
        };
    }
}
