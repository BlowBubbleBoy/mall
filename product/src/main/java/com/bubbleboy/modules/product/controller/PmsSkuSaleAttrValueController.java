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
import com.bubbleboy.modules.product.dto.PmsSkuSaleAttrValueDTO;
import com.bubbleboy.modules.product.excel.PmsSkuSaleAttrValueExcel;
import com.bubbleboy.modules.product.service.PmsSkuSaleAttrValueService;
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
 * sku销售属性&值
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@RestController
@RequestMapping("product/pmsskusaleattrvalue")
@Tag(name="sku销售属性&值")
public class PmsSkuSaleAttrValueController {
    @Autowired
    private PmsSkuSaleAttrValueService pmsSkuSaleAttrValueService;

    @GetMapping("page")
    @Operation(summary = "分页")
    @Parameters({
        @Parameter(name = Constant.PAGE, description = "当前页码，从1开始", in = ParameterIn.QUERY, required = true, ref="int") ,
        @Parameter(name = Constant.LIMIT, description = "每页显示记录数", in = ParameterIn.QUERY,required = true, ref="int") ,
        @Parameter(name = Constant.ORDER_FIELD, description = "排序字段", in = ParameterIn.QUERY, ref="String") ,
        @Parameter(name = Constant.ORDER, description = "排序方式，可选值(asc、desc)", in = ParameterIn.QUERY, ref="String")
    })
//    @RequiresPermissions("product:pmsskusaleattrvalue:page")
    public Result<PageData<PmsSkuSaleAttrValueDTO>> page(@Parameter(hidden = true) @RequestParam Map<String, Object> params){
        PageData<PmsSkuSaleAttrValueDTO> page = pmsSkuSaleAttrValueService.page(params);

        return new Result<PageData<PmsSkuSaleAttrValueDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
//    @RequiresPermissions("product:pmsskusaleattrvalue:info")
    public Result<PmsSkuSaleAttrValueDTO> get(@PathVariable("id") Long id){
        PmsSkuSaleAttrValueDTO data = pmsSkuSaleAttrValueService.get(id);

        return new Result<PmsSkuSaleAttrValueDTO>().ok(data);
    }

    @PostMapping
    @Operation(summary = "保存")
    @LogOperation("保存")
//    @RequiresPermissions("product:pmsskusaleattrvalue:save")
    public Result save(@RequestBody PmsSkuSaleAttrValueDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        pmsSkuSaleAttrValueService.save(dto);

        return new Result();
    }

    @PutMapping
    @Operation(summary = "修改")
    @LogOperation("修改")
//    @RequiresPermissions("product:pmsskusaleattrvalue:update")
    public Result update(@RequestBody PmsSkuSaleAttrValueDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        pmsSkuSaleAttrValueService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    @LogOperation("删除")
//    @RequiresPermissions("product:pmsskusaleattrvalue:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        pmsSkuSaleAttrValueService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @Operation(summary = "导出")
    @LogOperation("导出")
//   @RequiresPermissions("product:pmsskusaleattrvalue:export")
    public void export(@Parameter(hidden = true) @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<PmsSkuSaleAttrValueDTO> list = pmsSkuSaleAttrValueService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, "sku销售属性&值", list, PmsSkuSaleAttrValueExcel.class);
    }

}
