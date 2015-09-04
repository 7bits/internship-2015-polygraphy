//package it.sevenbits.graphicartsindustry.core.repository;
//
//import it.sevenbits.graphicartsindustry.core.domain.PolygraphyContacts;
//import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
//import it.sevenbits.graphicartsindustry.core.mappers.RegistrationMapper;
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//@Qualifier(value = "registrationRepository")
//public class RegistrationRepository {
//
//    private static Logger LOG = Logger.getLogger(RegistrationRepository.class);
//
//    @Autowired
//    private RegistrationMapper mapper;
//
//    public PolygraphyContacts createPolygraphy(String name, String address, String phone, String email,
//                                       Boolean order, String website, String info,
//                                       List<Integer> paymentMethods, Boolean check,
//                                       List<Integer> deliveryMethods, List<Integer> services,
//                                       Integer userId) throws RepositoryException {
////    public void saveRegistrationForm(String name, Boolean check, Boolean order, String address, String email,
////                        String website, String phone, List<Integer> paymentMethods,
////                        List<Integer> deliveryMethods, List<Integer> services) throws RepositoryException {RepositoryException
//        try {
//            Polygraphy polygraphy = new Polygraphy(null, name, check, order, info, userId);
//            mapper.savePolygraphyBasic(polygraphy);
//
//            int polygraphyId = polygraphy.getId();
//
//            PolygraphyContacts polygraphyContacts = new PolygraphyContacts();
//            polygraphyContacts.setId(polygraphyId);
//            polygraphyContacts.setName(name);
//            polygraphyContacts.setAddress(address);
//            polygraphyContacts.setPhone(phone);
//            polygraphyContacts.setEmail(email);
//            polygraphyContacts.setWebsite(website);
//            polygraphyContacts.setInfo(info);
//
//            mapper.savePolygraphyContacts(polygraphyId, address, email, website, phone);
//
//            if (paymentMethods != null) {
//                for (Integer p : paymentMethods) {
//                    if (p != null)
//                        mapper.createPolygraphyPaymentMethod(polygraphyId, p);
//                }
//            }
//
//            if (deliveryMethods != null) {
//                for (Integer d : deliveryMethods) {
//                    if (d != null)
//                        mapper.createPolygraphyDeliveryMethod(polygraphyId, d);
//                }
//            }
//
//            if (services != null) {
//                for (Integer s : services) {
//                    if (s != null)
//                        mapper.createPolygraphyService(polygraphyId, s);
//                }
//            }
//            return polygraphyContacts;
//        } catch (Exception e) {
//            throw new RepositoryException("An error occurred while saving registration form polygraphy "
//                    + e.getMessage(), e);
//        }
//    }
//
////    public void deletePolygraphy(int polygraphyId) throws RepositoryException {
////        try {
////            mapper.removePolygraphyServices(polygraphyId);
////            mapper.removePolygraphyDeliveryMethods(polygraphyId);
////            mapper.removePolygraphyPaymentMethods(polygraphyId);
////            mapper.removePolygraphyContacts(polygraphyId);
////
////            mapper.deletePolygraphy(polygraphyId);
////        } catch (Exception e) {
////            throw new RepositoryException("An error occurred while deleting polygraphy "
////                    + e.getMessage(), e);
////        }
////    }
//
//    public String findUserByEmail (String email) throws RepositoryException {
//        try {
//            return mapper.findUserByEmail(email);
//        } catch (Exception e) {
//            throw new RepositoryException("An error occurred while finding email in users", e);
//        }
//    }
//}