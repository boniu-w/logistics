package org.cloud.dto;

import java.util.Date;

/**    

*  @author :ZPH

*  @date 2019年5月23日 

*  @parameter:

*  @Explain 说明:    組織別商品マスタ						 

*/
public class Lmm111DtoTo {
	
	//検索範囲
	private Integer searchScope_Rdo;
	
	//申請組織コード
	private String appOrgCode_Txt;
	
	//組織コード
	private String orgCode_Txt;
	
	//組織別商品コード
	private String orgItmCode_Txt;
	
	//組織別商品名
	private String orgItmName_Txt;

	public Integer getSearchScope_Rdo() {
		return searchScope_Rdo;
	}

	public void setSearchScope_Rdo(Integer searchScope_Rdo) {
		this.searchScope_Rdo = searchScope_Rdo;
	}

	public String getAppOrgCode_Txt() {
		return appOrgCode_Txt;
	}

	public void setAppOrgCode_Txt(String appOrgCode_Txt) {
		this.appOrgCode_Txt = appOrgCode_Txt;
	}

	public String getOrgCode_Txt() {
		return orgCode_Txt;
	}

	public void setOrgCode_Txt(String orgCode_Txt) {
		this.orgCode_Txt = orgCode_Txt;
	}

	public String getOrgItmCode_Txt() {
		return orgItmCode_Txt;
	}

	public void setOrgItmCode_Txt(String orgItmCode_Txt) {
		this.orgItmCode_Txt = orgItmCode_Txt;
	}

	public String getOrgItmName_Txt() {
		return orgItmName_Txt;
	}

	public void setOrgItmName_Txt(String orgItmName_Txt) {
		this.orgItmName_Txt = orgItmName_Txt;
	}
	
	

}

