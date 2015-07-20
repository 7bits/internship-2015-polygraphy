package it.sevenbits.graphicartsindustry.core.mappers;

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




    @SelectProvider(type = PolygraphyProvider.class, method = "findPolygraphiesByName")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "addres", property = "addres"),
            @Result(column = "phone", property = "phone")
    })
    List<Polygraphy> findPolygraphiesByName(@Param(value="query") String query);

    @SelectProvider(type = PolygraphyProvider.class, method = "findPolygraphiesByService")
    @Results({
            @Result(column = "idp", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "addres", property = "addres"),
            @Result(column = "phone", property = "phone")
    })
    List<Polygraphy> findPolygraphiesByService(@Param(value="id") int id);

    @SelectProvider(type = PolygraphyProvider.class, method = "findPolygraphiesByNameAndService")
    @Results({
            @Result(column = "idp", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "addres", property = "addres"),
            @Result(column = "phone", property = "phone")
    })
    List<Polygraphy> findPolygraphiesByNameAndService(@Param(value="query") String query,
                                                      @Param(value="id") int id);





    @Select("SELECT id, name FROM service ORDER BY rating DESC LIMIT #{limit}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name")
    })
    List<Service> findFrequentServices(int limit);




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
