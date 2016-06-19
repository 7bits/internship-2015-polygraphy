package it.sevenbits.graphicartsindustry.core.mappers;

import it.sevenbits.graphicartsindustry.core.domain.content.DeliveryMethod;
import it.sevenbits.graphicartsindustry.core.domain.content.PaymentMethod;
import it.sevenbits.graphicartsindustry.core.domain.content.Service;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ContentMapper {

    @Select("SELECT id, name FROM service")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name")
    })
    List<Service> findAllServices();

    @Select("SELECT id, name FROM service " +
            "ORDER BY rating DESC " +
            "LIMIT #{limit}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name")
    })
    List<Service> findFrequentServices(@Param(value = "limit") final Integer limit);

    @Select("SELECT id, name FROM service " +
            "WHERE LOWER(name) ILIKE CONCAT('%', #{name}, '%')")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name")
    })
    List<Service> findServicesByName(@Param(value = "name") final String name);

    @Update("UPDATE service " +
            "SET rating=rating + 1 " +
            "WHERE id=#{serviceId}")
    void incrementServiceRating(@Param(value = "serviceId") final Integer serviceId);

    @Select("SELECT id, name FROM payment_method")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name")
    })
    List<PaymentMethod> findAllPaymentMethods();


    @Select("SELECT id, name FROM delivery_method")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name")
    })
    List<DeliveryMethod> findAllDeliveryMethods();
}
