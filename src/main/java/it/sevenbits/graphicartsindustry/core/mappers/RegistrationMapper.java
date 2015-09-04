package it.sevenbits.graphicartsindustry.core.mappers;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

public interface RegistrationMapper {

//    @Select("SELECT id, name FROM polygraphy AS p " +
//            "WHERE name=#{name}")
//    @Result(column = "id")
//    int findPolygraphyId(@Param("name") final String name);


    //User
    @Select("SELECT email FROM users WHERE email=#{email}")
    @Result (column = "email")
    String findUserByEmail(@Param("email") final String email);
}
