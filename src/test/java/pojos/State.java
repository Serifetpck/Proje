package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class State {

    /*
    [
  {
    "country": {

    },
    "id": 0,
    "name": "string"
  }
]
     */
    private Country country;
    private int id;
    private String name;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "State{" +
                "country=" + country +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
