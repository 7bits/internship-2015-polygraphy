package it.sevenbits.graphicartsindustry.core.mappers;

import it.sevenbits.graphicartsindustry.core.domain.DeliveryMethod;
import it.sevenbits.graphicartsindustry.core.domain.PaymentMethod;
import it.sevenbits.graphicartsindustry.core.domain.Service;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

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
    List<Service> findFrequentServices(@Param(value = "limit") final int limit);


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
