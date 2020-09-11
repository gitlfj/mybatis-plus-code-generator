package com.lfj.entity;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

/**
 * <p>
 * 档案信息表
 * </p>
 *
 * @author lfj
 * @since 2020-09-11
 */
public class ArchivesInfo + "Entity" implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id_")
  private String id;

    /**
     * 题名
     */
    @TableField(value = "title_")
    private String title;

    /**
     * 文号
     */
    @TableField(value = "document_code_")
    private String documentCode;

    /**
     * 关联文号
     */
    @TableField(value = "relation_document_code_")
    private String relationDocumentCode;

    /**
     * 件号
     */
    @TableField(value = "part_code_")
    private String partCode;

    /**
     * 文件年度
     */
    @TableField(value = "part_year_")
    private Integer partYear;

    /**
     * 档案关键字
     */
    @TableField(value = "archives_key_words_")
    private String archivesKeyWords;

    /**
     * 页数
     */
    @TableField(value = "page_number_")
    private Integer pageNumber;

    /**
     * 档案类型
     */
    @TableField(value = "archives_type_")
    private String archivesType;

    /**
     * 主办部门
     */
    @TableField(value = "host_department_")
    private String hostDepartment;

    /**
     * 所属类目id
     */
    @TableField(value = "belong_catalog_id_")
    private String belongCatalogId;

    /**
     * 所属类目名称
     */
    @TableField(value = "belong_catalog_name_")
    private String belongCatalogName;

    /**
     * 保管期限
     */
    @TableField(value = "storage_period_")
    private String storagePeriod;

    /**
     * 档案密级
     */
    @TableField(value = "level_")
    private String level;

    /**
     * 签发日期
     */
    @TableField(value = "issue_time_")
    private LocalDateTime issueTime;

    /**
     * 责任者姓名
     */
    @TableField(value = "responsible_name_")
    private String responsibleName;

    /**
     * 发文日期
     */
    @TableField(value = "send_time_")
    private LocalDateTime sendTime;

    /**
     * 档案附件
     */
    @TableField(value = "files_")
    private String files;

    /**
     * 可查看人
     */
    @TableField(value = "look_users_")
    private String lookUsers;

    /**
     * 档案来源
     */
    @TableField(value = "source_")
    private String source;

    /**
     * 归档状态, 1已归档/0未归档
     */
    @TableField(value = "archives_status_")
    private Integer archivesStatus;

    /**
     * 销毁者id
     */
    @TableField(value = "destroy_user_id_")
    private String destroyUserId;

    /**
     * 销毁者姓名
     */
    @TableField(value = "destroy_user_name_")
    private String destroyUserName;

    /**
     * 销毁时间
     */
    @TableField(value = "destroy_time_")
    private LocalDateTime destroyTime;

    /**
     * 是否删除，1表示true，0表示false
     */
    @TableField(value = "is_delete_")
    private Boolean isDelete;

    /**
     * 是否销毁，1 true， 0 false
     */
    @TableField(value = "is_destroy_")
    private Boolean isDestroy;

    /**
     * 创建时间
     */
    @TableField(value = "create_time_")
    private LocalDateTime createTime;

    /**
     * 创建人id
     */
    @TableField(value = "create_user_id_")
    private String createUserId;

    /**
     * 最后修改人
     */
    @TableField(value = "last_update_user_id_")
    private String lastUpdateUserId;

    /**
     * 最后修改时间
     */
    @TableField(value = "last_update_time_")
    private LocalDateTime lastUpdateTime;

    /**
     * 备注
     */
    @TableField(value = "remark_")
    private String remark;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDocumentCode() {
        return documentCode;
    }

    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }

    public String getRelationDocumentCode() {
        return relationDocumentCode;
    }

    public void setRelationDocumentCode(String relationDocumentCode) {
        this.relationDocumentCode = relationDocumentCode;
    }

    public String getPartCode() {
        return partCode;
    }

    public void setPartCode(String partCode) {
        this.partCode = partCode;
    }

    public Integer getPartYear() {
        return partYear;
    }

    public void setPartYear(Integer partYear) {
        this.partYear = partYear;
    }

    public String getArchivesKeyWords() {
        return archivesKeyWords;
    }

    public void setArchivesKeyWords(String archivesKeyWords) {
        this.archivesKeyWords = archivesKeyWords;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getArchivesType() {
        return archivesType;
    }

    public void setArchivesType(String archivesType) {
        this.archivesType = archivesType;
    }

    public String getHostDepartment() {
        return hostDepartment;
    }

    public void setHostDepartment(String hostDepartment) {
        this.hostDepartment = hostDepartment;
    }

    public String getBelongCatalogId() {
        return belongCatalogId;
    }

    public void setBelongCatalogId(String belongCatalogId) {
        this.belongCatalogId = belongCatalogId;
    }

    public String getBelongCatalogName() {
        return belongCatalogName;
    }

    public void setBelongCatalogName(String belongCatalogName) {
        this.belongCatalogName = belongCatalogName;
    }

    public String getStoragePeriod() {
        return storagePeriod;
    }

    public void setStoragePeriod(String storagePeriod) {
        this.storagePeriod = storagePeriod;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public LocalDateTime getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(LocalDateTime issueTime) {
        this.issueTime = issueTime;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public LocalDateTime getSendTime() {
        return sendTime;
    }

    public void setSendTime(LocalDateTime sendTime) {
        this.sendTime = sendTime;
    }

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files;
    }

    public String getLookUsers() {
        return lookUsers;
    }

    public void setLookUsers(String lookUsers) {
        this.lookUsers = lookUsers;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getArchivesStatus() {
        return archivesStatus;
    }

    public void setArchivesStatus(Integer archivesStatus) {
        this.archivesStatus = archivesStatus;
    }

    public String getDestroyUserId() {
        return destroyUserId;
    }

    public void setDestroyUserId(String destroyUserId) {
        this.destroyUserId = destroyUserId;
    }

    public String getDestroyUserName() {
        return destroyUserName;
    }

    public void setDestroyUserName(String destroyUserName) {
        this.destroyUserName = destroyUserName;
    }

    public LocalDateTime getDestroyTime() {
        return destroyTime;
    }

    public void setDestroyTime(LocalDateTime destroyTime) {
        this.destroyTime = destroyTime;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Boolean getDestroy() {
        return isDestroy;
    }

    public void setDestroy(Boolean isDestroy) {
        this.isDestroy = isDestroy;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    public LocalDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "ArchivesInfo{" +
        "id=" + id +
        ", title=" + title +
        ", documentCode=" + documentCode +
        ", relationDocumentCode=" + relationDocumentCode +
        ", partCode=" + partCode +
        ", partYear=" + partYear +
        ", archivesKeyWords=" + archivesKeyWords +
        ", pageNumber=" + pageNumber +
        ", archivesType=" + archivesType +
        ", hostDepartment=" + hostDepartment +
        ", belongCatalogId=" + belongCatalogId +
        ", belongCatalogName=" + belongCatalogName +
        ", storagePeriod=" + storagePeriod +
        ", level=" + level +
        ", issueTime=" + issueTime +
        ", responsibleName=" + responsibleName +
        ", sendTime=" + sendTime +
        ", files=" + files +
        ", lookUsers=" + lookUsers +
        ", source=" + source +
        ", archivesStatus=" + archivesStatus +
        ", destroyUserId=" + destroyUserId +
        ", destroyUserName=" + destroyUserName +
        ", destroyTime=" + destroyTime +
        ", isDelete=" + isDelete +
        ", isDestroy=" + isDestroy +
        ", createTime=" + createTime +
        ", createUserId=" + createUserId +
        ", lastUpdateUserId=" + lastUpdateUserId +
        ", lastUpdateTime=" + lastUpdateTime +
        ", remark=" + remark +
        "}";
    }
}
