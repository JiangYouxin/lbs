package tscolari.mobile_sample;

import android.content.Context;
import android.telephony.TelephonyManager;

public class JsInterface {
    private Context context;
    public JsInterface(Context context) {
        this.context = context;
    }
    public String getImei() {
        TelephonyManager tm = (TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);
        return tm.getDeviceId();
    }
}
