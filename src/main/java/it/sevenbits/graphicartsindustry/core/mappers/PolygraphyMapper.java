package it.sevenbits.graphicartsindustry.core.mappers;

import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import it.sevenbits.graphicartsindustry.core.repository.PolygraphyProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface PolygraphyMapper {

    @SelectProvider(type = PolygraphyProvider.class, method = "findPolygraphies")
    @Results({
            @Result(column = "polygraphy_id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "address", property = "address"),
            @Result(column = "phone", property = "phone"),
            @Result(column = "email", property = "email"),
            @Result(column = "website", property = "website"),
            @Result(column = "info", property = "info"),
            @Result(column = "displayed", property = "displayed")
    })
    List<Polygraphy> findPolygraphies(@Param(value = "query") String query,
                                      @Param(value = "services") List<Integer> services,
                                      @Param(value = "payment") int payment_id,
                                      @Param(value = "check") boolean check,
                                      @Param(value = "delivery") int delivery_id,
                                      @Param(value = "order") boolean order);


    @Select("SELECT id, name, address, phone, displayed FROM polygraphy AS p " +
            "LEFT JOIN contact AS c ON p.id=c.polygraphy_id " +
            "WHERE displayed=true " +
            "LIMIT #{limit}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "address", property = "address"),
            @Result(column = "phone", property = "phone"),
            @Result(column = "displayed", property = "displayed")
    })
    List<Polygraphy> findAll(@Param(value = "limit") int limit);


    @Select("SELECT id, name, email, displayed FROM polygraphy AS p " +
            "LEFT JOIN contact AS c ON p.id=c.polygraphy_id " +
            "ORDER BY name")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "email", property = "email"),
            @Result(column = "displayed", property = "displayed")
    })
    List<Polygraphy> findAllPolygraphy();


    @Select("SELECT id, name, address, phone, email, website, info, displayed FROM polygraphy AS p " +
            "LEFT JOIN contact AS c ON p.id=c.polygraphy_id " +
            "WHERE displayed=true AND id=#{id}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "address", property = "address"),
            @Result(column = "phone", property = "phone"),
            @Result(column = "email", property = "email"),
            @Result(column = "website", property = "website"),
            @Result(column = "info", property = "info"),
            @Result(column = "displayed", property = "displayed")
    })
    Polygraphy findPolygraphy(@Param(value = "id") int id);

    @Select("SELECT id FROM polygraphy WHERE user_id=#{userId}")
    @Result(column = "id")
    Integer getPolygraphyIdByUserId(@Param(value = "userId") final int userId);

    @Select("SELECT writes_the_check FROM polygraphy WHERE id=#{polygraphyId}")
    @Result(column = "writes_the_check")
    Boolean isWritesTheCheck(@Param(value = "polygraphyId") final int polygraphyId);

    @Select("SELECT order_by_email FROM polygraphy WHERE id=#{polygraphyId}")
    @Result(column = "order_by_email")
    Boolean isOrderByEmail(@Param(value = "polygraphyId") final int polygraphyId);

    @Select("SELECT payment_method_id FROM polygraphies_payment_methods WHERE polygraphy_id=#{polygraphyId}")
    @Result(column = "payment_method_id")
    List<Integer> findPolygraphyPaymentMethods(@Param(value = "polygraphyId") final int polygraphyId);

    @Select("SELECT delivery_method_id FROM polygraphies_delivery_methods WHERE polygraphy_id=#{polygraphyId}")
    @Result(column = "delivery_method_id")
    List<Integer> findPolygraphyDeliveryMethods(@Param(value = "polygraphyId") final int polygraphyId);

    @Select("SELECT service_id FROM polygraphies_services WHERE polygraphy_id=#{polygraphyId}")
    @Result(column = "service_id")
    List<Integer> findPolygraphyServices(@Param(value = "polygraphyId") final int polygraphyId);

    @Update("UPDATE polygraphy " +
            "SET displayed=#{condition} " +
            "WHERE id=#{polygraphyId}")
    void updateConditionDisplayPolygraphy(@Param(value = "polygraphyId") int polygraphyId,
                                          @Param(value = "condition") boolean condition);


    @Update("UPDATE polygraphy SET name=#{name} WHERE id=#{id}")
    void updatePolygraphyName(@Param(value = "id") final int polygraphyId,
                              @Param(value = "name") final String name);

    @Update("UPDATE polygraphy SET writes_the_check=#{check} WHERE id=#{id}")
    void updatePolygraphyWritesTheCheck(@Param(value = "id") final int polygraphyId,
                                        @Param(value = "check") final boolean check);

    @Update("UPDATE polygraphy SET order_by_email=#{order} WHERE id=#{id}")
    void updatePolygraphyOrderByEmail(@Param(value = "id") final int polygraphyId,
                                        @Param(value = "order") final boolean order);

    @Update("UPDATE polygraphy SET info=#{info} WHERE id=#{id}")
    void updatePolygraphyInfo(@Param(value = "id") final int polygraphyId,
                              @Param(value = "info") final String info);

    @Update("UPDATE contact SET address=#{address} WHERE polygraphy_id=#{id}")
    void updateContactAddress(@Param(value = "id") final int polygraphyId,
                              @Param(value = "address") final String address);

    @Update("UPDATE contact SET phone=#{phone} WHERE polygraphy_id=#{id}")
    void updateContactPhone(@Param(value = "id") final int polygraphyId,
                              @Param(value = "phone") final String phone);

    @Update("UPDATE contact SET email=#{email} WHERE polygraphy_id=#{id}")
    void updateContactEmail(@Param(value = "id") final int polygraphyId,
                              @Param(value = "email") final String email);

    @Update("UPDATE contact SET website=#{website} WHERE polygraphy_id=#{id}")
    void updateContactWebsite(@Param(value = "id") final int polygraphyId,
                            @Param(value = "website") final String website);

    @Insert("INSERT INTO polygraphies_payment_methods(polygraphy_id, payment_method_id) " +
            "VALUES (#{polygraphyId}, #{paymentMethodId})")
    void insertPaymentMethod(@Param(value = "polygraphyId") final int polygraphyId,
                             @Param(value = "paymentMethodId") final int paymentMethodId);

    @Insert("INSERT INTO polygraphies_delivery_methods(polygraphy_id, delivery_method_id) " +
            "VALUES (#{polygraphyId}, #{deliveryMethodId})")
    void insertDeliveryMethod(@Param(value = "polygraphyId") final int polygraphyId,
                              @Param(value = "deliveryMethodId") final int deliveryMethodId);

    @Insert("INSERT INTO polygraphies_services(polygraphy_id, service_id) " +
            "VALUES (#{polygraphyId}, #{serviceId})")
    void insertService(@Param(value = "polygraphyId") final int polygraphyId,
                       @Param(value = "serviceId") final int serviceId);

    @Delete("DELETE FROM polygraphies_payment_methods " +
            "WHERE polygraphy_id=#{polygraphyId} AND payment_method_id=#{paymentMethodId}")
    void deletePolygraphyPaymentMethod(@Param(value = "polygraphyId") final int polygraphyId,
                                       @Param(value = "paymentMethodId") final int paymentMethodId);

    @Delete("DELETE FROM polygraphies_delivery_methods " +
            "WHERE polygraphy_id=#{polygraphyId} AND delivery_method_id=#{deliveryMethodId}")
    void deletePolygraphyDeliveryMethod(@Param(value = "polygraphyId") final int polygraphyId,
                                       @Param(value = "deliveryMethodId") final int deliveryMethodId);

    @Delete("DELETE FROM polygraphies_services " +
            "WHERE polygraphy_id=#{polygraphyId} AND service_id=#{serviceId}")
    void deletePolygraphyService(@Param(value = "polygraphyId") final int polygraphyId,
                                       @Param(value = "serviceId") final int serviceId);


    @Select("SELECT user_id FROM polygraphy WHERE id=#{polygraphyId}")
    @Result(column = "user_id")
    Integer getUserId(@Param(value = "polygraphyId") final int polygraphyId);


    @Delete("DELETE FROM polygraphy WHERE id=#{polygraphyId}")
    void deletePolygraphyBasic(final int polygraphyId);

    @Delete("DELETE FROM contact WHERE polygraphy_id=#{polygraphyId}")
    void deletePolygraphyContacts(final int polygraphyId);

    @Delete("DELETE FROM polygraphies_payment_methods WHERE polygraphy_id=#{polygraphyId}")
    void deletePolygraphyPaymentMethods(final int polygraphyId);

    @Delete("DELETE FROM polygraphies_delivery_methods WHERE polygraphy_id=#{polygraphyId}")
    void deletePolygraphyDeliveryMethods(final int polygraphyId);

    @Delete("DELETE FROM polygraphies_services WHERE polygraphy_id=#{polygraphyId}")
    void deletePolygraphyServices(final int polygraphyId);
}
