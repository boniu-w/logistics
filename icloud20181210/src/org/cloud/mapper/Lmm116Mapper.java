package org.cloud.mapper;

import java.util.List;

import org.cloud.model.Lmmmgrl;


/**
 * 
* @author: 王卫兵 
* @date: 2019/05/31--15:02:24
* @Description: 
* @version:
 */
public interface Lmm116Mapper {
	/**
	 * 汎用区分のセレクトリスト作成処理
	 * @param lgustntcod  
	 * @author 
	 * @return
	 */
	public List<Lmmmgrl> selectFind(String lgustntcod);
	/**
	 * 汎用マスタの新規処理
	 * @param lmmmgrl
	 * @return
	 */
	public int insert(Lmmmgrl lmmmgrl);
	/**
	 * 二重登録チェック
	 * @param orgCodeVal
	 * @param tntcod
	 */
	public int check(Lmmmgrl lmmmgrl);
	/**
	 * 更新の初期化表示情報の処理 
	 * @param lmmmgrl
	 */

	public Lmmmgrl Pupdate(Lmmmgrl lmmmgrl);
	/**
	 * 汎用マスタの更新処理
	 * @param lmmmgrl
	 * @return
	 */
	public int update(Lmmmgrl lmmmgrl);
}
