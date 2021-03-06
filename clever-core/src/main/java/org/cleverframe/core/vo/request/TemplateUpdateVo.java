package org.cleverframe.core.vo.request;

import org.cleverframe.common.vo.request.BaseRequestVo;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * 作者：LiZW <br/>
 * 创建时间：2016-6-17 15:57 <br/>
 */
public class TemplateUpdateVo extends BaseRequestVo {
    private static final long serialVersionUID = 1L;
    /**
     * 数据ID
     */
    @NotNull(message = "数据ID不能为空")
    private Long id;

    /**
     * 删除标记（1：正常；2：删除；3：审核）,以字典表sys_dict.dict_key=‘删除标记’为准'
     */
    @Pattern(regexp = "1|2", message = "删除标记只能是：1(正常)、2(删除)")
    private String delFlag;

    /**
     * 备注
     */
    @Length(max = 255, message = "备注信息长度不能超过255个字符")
    private String remarks;

    /**
     * 模版名称，不能重复
     */
    @Length(max = 255, message = "模版名称长度不能超过255个字符")
    private String name;

    /**
     * 模版内容
     */
    @Length(max = 2000000, message = "模版内容长度不能超过2000000个字符")
    private String content;

    /**
     * 模版语言
     */
    @Length(max = 50, message = "模版语言长度不能超过2000个字符")
    private String locale;

    /**
     * 模版说明
     */
    @Length(max = 1000, message = "模版说明长度不能超过2000个字符")
    private String description;

    /*--------------------------------------------------------------
     *          getter、setter
     * -------------------------------------------------------------*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
