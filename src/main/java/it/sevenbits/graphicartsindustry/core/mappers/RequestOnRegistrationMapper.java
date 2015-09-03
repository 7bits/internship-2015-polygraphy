package it.sevenbits.graphicartsindustry.core.mappers;

import it.sevenbits.graphicartsindustry.core.domain.RequestOnRegistration;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface RequestOnRegistrationMapper {

    @Select("SELECT id, email, hash FROM request_on_registration")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "email", property = "email"),
            @Result(column = "hash", property = "hash")
    })
    List<RequestOnRegistration> findAllRequestsOnRegistration();

    @Select("SELECT id, email, hash FROM request_on_registration " +
            "WHERE id=#{requestId}")
    @Results ({
            @Result(column = "id", property = "id"),
            @Result(column = "email", property = "email"),
            @Result(column = "hash", property = "hash")
    })
    RequestOnRegistration findRequestById(@Param("requestId") final int requestId);

    @Select("SELECT id, email, hash FROM request_on_registration " +
            "WHERE email=#{email}")
    @Results ({
            @Result(column = "id", property = "id"),
            @Result(column = "email", property = "email"),
            @Result(column = "hash", property = "hash")
    })
    RequestOnRegistration findRequestByEmail(@Param("email") final String email);

    @Select("SELECT id, email, hash FROM request_on_registration " +
            "WHERE hash=#{hash}")
    @Results ({
            @Result(column = "id", property = "id"),
            @Result(column = "email", property = "email"),
            @Result(column = "hash", property = "hash")
    })
    RequestOnRegistration findRequestByHash(@Param("hash") final String hash);


    @Insert("INSERT INTO request_on_registration (email) " +
            "VALUES (#{email})")
    void saveRequestOnRegistration(@Param("email") final String email);

    @Insert("UPDATE request_on_registration SET hash=#{hash} " +
            "WHERE id=#{id}")
    void saveHash(@Param("hash") final String hash,
                  @Param("id") final int id);


    @Delete("DELETE FROM request_on_registration " +
            "WHERE id=#{requestId}")
    void removeRequestOnRegistrationById(@Param("requestId") final int requestId);

    @Delete("DELETE FROM request_on_registration " +
            "WHERE hash=#{hash}")
    void removeRequestOnRegistrationByHash(@Param("hash") final String hash);
}
