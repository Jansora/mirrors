package com.jansora.demo.rule.pom;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @description:
 * @author: jansora (zhang.yangyuan)
 * @date: 2024-01-15 11:33:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    /**
     * 项目名称
     */
    String projectName;

    /**
     * 项目完成时间
     */
    Date completedDate;

    /**
     * 项目完成时间
     */
    Color color;

    public enum Color {
        GREEN, BLUE, YELLOW, BLACK, RED,
    }
}
