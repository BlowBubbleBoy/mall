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
import com.bubbleboy.modules.coupon.dto.SmsSpuBoundsDTO;
import com.bubbleboy.modules.coupon.excel.SmsSpuBoundsExcel;
import com.bubbleboy.modules.coupon.service.SmsSpuBoundsService;
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
 * 商品spu积分设置
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@RestController
@RequestMapping("coupon/smsspubounds")
@Tag(name="商品spu积分设置")
public class SmsSpuBoundsController {
    @Autowired
    private SmsSpuBoundsService smsSpuBoundsService;

    @GetMapping("page")
    @Operation(summary = "分页")
    @Parameters({
        @Parameter(name = Constant.PAGE, description = "当前页码，从1开始", in = ParameterIn.QUERY, required = true, ref="int") ,
        @Parameter(name = Constant.LIMIT, description = "每页显示记录数", in = ParameterIn.QUERY,required = true, ref="int") ,
        @Parameter(name = Constant.ORDER_FIELD, description = "排序字段", in = ParameterIn.QUERY, ref="String") ,
        @Parameter(name = Constant.ORDER, description = "排序方式，可选值(asc、desc)", in = ParameterIn.QUERY, ref="String")
    })
//    @RequiresPermissions("coupon:smsspubounds:page")
    public Result<PageData<SmsSpuBoundsDTO>> page(@Parameter(hidden = true) @RequestParam Map<String, Object> params){
        PageData<SmsSpuBoundsDTO> page = smsSpuBoundsService.page(params);

        return new Result<PageData<SmsSpuBoundsDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
//    @RequiresPermissions("coupon:smsspubounds:info")
    public Result<SmsSpuBoundsDTO> get(@PathVariable("id") Long id){
        SmsSpuBoundsDTO data = smsSpuBoundsService.get(id);

        return new Result<SmsSpuBoundsDTO>().ok(data);
    }

    @PostMapping
    @Operation(summary = "保存")
    @LogOperation("保存")
//    @RequiresPermissions("coupon:smsspubounds:save")
    public Result save(@RequestBody SmsSpuBoundsDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        smsSpuBoundsService.save(dto);

        return new Result();
    }

    @PutMapping
    @Operation(summary = "修改")
    @LogOperation("修改")
//    @RequiresPermissions("coupon:smsspubounds:update")
    public Result update(@RequestBody SmsSpuBoundsDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        smsSpuBoundsService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    @LogOperation("删除")
//    @RequiresPermissions("coupon:smsspubounds:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        smsSpuBoundsService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @Operation(summary = "导出")
    @LogOperation("导出")
//   @RequiresPermissions("coupon:smsspubounds:export")
    public void export(@Parameter(hidden = true) @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<SmsSpuBoundsDTO> list = smsSpuBoundsService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, "商品spu积分设置", list, SmsSpuBoundsExcel.class);
    }

}
