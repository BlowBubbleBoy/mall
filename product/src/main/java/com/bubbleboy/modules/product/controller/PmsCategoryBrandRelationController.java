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
import com.bubbleboy.modules.product.dto.PmsCategoryBrandRelationDTO;
import com.bubbleboy.modules.product.excel.PmsCategoryBrandRelationExcel;
import com.bubbleboy.modules.product.service.PmsCategoryBrandRelationService;
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
 * 品牌分类关联
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@RestController
@RequestMapping("product/pmscategorybrandrelation")
@Tag(name="品牌分类关联")
public class PmsCategoryBrandRelationController {
    @Autowired
    private PmsCategoryBrandRelationService pmsCategoryBrandRelationService;

    @GetMapping("page")
    @Operation(summary = "分页")
    @Parameters({
        @Parameter(name = Constant.PAGE, description = "当前页码，从1开始", in = ParameterIn.QUERY, required = true, ref="int") ,
        @Parameter(name = Constant.LIMIT, description = "每页显示记录数", in = ParameterIn.QUERY,required = true, ref="int") ,
        @Parameter(name = Constant.ORDER_FIELD, description = "排序字段", in = ParameterIn.QUERY, ref="String") ,
        @Parameter(name = Constant.ORDER, description = "排序方式，可选值(asc、desc)", in = ParameterIn.QUERY, ref="String")
    })
//    @RequiresPermissions("product:pmscategorybrandrelation:page")
    public Result<PageData<PmsCategoryBrandRelationDTO>> page(@Parameter(hidden = true) @RequestParam Map<String, Object> params){
        PageData<PmsCategoryBrandRelationDTO> page = pmsCategoryBrandRelationService.page(params);

        return new Result<PageData<PmsCategoryBrandRelationDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
//    @RequiresPermissions("product:pmscategorybrandrelation:info")
    public Result<PmsCategoryBrandRelationDTO> get(@PathVariable("id") Long id){
        PmsCategoryBrandRelationDTO data = pmsCategoryBrandRelationService.get(id);

        return new Result<PmsCategoryBrandRelationDTO>().ok(data);
    }

    @PostMapping
    @Operation(summary = "保存")
    @LogOperation("保存")
//    @RequiresPermissions("product:pmscategorybrandrelation:save")
    public Result save(@RequestBody PmsCategoryBrandRelationDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        pmsCategoryBrandRelationService.save(dto);

        return new Result();
    }

    @PutMapping
    @Operation(summary = "修改")
    @LogOperation("修改")
//    @RequiresPermissions("product:pmscategorybrandrelation:update")
    public Result update(@RequestBody PmsCategoryBrandRelationDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        pmsCategoryBrandRelationService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    @LogOperation("删除")
//    @RequiresPermissions("product:pmscategorybrandrelation:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        pmsCategoryBrandRelationService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @Operation(summary = "导出")
    @LogOperation("导出")
//   @RequiresPermissions("product:pmscategorybrandrelation:export")
    public void export(@Parameter(hidden = true) @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<PmsCategoryBrandRelationDTO> list = pmsCategoryBrandRelationService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, "品牌分类关联", list, PmsCategoryBrandRelationExcel.class);
    }

}
