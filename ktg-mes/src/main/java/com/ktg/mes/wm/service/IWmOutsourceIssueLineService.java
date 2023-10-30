package com.ktg.mes.wm.service;

import java.util.List;
import com.ktg.mes.wm.domain.WmOutsourceIssueLine;

/**
 * 外协领料单行Service接口
 * 
 * @author yinjinlu
 * @date 2023-10-30
 */
public interface IWmOutsourceIssueLineService 
{
    /**
     * 查询外协领料单行
     * 
     * @param lineId 外协领料单行主键
     * @return 外协领料单行
     */
    public WmOutsourceIssueLine selectWmOutsourceIssueLineByLineId(Long lineId);

    /**
     * 查询外协领料单行列表
     * 
     * @param wmOutsourceIssueLine 外协领料单行
     * @return 外协领料单行集合
     */
    public List<WmOutsourceIssueLine> selectWmOutsourceIssueLineList(WmOutsourceIssueLine wmOutsourceIssueLine);

    /**
     * 新增外协领料单行
     * 
     * @param wmOutsourceIssueLine 外协领料单行
     * @return 结果
     */
    public int insertWmOutsourceIssueLine(WmOutsourceIssueLine wmOutsourceIssueLine);

    /**
     * 修改外协领料单行
     * 
     * @param wmOutsourceIssueLine 外协领料单行
     * @return 结果
     */
    public int updateWmOutsourceIssueLine(WmOutsourceIssueLine wmOutsourceIssueLine);

    /**
     * 批量删除外协领料单行
     * 
     * @param lineIds 需要删除的外协领料单行主键集合
     * @return 结果
     */
    public int deleteWmOutsourceIssueLineByLineIds(Long[] lineIds);

    /**
     * 删除外协领料单行信息
     * 
     * @param lineId 外协领料单行主键
     * @return 结果
     */
    public int deleteWmOutsourceIssueLineByLineId(Long lineId);
}
