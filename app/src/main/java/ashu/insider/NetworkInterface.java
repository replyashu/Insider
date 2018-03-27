package ashu.insider;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by apple on 28/03/18.
 */

public interface NetworkInterface {

    @GET("/home?norm=1&filterBy=go-out&city=bangalore")
    Call<InsiderDTO> getListOfEvents();
}
