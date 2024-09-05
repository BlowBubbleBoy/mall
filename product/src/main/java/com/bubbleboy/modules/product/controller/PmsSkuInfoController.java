package com.bubbleboy.modules.product.controller;

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
import com.bubbleboy.modules.product.dto.PmsSkuInfoDTO;
import com.bubbleboy.modules.product.excel.PmsSkuInfoExcel;
import com.bubbleboy.modules.product.service.PmsSkuInfoService;
//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


/**
 * sku信息
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@RestController
@RequestMapping("product/pmsskuinfo")
@Tag(name="sku信息")
public class PmsSkuInfoController {
    @Autowired
    private PmsSkuInfoService pmsSkuInfoService;

    @GetMapping("page")
    @Operation(summary = "分页")
    @Parameters({
        @Parameter(name = Constant.PAGE, description = "当前页码，从1开始", in = ParameterIn.QUERY, required = true, ref="int") ,
        @Parameter(name = Constant.LIMIT, description = "每页显示记录数", in = ParameterIn.QUERY,required = true, ref="int") ,
        @Parameter(name = Constant.ORDER_FIELD, description = "排序字段", in = ParameterIn.QUERY, ref="String") ,
        @Parameter(name = Constant.ORDER, description = "排序方式，可选值(asc、desc)", in = ParameterIn.QUERY, ref="String")
    })
//    @RequiresPermissions("product:pmsskuinfo:page")
    public Result<PageData<PmsSkuInfoDTO>> page(@Parameter(hidden = true) @RequestParam Map<String, Object> params){
        PageData<PmsSkuInfoDTO> page = pmsSkuInfoService.page(params);

        return new Result<PageData<PmsSkuInfoDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
//    @RequiresPermissions("product:pmsskuinfo:info")
    public Result<PmsSkuInfoDTO> get(@PathVariable("id") Long id){
        PmsSkuInfoDTO data = pmsSkuInfoService.get(id);

        return new Result<PmsSkuInfoDTO>().ok(data);
    }

    @PostMapping
    @Operation(summary = "保存")
    @LogOperation("保存")
//    @RequiresPermissions("product:pmsskuinfo:save")
    public Result save(@RequestBody PmsSkuInfoDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        pmsSkuInfoService.save(dto);

        return new Result();
    }

    @PutMapping
    @Operation(summary = "修改")
    @LogOperation("修改")
//    @RequiresPermissions("product:pmsskuinfo:update")
    public Result update(@RequestBody PmsSkuInfoDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        pmsSkuInfoService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    @LogOperation("删除")
//    @RequiresPermissions("product:pmsskuinfo:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        pmsSkuInfoService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @Operation(summary = "导出")
    @LogOperation("导出")
//   @RequiresPermissions("product:pmsskuinfo:export")
    public void export(@Parameter(hidden = true) @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<PmsSkuInfoDTO> list = pmsSkuInfoService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, "sku信息", list, PmsSkuInfoExcel.class);
    }

}
