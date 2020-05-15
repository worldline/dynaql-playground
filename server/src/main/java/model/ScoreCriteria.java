package model;

import org.eclipse.microprofile.graphql.Input;

@Input
public class ScoreCriteria {
    private ScoreType name;
    private Long minValue;

    public ScoreType getName() {
        return name;
    }

    public void setName(ScoreType name) {
        this.name = name;
    }

    public Long getMinValue() {
        return minValue;
    }

    public void setMinValue(Long minValue) {
        this.minValue = minValue;
    }
}
