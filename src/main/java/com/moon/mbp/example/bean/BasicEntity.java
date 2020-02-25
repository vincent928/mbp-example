package com.moon.mbp.example.bean;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author : moon
 * @Date : 2020/2/25 15:02
 * @Description : 通用字段父类
 */
@Data
public class BasicEntity implements Serializable {
    @TableField(
            fill = FieldFill.INSERT
    )
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC+8")
    private Date createTime;

    @TableField(
            fill = FieldFill.INSERT_UPDATE
    )
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC+8")
    private Date updateTime;

    @TableLogic
    @TableField(
            select = false,
            fill = FieldFill.INSERT
    )
    private Integer isDel;
}
