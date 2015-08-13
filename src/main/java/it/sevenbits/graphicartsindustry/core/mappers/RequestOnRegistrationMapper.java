package it.sevenbits.graphicartsindustry.core.mappers;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

public interface RequestOnRegistrationMapper {

    @Delete("DELETE FROM request_on_registration " +
            "WHERE id=#{requestId}")
    void removeRequestOnRegistration(@Param("requestId") final int requestId);


    @Delete("DELETE FROM request_on_registration " +
            "WHERE hash=#{hash}")
    void removeRequestOnRegistration(@Param("hash") final String hash);
}
