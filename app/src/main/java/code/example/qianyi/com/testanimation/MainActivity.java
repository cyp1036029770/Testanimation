package code.example.qianyi.com.testanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private android.widget.LinearLayout activitymain;
    private ViewStub viewsub;
    private android.widget.Button btn;
    private boolean isLoad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.btn = (Button) findViewById(R.id.btn);
        this.activitymain = (LinearLayout) findViewById(R.id.activity_main);
        this.viewsub = (ViewStub) findViewById(R.id.viewsub);
        SparseArray array=new SparseArray();
        array.append(1,"ssssssssss");
        array.append(2,"ssssssssss");
        array.append(3,"ssssssssss");
        array.append(4,"ssssssssss");
        Log.e("tagggggg",""+array.toString());
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewsub.inflate();
            }
        });
    }
}
