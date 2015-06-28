package kandros.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {


    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        // creo un array
        String[] forecastArray = {
                "Today - Sunny - 88/63",
                "Torommow - Coudy - 88/63",
                "Day - Rain - 88/63",
                "Day - Rain - 88/63",
                "Day - Rain - 88/63",
                "Day - Rain - 88/63",
                "Day - Coudy - 88/63",
                "Day - Sunny - 88/63",
                "Day - Coudy - 88/63",
                "Day - Rain - 88/63",
                "Day - Coudy - 88/63",
                "Day - Sunny - 88/63",
                "Day - Coudy - 88/63",
                "Day - Rain - 88/63",
                "Day - Coudy - 88/63",
                "Day - Sunny - 88/63",
                "Day - Coudy - 88/63",
                "Day - Rain - 88/63",
                "Day - Coudy - 88/63",
                "Day - Sunny - 88/63",
                "Day - Coudy - 88/63",
                "Day - Rain - 88/63"
        };

        // Creo una lista con gli elementi di un array
        List<String> weekForecast = new ArrayList<String>(
                Arrays.asList(forecastArray) );

        // Creo un adapter che prendere ogni elemento di weekForecast
        // crea una view in base al layout della textView indicata
        // Lo mette dentro il listitem indicato
        // getActivity prende il context dell'applicazione
        ArrayAdapter<String> mForecastAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast);

        // essendo dentro un Fragment uso rootview (che è il root del fragment) per cercare la view
        ListView listView = (ListView) rootView.findViewById(R.id.listView_forecast);
        // Settando l'adapter all lista, a runtime verra popolata
        listView.setAdapter(mForecastAdapter);

        return rootView;
    }
}
