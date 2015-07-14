package it.sevenbits.graphicartsindustry.core.mappers;

import it.sevenbits.graphicartsindustry.core.domain.Polygraphy;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SearchMapper {

    @Select("SELECT id, name FROM polygraphy limit #{limit}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name")
    })
    List<Polygraphy> findAll(int limit);
}
