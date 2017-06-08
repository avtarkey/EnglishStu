package bdkj.com.englishstu.view;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import bdkj.com.englishstu.R;
import bdkj.com.englishstu.base.baseView.BaseActivity;
import bdkj.com.englishstu.common.tool.IntentUtil;

public class WelcomeActivity extends BaseActivity {
    private Handler handler = new Handler() {
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    IntentUtil.launcher(mContext, LoginActivity.class);
                    finish();
                    break;
                default:
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        handler.sendEmptyMessageDelayed(1, 1000);
    }

    @Override
    protected int getViewId() {
        return R.layout.activity_welcome;
    }

    @Override
    protected void initViews(Bundle savedInstanceState) {

    }

}
