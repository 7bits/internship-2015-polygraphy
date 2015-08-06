package it.sevenbits.graphicartsindustry.core.mappers;

import it.sevenbits.graphicartsindustry.core.domain.RegistrationBasic;
import it.sevenbits.graphicartsindustry.core.domain.RequestOnRegistration;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface RegistrationMapper {

    @Insert("INSERT INTO request_on_registration (email) " +
            "VALUES (#{email})")
    void saveRequestOnRegistration(@Param("email") final String email);

    @Delete("DELETE FROM request_on_registration " +
            "WHERE hash=#{hash}")
    void deleteRequestOnRegistration(@Param("hash") final String hash);

    @Select("SELECT id, email, hash FROM request_on_registration ")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "email", property = "email"),
            @Result(column = "hash", property = "hash")
    })
    List<RequestOnRegistration> findAllRequestOnRegistration();

    @Select("SELECT id, name FROM polygraphy AS p " +
            "WHERE name=#{name}")
    @Result(column = "id")
    int findPolygraphyId(@Param("name") final String name);


    @Insert("INSERT INTO polygraphy (name, writes_the_check, order_by_email) " +
            "VALUES (#{name}, #{check}, #{order}, #{userId}), #{info}")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void savePolygraphyBasic(final RegistrationBasic registrationBasic);

    @Insert("INSERT INTO contact(polygraphy_id, address, email, website, phone) " +
            "VALUES (#{polygraphyId}, #{address}, #{email}, #{website}, #{phone})")
    void savePolygraphyContacts(@Param("polygraphyId") int polygraphyId,
                                @Param("address") final String address,
                                @Param("email") final String email,
                                @Param("website") final String website,
                                @Param("phone") final String phone);

    @Insert("INSERT INTO polygraphies_payment_methods (polygraphy_id, payment_method_id) " +
            "VALUES (#{polygraphyId}, #{paymentId})")
    void savePolygraphyPaymentMethod(@Param("polygraphyId") int polygraphyId,
                                     @Param("paymentId") int paymentId);

    @Insert("INSERT INTO polygraphies_delivery_methods(polygraphy_id, delivery_method_id) " +
            "VALUES (#{polygraphyId}, #{deliveryId})")
    void savePolygraphyDeliveryMethod(@Param("polygraphyId") int polygraphyId,
                                      @Param("deliveryId") int deliveryId);

    @Insert("INSERT INTO polygraphies_services(polygraphy_id, service_id) " +
            "VALUES (#{polygraphyId}, #{serviceId})")
    void savePolygraphyService(@Param("polygraphyId") int polygraphyId,
                               @Param("serviceId") int serviceId);


    @Delete("DELETE FROM polygraphy WHERE id=#{polygraphyId}")
    void deletePolygraphyBasic(int polygraphyId);

    @Delete("DELETE FROM contact WHERE polygraphy_id=#{polygraphyId}")
    void deletePolygraphyContacts(int polygraphyId);

    @Delete("DELETE FROM polygraphies_payment_methods WHERE polygraphy_id=#{polygraphyId}")
    void deletePolygraphyPaymentMethods(int polygraphyId);

    @Delete("DELETE FROM polygraphies_delivery_methods WHERE polygraphy_id=#{polygraphyId}")
    void deletePolygraphyDeliveryMethods(int polygraphyId);

    @Delete("DELETE FROM polygraphies_services WHERE polygraphy_id=#{polygraphyId}")
    void deletePolygraphyServices(int polygraphyId);
}
