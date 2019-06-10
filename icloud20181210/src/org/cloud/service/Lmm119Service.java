/**
 * 
 */
package org.cloud.service;

import java.util.List;
import org.cloud.model.Lmmmtrkg2;

/**
* @author 著者:车健豪
* @createDate 時間を作る:2019年5月24日上午11:53:53
* @version バージョン:1.0
* @Explain 说明:119-一览表示
*/
public interface Lmm119Service {

	/**
	 * 取得したリストデータは全てです
	 * @param lmmmtrkg2 リストに必要な条件を示す
	 * @return
	 */
	public List<Lmmmtrkg2> seleteTransportData(Lmmmtrkg2 lmmmtrkg2);
	
}
