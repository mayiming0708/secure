package com.shtel.secure.platform.receive.model.mapper;

import com.shtel.secure.platform.receive.model.ResultEvent;
import com.shtel.secure.platform.receive.model.Temp;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
@org.apache.ibatis.annotations.Mapper
public interface ResultEventMapper extends Mapper<ResultEvent> {

}