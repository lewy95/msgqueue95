package cn.xzxy.lewy.kafka.mapper;

import cn.xzxy.lewy.kafka.pojo.City;
import cn.xzxy.lewy.kafka.pojo.CityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CityMapper {
    long countByExample(CityExample example);

    int deleteByExample(CityExample example);

    int deleteByPrimaryKey(Integer cityId);

    int insert(City record);

    int insertSelective(City record);

    List<City> selectByExample(CityExample example);

    City selectByPrimaryKey(Integer cityId);

    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    int updateByExample(@Param("record") City record, @Param("example") CityExample example);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}