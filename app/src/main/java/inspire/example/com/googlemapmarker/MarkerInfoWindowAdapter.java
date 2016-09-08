package inspire.example.com.googlemapmarker;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class MarkerInfoWindowAdapter implements GoogleMap.InfoWindowAdapter
{
    public MarkerInfoWindowAdapter()
    {
    }

    @Override
    public View getInfoWindow(Marker marker)
    {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker)
    {
        View v  = getLayoutInflater().inflate(R.layout.infowindow_layout, null);

        MyMarker myMarker = mMarkersHashMap.get(marker);

        ImageView markerIcon = (ImageView) v.findViewById(R.id.marker_icon);

        TextView markerLabel = (TextView)v.findViewById(R.id.marker_label);

        markerIcon.setImageResource(manageMarkerIcon(myMarker.getmIcon()));

        markerLabel.setText(myMarker.getmLabel());

        return v;
    }


}