package com.bdqn.mapper;

import com.bdqn.entity.FunctRole;
import org.apache.ibatis.annotations.Param;
// import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (FunctRole)表数据库访问层
 *
 * @author Zt
 * @since 2022-02-28 15:33:56
 */
public interface FunctRoleMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param roleid 主键
     * @return 实例对象
     */
    FunctRole queryById(@Param("roleid") Integer roleid);

    /**
     * 查询指定行数据
     *
     * @param offset   起始查询
     * @param pageSize 每页条数
     * @return 对象列表
     */
    List<FunctRole> queryAllByLimit(@Param("offset") int offset, @Param("pageSize") int pageSize);

    /**
     * 统计总行数
     *
     * @param functRole 查询条件
     * @return 总行数
     */
    long count(FunctRole functRole);

    /**
     * 新增数据
     *
     * @param functRole 实例对象
     * @return 影响行数
     */
    int insert(FunctRole functRole);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<FunctRole> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<FunctRole> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<FunctRole> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<FunctRole> entities);

    /**
     * 修改数据
     *
     * @param functRole 实例对象
     * @return 影响行数
     */
    int update(FunctRole functRole);

    /**
     * 通过主键删除数据
     *
     * @param roleid 主键
     * @return 影响行数
     */
    int deleteById(@Param("roleid") Integer roleid);

}

