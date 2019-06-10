package org.cloud.dto;

import java.util.Date;

/**
* @author 作者：张世尧
* @createDate 创建时间：2019年5月28日下午8:59:31
* @version 版本：
* @Explain 说明：
* @tel 电话：
*/
public class Lmm107DtoGrl {
		//検索範囲
		private Integer searchScope_Rdo;
		
		//申請組織コード
		private String appOrgCode_Txt;
		
		//イベント集計コード
		private String evtmrgcod_Txt;
		
		//イベント集計名称
		private String evtmrgnam_Txt;

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

		public String getEvtmrgcod_Txt() {
			return evtmrgcod_Txt;
		}

		public void setEvtmrgcod_Txt(String evtmrgcod_Txt) {
			this.evtmrgcod_Txt = evtmrgcod_Txt;
		}

		public String getEvtmrgnam_Txt() {
			return evtmrgnam_Txt;
		}

		public void setEvtmrgnam_Txt(String evtmrgnam_Txt) {
			this.evtmrgnam_Txt = evtmrgnam_Txt;
		}

		public String getOrgItmName_Txt() {
			// TODO Auto-generated method stub
			return null;
		}
		
		
}
