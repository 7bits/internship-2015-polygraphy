package it.sevenbits.graphicartsindustry.core.mappers;

import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import it.sevenbits.graphicartsindustry.core.domain.Service;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SearchMapper {

    @Select("SELECT id, name FROM polygraphy LIMIT #{limit}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name")
    })
    List<Polygraphy> findAll(int limit);

    @Select("SELECT id, name FROM polygraphy WHERE name=#{query}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name")
    })
    List<Polygraphy> findPolygraphies(String query);

    @Select("SELECT id, name, rating FROM service ORDER BY rating DESC LIMIT #{limit}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name")
    })
    List<Service> findFrequentServices(int limit);

    @Select("SELECT id, name FROM polygraphy WHERE id=#{id}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name")
    })
    Polygraphy findPolygraphy(int id);
}
