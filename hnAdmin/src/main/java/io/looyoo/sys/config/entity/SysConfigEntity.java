package io.looyoo.sys.config.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

/**
 * <p>
 * 系统配置信息表
 * </p>
 *
 * @author haiping.tang
 * @since 2018-03-26
 */
@TableName("sys_config")
public class SysConfigEntity extends Model<SysConfigEntity> {
	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	@TableId(type = IdType.AUTO)
	private Long id;
	/**
	 * key
	 */
	@NotBlank(message = "参数名不能为空")
	private String key;
	/**
	 * value
	 */

	@NotBlank(message = "参数值不能为空")
	private String value;
	/**
	 * 状态 0：隐藏 1：显示
	 */
	private Integer status;
	/**
	 * 备注
	 */
	private String remark;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
