package model.tck;

import org.eclipse.microprofile.graphql.NonNull;

import java.util.List;

public class NestedArraysHolder {
    // [Int]
    private Integer[] int_1;
    // [Int!]
    private List<@NonNull Integer> int_bang_1;
    // [Int]!
    @NonNull
    private List<Integer> int_1_bang;
    // [[Int]]
    private List<List<Integer>> int_1_2;
    // [[[Int]]]
    private List<List<List<Integer>>> int_1_2_3;
    // [[[Int]!]]!
    @NonNull
    private List<List<@NonNull List<Integer>>> int_1_bang_2_3_bang;
    // [[[Int!]!]!]!
    @NonNull
    private List<@NonNull List<@NonNull List<@NonNull Integer>>> int_bang_1_bang_2_bang_3_bang;

    public NestedArraysHolder() {
    }

    public Integer[] getInt_1() {
        return int_1;
    }

    public void setInt_1(Integer[] int_1) {
        this.int_1 = int_1;
    }

    public List<Integer> getInt_bang_1() {
        return int_bang_1;
    }

    public void setInt_bang_1(List<Integer> int_bang_1) {
        this.int_bang_1 = int_bang_1;
    }

    public List<Integer> getInt_1_bang() {
        return int_1_bang;
    }

    public void setInt_1_bang(List<Integer> int_1_bang) {
        this.int_1_bang = int_1_bang;
    }

    public List<List<Integer>> getInt_1_2() {
        return int_1_2;
    }

    public void setInt_1_2(List<List<Integer>> int_1_2) {
        this.int_1_2 = int_1_2;
    }

    public List<List<List<Integer>>> getInt_1_2_3() {
        return int_1_2_3;
    }

    public void setInt_1_2_3(List<List<List<Integer>>> int_1_2_3) {
        this.int_1_2_3 = int_1_2_3;
    }

    public List<List<List<Integer>>> getInt_1_bang_2_3_bang() {
        return int_1_bang_2_3_bang;
    }

    public void setInt_1_bang_2_3_bang(List<List<List<Integer>>> int_1_bang_2_3_bang) {
        this.int_1_bang_2_3_bang = int_1_bang_2_3_bang;
    }

    public List<List<List<Integer>>> getInt_bang_1_bang_2_bang_3_bang() {
        return int_bang_1_bang_2_bang_3_bang;
    }

    public void setInt_bang_1_bang_2_bang_3_bang(List<List<List<Integer>>> int_bang_1_bang_2_bang_3_bang) {
        this.int_bang_1_bang_2_bang_3_bang = int_bang_1_bang_2_bang_3_bang;
    }
}
