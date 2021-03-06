package com.publiccms.entities.cms;

// Generated 2016-1-19 11:28:06 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;

import com.sanluan.common.source.entity.MyColumn;

/**
 * CmsCategoryModel generated by hbm2java
 */
@Entity
@Table(name = "cms_category_model")
public class CmsCategoryModel implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @MyColumn(title = "ID")
    private Integer id;
    @MyColumn(title = "分类", condition = true)
    private int categoryId;
    @MyColumn(title = "模型", condition = true)
    private int modelId;
    @MyColumn(title = "模板路径")
    private String templatePath;

    public CmsCategoryModel() {
    }

    public CmsCategoryModel(int categoryId, int modelId) {
        this.categoryId = categoryId;
        this.modelId = modelId;
    }

    public CmsCategoryModel(int categoryId, int modelId, String templatePath) {
        this.categoryId = categoryId;
        this.modelId = modelId;
        this.templatePath = templatePath;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "category_id", nullable = false)
    public int getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Column(name = "model_id", nullable = false)
    public int getModelId() {
        return this.modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    @Column(name = "template_path", length = 200)
    public String getTemplatePath() {
        return this.templatePath;
    }

    public void setTemplatePath(String templatePath) {
        this.templatePath = templatePath;
    }

}
