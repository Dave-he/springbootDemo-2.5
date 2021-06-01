package com.heyx.demo.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * 学生积分记录表 Entity
 *
 * @author heyongxian
 * @date 2020/03/26 下午4:12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("student_point_record")
public class StudentPointRecord extends Model<StudentPointRecord> {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(value = "subject")
    private Integer subject;

    @TableField(value = "student_id")
    private Long studentId;

    @TableField(value = "mission_id")
    private Long missionId;

    @TableField(value = "chapter_id")
    private Long chapterId;

    @TableField(value = "type")
    private Integer type;

    @TableField(value = "sub_id")
    private Long subId;

    @TableField(value = "tag_id")
    private Long tagId;

    @TableField(value = "question_index")
    private Integer questionIndex;

    @TableField(value = "point")
    private Integer point;

    @TableField(value = "create_time")
    private LocalDateTime createTime;

    @TableField(value = "update_time")
    private LocalDateTime updateTime;

    @TableField(value = "del_flag")
    @TableLogic
    private Integer delFlag;

    @TableField(value = "scene_type")
    private Integer sceneType;
}
