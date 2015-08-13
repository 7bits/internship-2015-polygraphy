package it.sevenbits.graphicartsindustry.core.mappers;

import it.sevenbits.graphicartsindustry.core.domain.RequestOnRegistration;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface RequestOnRegistrationMapper {

    @Delete("DELETE FROM request_on_registration " +
            "WHERE id=#{requestId}")
    void removeRequestOnRegistration(@Param("requestId") final int requestId);


    @Delete("DELETE FROM request_on_registration " +
            "WHERE hash=#{hash}")
    void removeRequestOnRegistration(@Param("hash") final String hash);

    @Select("SELECT id, email, hash FROM request_on_registration ")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "email", property = "email"),
            @Result(column = "hash", property = "hash")
    })
    List<RequestOnRegistration> findAllRequestOnRegistration();
}
