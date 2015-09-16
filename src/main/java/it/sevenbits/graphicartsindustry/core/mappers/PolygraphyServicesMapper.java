package it.sevenbits.graphicartsindustry.core.mappers;

import org.apache.ibatis.annotations.*;

import java.util.List;

public interface PolygraphyServicesMapper {

    @Select("SELECT payment_method_id FROM polygraphies_payment_methods " +
            "WHERE polygraphy_id=#{polygraphyId}")
    @Result(column = "payment_method_id")
    List<Integer> findPolygraphyPaymentMethods(@Param(value = "polygraphyId") final Integer polygraphyId);

    @Select("SELECT delivery_method_id FROM polygraphies_delivery_methods " +
            "WHERE polygraphy_id=#{polygraphyId}")
    @Result(column = "delivery_method_id")
    List<Integer> findPolygraphyDeliveryMethods(@Param(value = "polygraphyId") final Integer polygraphyId);

    @Select("SELECT service_id FROM polygraphies_services " +
            "WHERE polygraphy_id=#{polygraphyId}")
    @Result(column = "service_id")
    List<Integer> findPolygraphyServices(@Param(value = "polygraphyId") final Integer polygraphyId);


    @Insert("INSERT INTO polygraphies_payment_methods(polygraphy_id, payment_method_id) " +
            "VALUES (#{polygraphyId}, #{paymentMethodId})")
    void insertPolygraphyPaymentMethod(@Param(value = "polygraphyId") final Integer polygraphyId,
                                       @Param(value = "paymentMethodId") final Integer paymentMethodId);

    @Insert("INSERT INTO polygraphies_delivery_methods(polygraphy_id, delivery_method_id) " +
            "VALUES (#{polygraphyId}, #{deliveryMethodId})")
    void insertPolygraphyDeliveryMethod(@Param(value = "polygraphyId") final Integer polygraphyId,
                                        @Param(value = "deliveryMethodId") final Integer deliveryMethodId);

    @Insert("INSERT INTO polygraphies_services(polygraphy_id, service_id) " +
            "VALUES (#{polygraphyId}, #{serviceId})")
    void insertPolygraphyService(@Param(value = "polygraphyId") final Integer polygraphyId,
                                 @Param(value = "serviceId") final Integer serviceId);


    @Delete("DELETE FROM polygraphies_payment_methods " +
            "WHERE polygraphy_id=#{polygraphyId}")
    void deletePolygraphyPaymentMethods(@Param(value = "polygraphyId")final Integer polygraphyId);

    @Delete("DELETE FROM polygraphies_delivery_methods " +
            "WHERE polygraphy_id=#{polygraphyId}")
    void deletePolygraphyDeliveryMethods(@Param(value = "polygraphyId")final Integer polygraphyId);

    @Delete("DELETE FROM polygraphies_services " +
            "WHERE polygraphy_id=#{polygraphyId}")
    void deletePolygraphyServices(@Param(value = "polygraphyId")final Integer polygraphyId);
}