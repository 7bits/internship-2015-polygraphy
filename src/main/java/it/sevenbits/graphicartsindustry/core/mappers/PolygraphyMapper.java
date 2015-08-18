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

    @Update("UPDATE polygraphy " +
            "SET displayed=#{condition} " +
            "WHERE id=#{polygraphyId}")
    void changeConditionDisplayPolygraphy(@Param(value = "polygraphyId") int polygraphyId,
                                          @Param(value = "condition") boolean condition);

    @Select("SELECT user_id FROM polygraphy WHERE id=#{polygraphyId}")
    @Result(column = "user_id")
    Integer getUserId(@Param(value = "polygraphyId") int polygraphyId);

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
