package it.sevenbits.graphicartsindustry.core.mappers;

import it.sevenbits.graphicartsindustry.core.domain.Role;
import it.sevenbits.graphicartsindustry.core.domain.User;
import org.apache.ibatis.annotations.*;

public interface UserMapper {

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
    User findUserById(@Param("id") final int id);

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
    User findUserByUsername(@Param("userName") final String userName);


    @Update("UPDATE users " +
            "SET email=#{email} " +
            "WHERE id=#{userId}")
    void updateEmail(@Param(value = "userId") final int userId,
                     @Param(value = "email") final String email);

    @Update("UPDATE users " +
            "SET password_hash=#{password} " +
            "WHERE id=#{userId}")
    void updatePassword(@Param(value = "userId") final int userId,
                     @Param(value = "password") final String password);


    @Insert("INSERT INTO users (email, password_hash, role, enabled) " +
            "VALUES (#{email}, #{password}, #{role}, #{enabled})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void saveUser(final User user);

    @Delete("DELETE FROM users " +
            "WHERE id=#{userId}")
    void deleteUser(@Param(value = "userId") final int userId);
}
