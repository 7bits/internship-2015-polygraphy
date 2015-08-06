package it.sevenbits.graphicartsindustry.core.mappers;

import org.apache.ibatis.annotations.*;

public interface RegistrationLinkMapper {

    @Insert("INSERT INTO registration_hash (hash) VALUES (#{hash})")
    void save(@Param("hash") String hash);


    @Delete("DELETE hash FROM registration_hash WHERE hash=#{hash}")
    void delete(@Param("hash") String hash);


    @Select("SELECT hash FROM registration_hash WHERE hash=#{hash}")
    @Result (column = "hash")
    String find(@Param("hash") String hash);
}
