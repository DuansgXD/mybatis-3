package duansg.example01;

import org.apache.ibatis.annotations.Select;

/**
 * @author Duansg
 * @date 2022-12-22 12:00
 */
public interface ItemMapper {

  /**
   * 查询商品
   *
   * @param itemId
   * @return
   */
  @Select("select * from items where id = #{id}")
  Item findById(Long itemId);

}
