package ashu.insider;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by apple on 28/03/18.
 */

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonIgnoreProperties
public class ListDTO implements Serializable {
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("min_show_start_time")
    @Expose
    private Integer minShowStartTime;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("horizontal_cover_image")
    @Expose
    private String horizontalCoverImage;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("venue_id")
    @Expose
    private String venueId;
    @SerializedName("venue_name")
    @Expose
    private String venueName;
    @SerializedName("venue_date_string")
    @Expose
    private String venueDateString;
    @SerializedName("is_rsvp")
    @Expose
    private Boolean isRsvp;
    @SerializedName("event_state")
    @Expose
    private String eventState;
    @SerializedName("price_display_string")
    @Expose
    private String priceDisplayString;
    @SerializedName("model")
    @Expose
    private String model;
    @SerializedName("applicable_filters")
    @Expose
    private List<String> applicableFilters = null;
    @SerializedName("min_price")
    @Expose
    private Integer minPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getMinShowStartTime() {
        return minShowStartTime;
    }

    public void setMinShowStartTime(Integer minShowStartTime) {
        this.minShowStartTime = minShowStartTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getHorizontalCoverImage() {
        return horizontalCoverImage;
    }

    public void setHorizontalCoverImage(String horizontalCoverImage) {
        this.horizontalCoverImage = horizontalCoverImage;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getVenueId() {
        return venueId;
    }

    public void setVenueId(String venueId) {
        this.venueId = venueId;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getVenueDateString() {
        return venueDateString;
    }

    public void setVenueDateString(String venueDateString) {
        this.venueDateString = venueDateString;
    }

    public Boolean getRsvp() {
        return isRsvp;
    }

    public void setRsvp(Boolean rsvp) {
        isRsvp = rsvp;
    }

    public String getEventState() {
        return eventState;
    }

    public void setEventState(String eventState) {
        this.eventState = eventState;
    }

    public String getPriceDisplayString() {
        return priceDisplayString;
    }

    public void setPriceDisplayString(String priceDisplayString) {
        this.priceDisplayString = priceDisplayString;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<String> getApplicableFilters() {
        return applicableFilters;
    }

    public void setApplicableFilters(List<String> applicableFilters) {
        this.applicableFilters = applicableFilters;
    }

    public Integer getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }
}
