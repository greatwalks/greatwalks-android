package doc.greatwalks;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class GreatWalks extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_great_walks);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_great_walks, menu);
        return true;
    }
}
