package eileen.com.practicovalery;

import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 11 ;
    private GoogleMap mMap;
    private LocationManager manager;
    private Marker me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
    }
}
