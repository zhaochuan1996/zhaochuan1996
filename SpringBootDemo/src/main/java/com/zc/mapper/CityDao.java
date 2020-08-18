package com.zc.mapper;

import com.zc.pojo.City;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface CityDao {

    @Select("select * from m_city where country_id = #{countryId}")
    List<City> getCitiesByCountryId(int countryId);
}
