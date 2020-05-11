package model;

public class Score implements Measurable {
    private String personNumber;
    private String id;
    private ScoreType name;
    private Long value;

    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScoreType getName() {
        return name;
    }

    public void setName(ScoreType name) {
        this.name = name;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }
}
