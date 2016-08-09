package io.bugtags.networkapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.View;

import io.bugtags.networkapp.R;

public class Retrofit1xActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit1x);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void getHtml(View view) {
        Retrofit1xTest.getHtml();
    }

    public void getJson(View view) {
        Retrofit1xTest.getJson();
    }

    public void getFile(final View view) {
        Retrofit1xTest.getFile(view);
    }

    public void postUrlencode(View view) {
        Retrofit1xTest.postUrlencode();
    }

    public void postMultipart(View view) {
        Retrofit1xTest.postMultipart(Retrofit1xActivity.this);
    }

}
