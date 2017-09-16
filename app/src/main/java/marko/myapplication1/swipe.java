package marko.myapplication1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;

public abstract class swipe extends AppCompatActivity {
 GestureDetector gestureDetector;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);
         gestureDetector=(new GestureDetector(this,new MyPageListner(this)));
       // this.findViewById(R.id.swipe).setOnClickListener((View.OnClickListener) this);

    }
        // Specify that tabs should be displayed in the action bar.
        @Override
        public boolean onTouchEvent(MotionEvent event) {
            return gestureDetector.onTouchEvent(event);
        }

}

// Since this is an object collection, use a FragmentStatePagerAdapter,
// and NOT a FragmentPagerAdapter.


// Instances of this class are fragments representing a single
// object in our collection.
