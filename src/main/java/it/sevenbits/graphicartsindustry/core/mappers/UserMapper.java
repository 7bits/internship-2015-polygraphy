package it.sevenbits.graphicartsindustry.core.mappers;

import it.sevenbits.graphicartsindustry.core.domain.Role;
import it.sevenbits.graphicartsindustry.core.domain.User;
import org.apache.ibatis.annotations.*;

public interface UserMapper {

    @Select("SELECT id, email, password_hash, enabled, role " +
            "FROM users " +
            "WHERE email=#{userName}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "email", property = "email"),
            @Result(column = "password_hash", property = "password"),
            @Result(column = "enabled", property = "enabled"),
            @Result(column = "role", property = "role", javaType = Role.class)
    })
    User findByUsername(@Param("userName") String userName);


    @Select("SELECT id, email, password_hash, enabled, role " +
            "FROM users " +
            "WHERE id=#{id}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "email", property = "email"),
            @Result(column = "password_hash", property = "password"),
            @Result(column = "enabled", property = "enabled"),
            @Result(column = "role", property = "role", javaType = Role.class)
    })
    User findById(@Param("id") int id);


    @Insert("INSERT INTO users (email, password_hash, role) " +
            "VALUES (#{email}, #{password}, #{role})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void save(User user);
}
