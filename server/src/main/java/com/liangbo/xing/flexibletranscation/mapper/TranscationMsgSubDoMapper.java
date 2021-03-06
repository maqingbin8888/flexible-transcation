package com.liangbo.xing.flexibletranscation.mapper;

import com.liangbo.xing.flexibletranscation.domain.ftm.TranscationMsgSubDo;
import com.liangbo.xing.flexibletranscation.domain.ftm.TranscationMsgSubDoExample;
import java.util.List;

public interface TranscationMsgSubDoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_transcation_msg_sub
     *
     * @mbggenerated Mon Dec 25 10:55:07 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_transcation_msg_sub
     *
     * @mbggenerated Mon Dec 25 10:55:07 CST 2017
     */
    int insert(TranscationMsgSubDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_transcation_msg_sub
     *
     * @mbggenerated Mon Dec 25 10:55:07 CST 2017
     */
    int insertSelective(TranscationMsgSubDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_transcation_msg_sub
     *
     * @mbggenerated Mon Dec 25 10:55:07 CST 2017
     */
    List<TranscationMsgSubDo> selectByExample(TranscationMsgSubDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_transcation_msg_sub
     *
     * @mbggenerated Mon Dec 25 10:55:07 CST 2017
     */
    TranscationMsgSubDo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_transcation_msg_sub
     *
     * @mbggenerated Mon Dec 25 10:55:07 CST 2017
     */
    int updateByPrimaryKeySelective(TranscationMsgSubDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_transcation_msg_sub
     *
     * @mbggenerated Mon Dec 25 10:55:07 CST 2017
     */
    int updateByPrimaryKey(TranscationMsgSubDo record);
}