package it.sevenbits.graphicartsindustry.core.mappers;

import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import it.sevenbits.graphicartsindustry.core.domain.PolygraphyContacts;
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
    List<PolygraphyContacts> findPolygraphies(@Param(value = "query") final String query,
                                              @Param(value = "services") final List<Integer> services,
                                              @Param(value = "payment") final int payment_id,
                                              @Param(value = "check") final boolean check,
                                              @Param(value = "delivery") final int delivery_id,
                                              @Param(value = "order") final boolean order);

    @Select("SELECT id, name, email, displayed FROM polygraphy AS p " +
            "LEFT JOIN contact AS c ON p.id=c.polygraphy_id " +
            "ORDER BY name")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "email", property = "email"),
            @Result(column = "displayed", property = "displayed")
    })
    List<PolygraphyContacts> findAllPolygraphies();

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
    List<PolygraphyContacts> findAllPolygraphiesDisplayed(@Param(value = "limit") final int limit);

    @Select("SELECT id, name, address, phone, email, website, info, displayed FROM polygraphy AS p " +
            "LEFT JOIN contact AS c ON p.id=c.polygraphy_id " +
            "WHERE id=#{id}")
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
    PolygraphyContacts findPolygraphy(@Param(value = "id") final int id);

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
    PolygraphyContacts findPolygraphyDisplayed(@Param(value = "id") final int id);


    @Select("SELECT id FROM polygraphy " +
            "WHERE user_id=#{userId}")
    @Result(column = "id")
    Integer getPolygraphyIdByUserId(@Param(value = "userId") final int userId);

    @Select("SELECT user_id FROM polygraphy " +
            "WHERE id=#{polygraphyId}")
    @Result(column = "user_id")
    Integer getUserIdByPolygraphyId(@Param(value = "polygraphyId") final int polygraphyId);


    @Select("SELECT writes_the_check FROM polygraphy " +
            "WHERE id=#{polygraphyId}")
    @Result(column = "writes_the_check")
    Boolean isWritesTheCheck(@Param(value = "polygraphyId") final int polygraphyId);

    @Select("SELECT order_by_email FROM polygraphy " +
            "WHERE id=#{polygraphyId}")
    @Result(column = "order_by_email")
    Boolean isOrderByEmail(@Param(value = "polygraphyId") final int polygraphyId);


    @Insert("INSERT INTO polygraphy (name, writes_the_check, order_by_email, info, user_id) " +
            "VALUES (#{name}, #{check}, #{order}, #{info}, #{userId})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void createPolygraphy(final Polygraphy polygraphy);


    @Update("UPDATE polygraphy " +
            "SET name=#{name} " +
            "WHERE id=#{id}")
    void updatePolygraphyName(@Param(value = "id") final int polygraphyId,
                              @Param(value = "name") final String name);

    @Update("UPDATE polygraphy " +
            "SET writes_the_check=#{check} " +
            "WHERE id=#{id}")
    void updatePolygraphyWritesTheCheck(@Param(value = "id") final int polygraphyId,
                                        @Param(value = "check") final boolean check);

    @Update("UPDATE polygraphy " +
            "SET order_by_email=#{order} " +
            "WHERE id=#{id}")
    void updatePolygraphyOrderByEmail(@Param(value = "id") final int polygraphyId,
                                      @Param(value = "order") final boolean order);

    @Update("UPDATE polygraphy " +
            "SET info=#{info} " +
            "WHERE id=#{id}")
    void updatePolygraphyInfo(@Param(value = "id") final int polygraphyId,
                              @Param(value = "info") final String info);

    @Update("UPDATE polygraphy " +
            "SET displayed=#{condition} " +
            "WHERE id=#{polygraphyId}")
    void updateConditionDisplayPolygraphy(@Param(value = "polygraphyId") int polygraphyId,
                                          @Param(value = "condition") boolean condition);


    @Delete("DELETE FROM polygraphy " +
            "WHERE id=#{polygraphyId}")
    void deletePolygraphy(@Param(value = "polygraphyId") final int polygraphyId);
}
