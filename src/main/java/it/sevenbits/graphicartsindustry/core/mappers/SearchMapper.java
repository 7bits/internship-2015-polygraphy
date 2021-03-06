package it.sevenbits.graphicartsindustry.core.mappers;

import it.sevenbits.graphicartsindustry.core.domain.DeliveryMethod;
import it.sevenbits.graphicartsindustry.core.domain.PaymentMethod;
import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import it.sevenbits.graphicartsindustry.core.domain.Service;
import it.sevenbits.graphicartsindustry.core.repository.PolygraphyProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SearchMapper {

    @Select("SELECT id, name, addres, phone FROM polygraphy AS p " +
            "LEFT JOIN contacts AS c ON p.id=c.polygraphy_id " +
            "LIMIT #{limit}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "addres", property = "addres"),
            @Result(column = "phone", property = "phone")
    })
    List<Polygraphy> findAll(int limit);

    @SelectProvider(type = PolygraphyProvider.class, method = "findPolygraphies")
    @Results({
            @Result(column = "polygraphy_id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "addres", property = "addres"),
            @Result(column = "phone", property = "phone")
    })
    List<Polygraphy> findPolygraphies(@Param(value = "query") String query,
                                      @Param(value = "service") int service_id,
                                      @Param(value = "payment") int payment_id,
                                      @Param(value = "check") boolean check,
                                      @Param(value = "delivery") int delivery_id,
                                      @Param(value = "order") boolean order);


    @Select("SELECT id, name FROM service ORDER BY rating DESC LIMIT #{limit}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name")
    })
    List<Service> findFrequentServices(int limit);


    @Select("SELECT id, name FROM payment_method")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name")
    })
    List<PaymentMethod> findPaymentMethods();


    @Select("SELECT id, name FROM delivery_method")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name")
    })
    List<DeliveryMethod> findDeliveryMethods();


    @Select("SELECT id, name, addres, phone, email, website FROM polygraphy AS p LEFT JOIN contacts AS c ON p.id=c.polygraphy_id " +
            "WHERE id=#{id}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "addres", property = "addres"),
            @Result(column = "phone", property = "phone"),
            @Result(column = "email", property = "email"),
            @Result(column = "website", property = "website")
    })
    Polygraphy findPolygraphy(int id);
}
