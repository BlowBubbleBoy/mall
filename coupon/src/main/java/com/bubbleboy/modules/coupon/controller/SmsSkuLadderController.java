package com.bubbleboy.modules.coupon.controller;

import com.bubbleboy.common.annotation.LogOperation;
import com.bubbleboy.common.constant.Constant;
import com.bubbleboy.common.page.PageData;
import com.bubbleboy.common.utils.ExcelUtils;
import com.bubbleboy.common.utils.Result;
import com.bubbleboy.common.validator.AssertUtils;
import com.bubbleboy.common.validator.ValidatorUtils;
import com.bubbleboy.common.validator.group.AddGroup;
import com.bubbleboy.common.validator.group.DefaultGroup;
import com.bubbleboy.common.validator.group.UpdateGroup;
import com.bubbleboy.modules.coupon.dto.SmsSkuLadderDTO;
import com.bubbleboy.modules.coupon.excel.SmsSkuLadderExcel;
import com.bubbleboy.modules.coupon.service.SmsSkuLadderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 商品阶梯价格
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@RestController
@RequestMapping("coupon/smsskuladder")
@Tag(name="商品阶梯价格")
public class SmsSkuLadderController {
    @Autowired
    private SmsSkuLadderService smsSkuLadderService;

    @GetMapping("page")
    @Operation(summary = "分页")
    @Parameters({
        @Parameter(name = Constant.PAGE, description = "当前页码，从1开始", in = ParameterIn.QUERY, required = true, ref="int") ,
        @Parameter(name = Constant.LIMIT, description = "每页显示记录数", in = ParameterIn.QUERY,required = true, ref="int") ,
        @Parameter(name = Constant.ORDER_FIELD, description = "排序字段", in = ParameterIn.QUERY, ref="String") ,
        @Parameter(name = Constant.ORDER, description = "排序方式，可选值(asc、desc)", in = ParameterIn.QUERY, ref="String")
    })
//    @RequiresPermissions("coupon:smsskuladder:page")
    public Result<PageData<SmsSkuLadderDTO>> page(@Parameter(hidden = true) @RequestParam Map<String, Object> params){
        PageData<SmsSkuLadderDTO> page = smsSkuLadderService.page(params);

        return new Result<PageData<SmsSkuLadderDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
//    @RequiresPermissions("coupon:smsskuladder:info")
    public Result<SmsSkuLadderDTO> get(@PathVariable("id") Long id){
        SmsSkuLadderDTO data = smsSkuLadderService.get(id);

        return new Result<SmsSkuLadderDTO>().ok(data);
    }

    @PostMapping
    @Operation(summary = "保存")
    @LogOperation("保存")
//    @RequiresPermissions("coupon:smsskuladder:save")
    public Result save(@RequestBody SmsSkuLadderDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        smsSkuLadderService.save(dto);

        return new Result();
    }

    @PutMapping
    @Operation(summary = "修改")
    @LogOperation("修改")
//    @RequiresPermissions("coupon:smsskuladder:update")
    public Result update(@RequestBody SmsSkuLadderDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        smsSkuLadderService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    @LogOperation("删除")
//    @RequiresPermissions("coupon:smsskuladder:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        smsSkuLadderService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @Operation(summary = "导出")
    @LogOperation("导出")
//   @RequiresPermissions("coupon:smsskuladder:export")
    public void export(@Parameter(hidden = true) @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<SmsSkuLadderDTO> list = smsSkuLadderService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, "商品阶梯价格", list, SmsSkuLadderExcel.class);
    }

}
