package com.bubbleboy.modules.member.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * 会员收藏的专题活动
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@Schema(name = "会员收藏的专题活动")
public class UmsMemberCollectSubjectDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	private Long id;

	@SchemaProperty(name = "subject_id")
	private Long subjectId;

	@SchemaProperty(name = "subject_name")
	private String subjectName;

	@SchemaProperty(name = "subject_img")
	private String subjectImg;

	@SchemaProperty(name = "活动url")
	private String subjectUrll;


}
