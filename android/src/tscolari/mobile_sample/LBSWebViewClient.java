package tscolari.mobile_sample;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LBSWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
