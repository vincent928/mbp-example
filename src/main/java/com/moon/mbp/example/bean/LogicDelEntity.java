package com.moon.mbp.example.bean;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author : moon
 * @Date : 2020/2/25 15:02
 * @Description : 通用字段父类
 */
@Data
public class LogicDelEntity implements Serializable {
    @TableLogic
    @TableField(
            select = false,
            fill = FieldFill.INSERT
    )
    private Integer isDel;
}
