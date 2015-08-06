package it.sevenbits.graphicartsindustry.core.mappers;

import org.apache.ibatis.annotations.*;

public interface RegistrationLinkMapper {

    @Insert("INSERT INTO request_on_registration (hash) VALUES (#{hash}) " +
            "WHERE id=#{id}")
    void save(@Param("hash") final String hash,
              @Param("id") final int id);


    @Delete("DELETE hash FROM registration_hash WHERE hash=#{hash}")
    void delete(@Param("hash") String hash);


    @Select("SELECT hash FROM registration_hash WHERE hash=#{hash}")
    @Result (column = "hash")
    String find(@Param("hash") String hash);
}
