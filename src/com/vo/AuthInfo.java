package com.vo;

import java.util.Date;
import java.util.List;

public class AuthInfo {
	//权限id
    private Integer authId;
    //父id
    private Integer parentId;
    //权限名称
    private String authName;
    //描述
    private String authDesc;
    //权限等级
    private Integer authGrade;
    //权限类别
    private String authType;
    //权限Url
    private String authUrl;
    //权限code
    private String authCode;

    private Integer authOrder;
    //权限状态
    private String authState;
    //创建人
    private Integer createBy;
    //创建时间
    private Date createTime;
    //修改人
    private Integer updateBy;
    //修改时间
    private Date updateTime;
    
    
    private List<AuthInfo> childList;

    public List<AuthInfo> getChildList() {
		return childList;
	}
	public void setChildList(List<AuthInfo> childList) {
		this.childList = childList;
	}
	

	public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName == null ? null : authName.trim();
    }

    public String getAuthDesc() {
        return authDesc;
    }

    public void setAuthDesc(String authDesc) {
        this.authDesc = authDesc == null ? null : authDesc.trim();
    }

    public Integer getAuthGrade() {
        return authGrade;
    }

    public void setAuthGrade(Integer authGrade) {
        this.authGrade = authGrade;
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType == null ? null : authType.trim();
    }

    public String getAuthUrl() {
        return authUrl;
    }

    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl == null ? null : authUrl.trim();
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode == null ? null : authCode.trim();
    }

    public Integer getAuthOrder() {
        return authOrder;
    }

    public void setAuthOrder(Integer authOrder) {
        this.authOrder = authOrder;
    }

    public String getAuthState() {
        return authState;
    }

    public void setAuthState(String authState) {
        this.authState = authState == null ? null : authState.trim();
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
	@Override
	public String toString() {
		return "AuthInfo [authId=" + authId + ", parentId=" + parentId + ", authName=" + authName + ", authDesc="
				+ authDesc + ", authGrade=" + authGrade + ", authType=" + authType + ", authUrl=" + authUrl
				+ ", authCode=" + authCode + ", authOrder=" + authOrder + ", authState=" + authState + ", createBy="
				+ createBy + ", createTime=" + createTime + ", updateBy=" + updateBy + ", updateTime=" + updateTime
				+ ", childList=" + childList + "]";
	}
    
}