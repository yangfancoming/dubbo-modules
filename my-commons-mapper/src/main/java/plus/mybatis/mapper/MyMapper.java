package plus.mybatis.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 自己的 Mapper
 * 特别注意，该接口不能被扫描到，否则会出错
 */
public interface MyMapper<T> extends BaseMapper<T> {
}
