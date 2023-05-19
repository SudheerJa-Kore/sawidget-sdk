package com.kore.widgetsdk;

import static android.view.View.VISIBLE;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.kore.ai.widgetsdk.fragments.BottomPanelFragment;
import com.kore.ai.widgetsdk.listeners.ComposeFooterInterface;
import com.kore.ai.widgetsdk.listeners.WidgetComposeFooterInterface;
import com.kore.ai.widgetsdk.net.SDKConfiguration;

public class MainActivity extends AppCompatActivity implements WidgetComposeFooterInterface {

    private FrameLayout composerView;
    private BottomPanelFragment composerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        attachFragments();
    }

        private void attachFragments() {
            composerView = findViewById(R.id.chatLayoutPanelContainer);
            composerView.setVisibility(VISIBLE);
            composerFragment = new BottomPanelFragment();
            composerFragment.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.chatLayoutPanelContainer, composerFragment).commit();
            composerFragment.setPanelComposeFooterInterface(MainActivity.this, SDKConfiguration.Client.identity);
    }

    @Override
    public void onPanelSendClick(String message, boolean isFromUtterance)
    {
//        BotSocketConnectionManager.getInstance().sendMessage(message, null);
    }

    @Override
    public void onPanelSendClick(String message, String payload, boolean isFromUtterance)
    {
//        if(payload != null){
//            BotSocketConnectionManager.getInstance().sendPayload(message, payload);
//        }else{
//            BotSocketConnectionManager.getInstance().sendMessage(message, payload);
//        }
//
//        toggleQuickRepliesVisiblity();
    }
}