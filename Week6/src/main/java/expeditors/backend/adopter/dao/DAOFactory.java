package expeditors.backend.adopter.dao;

import expeditors.backend.adopter.dao.inmemory.InMemoryAdopterDAO;
import expeditors.backend.adopter.dao.jpa.JPAAdopterDAO;
import expeditors.backend.adopter.service.AdopterService;

import java.util.Map;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;


public class DAOFactory {

    private static Map<String, Object> objects = new ConcurrentHashMap<>();

    private static ResourceBundle bundle = ResourceBundle.getBundle("backend");
    private static String profile;
    static {
       profile = bundle.getString("backend.profile");
    }

    public static void clear() {
        objects.clear();
    }

    public static int getObjectCount() {
        return objects.size();
    }

    public static AdopterDAO adopterDAO() {
        return switch(profile) {
            case "dev" -> (AdopterDAO)objects.computeIfAbsent("adopterDAO", k -> new InMemoryAdopterDAO());
            case "prod" -> (AdopterDAO)objects.computeIfAbsent("adopterDAO", k -> new JPAAdopterDAO());
            default -> throw new RuntimeException("Unknown profile: " + profile);
        };
    }

    public static AdopterService adopterService() {
        AdopterService service =
                (AdopterService) objects.computeIfAbsent("adopterService",
                        k -> {
                            AdopterService as = new AdopterService();
                            AdopterDAO dao = adopterDAO();
                            as.setAdopterDAO(dao);
                            return as;
                        });


        return service;
    }
}
