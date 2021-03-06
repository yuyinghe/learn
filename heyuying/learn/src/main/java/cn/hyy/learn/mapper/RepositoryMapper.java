package cn.hyy.learn.mapper;

import cn.hyy.learn.domain.RepositoryDO;
import cn.hyy.learn.domain.condition.RepositoryCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepositoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repository
     *
     * @mbggenerated Fri Apr 06 10:20:30 CST 2018
     */
    int countByExample(RepositoryCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repository
     *
     * @mbggenerated Fri Apr 06 10:20:30 CST 2018
     */
    int deleteByExample(RepositoryCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repository
     *
     * @mbggenerated Fri Apr 06 10:20:30 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repository
     *
     * @mbggenerated Fri Apr 06 10:20:30 CST 2018
     */
    int insert(RepositoryDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repository
     *
     * @mbggenerated Fri Apr 06 10:20:30 CST 2018
     */
    int insertSelective(RepositoryDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repository
     *
     * @mbggenerated Fri Apr 06 10:20:30 CST 2018
     */
    List<RepositoryDO> selectByExample(RepositoryCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repository
     *
     * @mbggenerated Fri Apr 06 10:20:30 CST 2018
     */
    RepositoryDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repository
     *
     * @mbggenerated Fri Apr 06 10:20:30 CST 2018
     */
    int updateByExampleSelective(@Param("record") RepositoryDO record, @Param("example") RepositoryCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repository
     *
     * @mbggenerated Fri Apr 06 10:20:30 CST 2018
     */
    int updateByExample(@Param("record") RepositoryDO record, @Param("example") RepositoryCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repository
     *
     * @mbggenerated Fri Apr 06 10:20:30 CST 2018
     */
    int updateByPrimaryKeySelective(RepositoryDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repository
     *
     * @mbggenerated Fri Apr 06 10:20:30 CST 2018
     */
    int updateByPrimaryKey(RepositoryDO record);
}