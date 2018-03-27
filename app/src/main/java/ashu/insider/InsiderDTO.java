package ashu.insider;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by apple on 26/03/18.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties
public class InsiderDTO implements Serializable{
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("groups")
    @Expose
    private List<String> groups = null;
    @SerializedName("list")
    @Expose
    private List<ListDTO> list;

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    public List<ListDTO> getList() {
        return list;
    }
    public void setList(List<ListDTO> list) {
        this.list = list;
    }
}
