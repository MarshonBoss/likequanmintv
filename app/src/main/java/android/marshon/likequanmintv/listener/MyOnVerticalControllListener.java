package android.marshon.likequanmintv.listener;

import android.marshon.likequanmintv.controller.LivePlayerHolder;
import android.marshon.likequanmintv.mvp.live.ui.CommonLivePlayerActivity;
import android.marshon.likequanmintv.view.VerticalMediaControllView;

/**
 * Created by ITMarshon.Chen on 2016/11/28.
 * emal:itmarshon@163.com
 * desc:
 */

public class MyOnVerticalControllListener implements VerticalMediaControllView.OnVerticalControllListener {


    private CommonLivePlayerActivity activity;
    private LivePlayerHolder playerHolder;

    public MyOnVerticalControllListener(CommonLivePlayerActivity activity, LivePlayerHolder playerHolder) {
        this.activity = activity;
        this.playerHolder = playerHolder;
    }



    @Override
    public void onVerticalClickPause() {
        if (playerHolder!=null)
            playerHolder.pausePlayer();

    }

    @Override
    public void onVerticalClickStart() {
        if (playerHolder!=null)
            playerHolder.startPlayer();
    }

    @Override
    public void onVerticalClickBack() {
        activity.onBackPressed();
    }

    @Override
    public void onVerticalClickShare() {


    }


}
