
package com.bubbleboy.admin.modules.job.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 定时任务日志
 */
@Data
@Schema(title = "定时任务日志")
public class ScheduleJobLogDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Schema(title = "id")
    private Long id;

    @Schema(title = "任务id")
    private Long jobId;

    @Schema(title = "spring bean名称")
    private String beanName;

    @Schema(title = "参数")
    private String params;

    @Schema(title = "任务状态    0：失败    1：成功")
    private Integer status;

    @Schema(title = "失败信息")
    private String error;

    @Schema(title = "耗时(单位：毫秒)")
    private Integer times;

    @Schema(title = "创建时间")
    private Date createDate;

}
