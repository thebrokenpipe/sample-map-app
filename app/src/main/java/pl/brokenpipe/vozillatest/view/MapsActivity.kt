package pl.brokenpipe.vozillatest.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.crashlytics.android.Crashlytics
import com.google.android.gms.maps.SupportMapFragment
import kotlinx.android.synthetic.main.activity_maps.*
import pl.brokenpipe.vozillatest.R
import pl.brokenpipe.vozillatest.platform.VozillaApplication
import pl.brokenpipe.vozillatest.di.component.ActivityComponent
import pl.brokenpipe.vozillatest.di.module.MapsActivityModule
import pl.brokenpipe.vozillatest.arch.mapsearch.MapView
import javax.inject.Inject

class MapsActivity : AppCompatActivity() {

    @Inject
    lateinit var mapView: MapView

    lateinit var activityComponent: ActivityComponent
        private set


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        activityComponent = (application as VozillaApplication).appComponent
                .plus(MapsActivityModule(this))

        activityComponent.inject(this)


        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment

        mapFragment.getMapAsync(mapView)

        // crashtest
        crashButton.setOnClickListener {
            Crashlytics.getInstance().crash()
        }
    }
}
