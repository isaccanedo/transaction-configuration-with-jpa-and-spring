package com.isaccanedo.mapper;

import com.isaccanedo.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface OrderMapper {

    /**
     * insert order
     * @param order
     * @return
     */
    public int insert(Order order);

}
