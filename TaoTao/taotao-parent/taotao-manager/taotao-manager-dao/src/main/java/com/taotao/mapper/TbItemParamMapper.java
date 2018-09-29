package com.taotao.mapper;

import com.taotao.mapper.wrapper.PageParamWrapper;
import com.taotao.pojo.ItemParamBean;
import com.taotao.pojo.TbItemParam;
import com.taotao.pojo.TbItemParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemParamMapper {
	
	//这个语句涉及两个表:  tb_item_param,  tb_item_cat  
	List<ItemParamBean> list();
	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 14 08:12:18 CST 2018
     */
    long countByExample(TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 14 08:12:18 CST 2018
     */
    int deleteByExample(TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 14 08:12:18 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 14 08:12:18 CST 2018
     */
    int insert(TbItemParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 14 08:12:18 CST 2018
     */
    int insertSelective(TbItemParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 14 08:12:18 CST 2018
     */
    List<TbItemParam> selectByExampleWithBLOBs(TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 14 08:12:18 CST 2018
     */
    List<TbItemParam> selectByExample(TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 14 08:12:18 CST 2018
     */
    TbItemParam selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 14 08:12:18 CST 2018
     */
    int updateByExampleSelective(@Param("record") TbItemParam record, @Param("example") TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 14 08:12:18 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") TbItemParam record, @Param("example") TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 14 08:12:18 CST 2018
     */
    int updateByExample(@Param("record") TbItemParam record, @Param("example") TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 14 08:12:18 CST 2018
     */
    int updateByPrimaryKeySelective(TbItemParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 14 08:12:18 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(TbItemParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 14 08:12:18 CST 2018
     */
    int updateByPrimaryKey(TbItemParam record);
}