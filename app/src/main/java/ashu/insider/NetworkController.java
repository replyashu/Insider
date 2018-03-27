package ashu.insider;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by apple on 28/03/18.
 */

public class NetworkController implements Callback<InsiderDTO>, MainView {

    static final String BASE_URL = Constants.baseUrl;
    Presenter presenter = new Presenter(this);

    public void start() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        NetworkInterface eventAPI = retrofit.create(NetworkInterface.class);

        Call<InsiderDTO> call = eventAPI.getListOfEvents();
        call.enqueue(this);

    }

    @Override
    public void onResponse(Call<InsiderDTO> call, Response<InsiderDTO> response) {
        if(response.isSuccessful()) {
            Log.d("bhainsss", response.body().toString());
            InsiderDTO eventList = response.body();
            presenter.loadEvents(eventList);
        } else {
            Log.d("bhainsss", response.errorBody().toString());
            System.out.println(response.errorBody());
        }
    }

    @Override
    public void onFailure(Call<InsiderDTO> call, Throwable t) {
        t.printStackTrace();
    }

    @Override
    public void populateEvents(InsiderDTO lists) {

    }
}
