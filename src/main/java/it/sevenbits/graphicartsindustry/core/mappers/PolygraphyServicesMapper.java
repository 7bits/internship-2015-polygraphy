package it.sevenbits.graphicartsindustry.core.mappers;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface PolygraphyServicesMapper {

    @Insert("INSERT INTO polygraphies_payment_methods(polygraphy_id, payment_method_id) " +
            "VALUES (#{polygraphyId}, #{paymentMethodId})")
    void insertPolygraphyPaymentMethod(@Param(value = "polygraphyId") final int polygraphyId,
                                       @Param(value = "paymentMethodId") final int paymentMethodId);

    @Insert("INSERT INTO polygraphies_delivery_methods(polygraphy_id, delivery_method_id) " +
            "VALUES (#{polygraphyId}, #{deliveryMethodId})")
    void insertPolygraphyDeliveryMethod(@Param(value = "polygraphyId") final int polygraphyId,
                                        @Param(value = "deliveryMethodId") final int deliveryMethodId);

    @Insert("INSERT INTO polygraphies_services(polygraphy_id, service_id) " +
            "VALUES (#{polygraphyId}, #{serviceId})")
    void insertPolygraphyService(@Param(value = "polygraphyId") final int polygraphyId,
                                 @Param(value = "serviceId") final int serviceId);


//    @Delete("DELETE FROM polygraphies_payment_methods " +
//            "WHERE polygraphy_id=#{polygraphyId} AND payment_method_id=#{paymentMethodId}")
//    void deletePolygraphyPaymentMethod(@Param(value = "polygraphyId") final int polygraphyId,
//                                       @Param(value = "paymentMethodId") final int paymentMethodId);
//
//    @Delete("DELETE FROM polygraphies_delivery_methods " +
//            "WHERE polygraphy_id=#{polygraphyId} AND delivery_method_id=#{deliveryMethodId}")
//    void deletePolygraphyDeliveryMethod(@Param(value = "polygraphyId") final int polygraphyId,
//                                        @Param(value = "deliveryMethodId") final int deliveryMethodId);
//
//    @Delete("DELETE FROM polygraphies_services " +
//            "WHERE polygraphy_id=#{polygraphyId} AND service_id=#{serviceId}")
//    void deletePolygraphyService(@Param(value = "polygraphyId") final int polygraphyId,
//                                 @Param(value = "serviceId") final int serviceId);


    @Delete("DELETE FROM polygraphies_payment_methods WHERE polygraphy_id=#{polygraphyId}")
    void deletePolygraphyPaymentMethods(@Param(value = "polygraphyId")final int polygraphyId);

    @Delete("DELETE FROM polygraphies_delivery_methods WHERE polygraphy_id=#{polygraphyId}")
    void deletePolygraphyDeliveryMethods(@Param(value = "polygraphyId")final int polygraphyId);

    @Delete("DELETE FROM polygraphies_services WHERE polygraphy_id=#{polygraphyId}")
    void deletePolygraphyServices(@Param(value = "polygraphyId")final int polygraphyId);
}
