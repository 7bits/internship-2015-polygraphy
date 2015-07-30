package it.sevenbits.graphicartsindustry.core.mappers;

import org.apache.ibatis.annotations.*;

public interface RegistrationLinkMapper {

    @Insert("INSERT INTO registration_link (hash) VALUES (#{hash})")
    void save(@Param("hash") final String hash);


    @Delete("DELETE hash FROM registration_link WHERE hash=#{hash}")
    void delete(@Param("hash") final String hash);


    @Select("SELECT hash FROM registration_link WHERE hash=#{hash}")
    @Result (column = "hash")
    String find(@Param("hash") final String hash);
}
