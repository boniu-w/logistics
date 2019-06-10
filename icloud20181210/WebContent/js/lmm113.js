//////////////////////////////////////////////////////////////////////////
// Copyright 2009 NEC Corporation. All Rights Reserved
//////////////////////////////////////////////////////////////////////////

	function openWindow() {
		if (window.name == "") {
			// ウィンドウ名を設定
			// タイムスタンプを使用して一意になる文字列をセットする
			var date = new Date();
			var windowName = date.getYear().toString()
					+ date.getMonth().toString()
					+ date.getDate().toString()
					+ date.getHours().toString()
					+ date.getMinutes().toString()
					+ date.getSeconds().toString()
					+ date.getMilliseconds().toString();

			// 現在のページを表示対象にする
			var url = self.location.href;

			// ウィンドウのパラメータを指定
			// 幅や高さ，アドレスバーの有無等を指定する
			var status = "width=1280, height=1024, menubar=no, toolbar=no,"
					+ "location=no, scrollbars=no, status=yes, resizable=yes";

			// パラメータをセットして新しいウィンドウを起動する
			window.opener = window.open(url, windowName, status);

			// 親ウィンドウを閉じる
			window.open('about:blank', '_self').close();;
		}
	}
	window.onload = openWindow;