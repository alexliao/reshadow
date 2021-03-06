package com.biganiseed.reindeer;

import com.biganiseed.reindeer.R;
import android.os.Bundle;
import android.webkit.WebView;

//public class Update extends WithHeaderActivity {
public class Terms extends ReindeerActivity {
	protected WebView webview;
	protected String url;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.re_terms);
        
        webview = (WebView) this.findViewById(R.id.webview);
        url = Const.getRootHttpNoSSL(this)+"/terms_"+(Tools.getLang().equals("zh")? "zh" : "en");
    }

    @Override
    public void onStart(){
    	super.onStart();
        webview.loadUrl(url);
    }

}
