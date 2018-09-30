package br.com.mtusjt.ciclodevida;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import br.com.mtusjt.ciclodevida.ActivityA;
import br.com.mtusjt.ciclodevida.ActivityC;
import br.com.mtusjt.ciclodevida.DialogActivity;
import br.com.mtusjt.ciclodevida.R;
import br.com.mtusjt.ciclodevida.StatusTracker;
import br.com.mtusjt.ciclodevida.Utils;
/*
@author Marcelo Victor da silva
@ra 816119006
*/
public class ActivityB extends Activity {

    private String mActivityName;
    private TextView mStatusView;
    private TextView mStatusAllView;
    private StatusTracker mStatusTracker = StatusTracker.getInstance();

    /*
    @author Marcelo Victor da silva
@ra 816119006
    */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        mActivityName = getString(R.string.activity_b_label);
        mStatusView = (TextView) findViewById(R.id.status_view_b);
        mStatusAllView = (TextView) findViewById(R.id.status_view_all_b);
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_create));
        Utils.printStatus(mStatusView, mStatusAllView);
    }

    /*
   @author Marcelo Victor da silva
@ra 816119006
    */
    @Override
    protected void onStart() {
        super.onStart();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_start));
        Utils.printStatus(mStatusView, mStatusAllView);
    }

    /*
    @author Marcelo Victor da silva
@ra 816119006
    */
    @Override
    protected void onRestart() {
        super.onRestart();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_restart));
        Utils.printStatus(mStatusView, mStatusAllView);
    }

    /*
    @author Marcelo Victor da silva
@ra 816119006
    */
    @Override
    protected void onResume() {
        super.onResume();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_resume));
        Utils.printStatus(mStatusView, mStatusAllView);
    }

    /*
    @author Marcelo Victor da silva
@ra 816119006

    */
    @Override
    protected void onPause() {
        super.onPause();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_pause));
        Utils.printStatus(mStatusView, mStatusAllView);
    }

    /*
  @author Marcelo Victor da silva
@ra 816119006
    */
    @Override
    protected void onStop() {
        super.onStop();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_stop));
    }

    /*
  @author Marcelo Victor da silva
@ra 816119006
    */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_destroy));
        mStatusTracker.clear();
    }

    /*
   @author Marcelo Victor da silva
@ra 816119006
    */
    public void startDialog(View v) {
        Intent intent = new Intent(ActivityB.this, DialogActivity.class);
        startActivity(intent);
    }

    /*
  @author Marcelo Victor da silva
@ra 816119006
    */
    public void startActivityA(View v) {
        Intent intent = new Intent(ActivityB.this, ActivityA.class);
        startActivity(intent);
    }

    /*
  @author Marcelo Victor da silva
@ra 816119006
    */
    public void startActivityC(View v) {
        Intent intent = new Intent(ActivityB.this, ActivityC.class);
        startActivity(intent);
    }

    /*
@author Marcelo Victor da silva
@ra 816119006
    */
    public void finishActivityB(View v) {
        ActivityB.this.finish();
    }

}
