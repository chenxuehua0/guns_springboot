package com.stylefeng.guns.modular.system.model;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 测试表
 * </p>
 *
 * @author stylefeng
 * @since 2018-08-20
 */
@TableName("sys_test")
public class Test extends Model<Test> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "role_id", type = IdType.AUTO)
    private Integer roleId;
    @TableField("role_name")
    private String roleName;
    @TableField("role_type_id")
    private Integer roleTypeId;
    @TableField("role_state")
    private Integer roleState;
    @TableField("cre_time")
    private Date creTime;
    @TableField("upd_time")
    private Date updTime;


    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(Integer roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    public Integer getRoleState() {
        return roleState;
    }

    public void setRoleState(Integer roleState) {
        this.roleState = roleState;
    }

    public Date getCreTime() {
        return creTime;
    }

    public void setCreTime(Date creTime) {
        this.creTime = creTime;
    }

    public Date getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.roleId;
    }

    @Override
    public String toString() {
        return "Test{" +
        "roleId=" + roleId +
        ", roleName=" + roleName +
        ", roleTypeId=" + roleTypeId +
        ", roleState=" + roleState +
        ", creTime=" + creTime +
        ", updTime=" + updTime +
        "}";
    }
}
