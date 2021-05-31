package com.sortingvisualizer.sorting.entity;

import javax.persistence.*;

@Entity
@Table(name = "algorithms")
public class Algorithms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer algoId;
    private String algoName;
    private String algoDescription;

    public Integer getAlgoId() {
        return algoId;
    }

    public String getAlgoName() {
        return algoName;
    }

    public String getAlgoDescription() {
        return algoDescription;
    }

    public void setAlgoId(Integer algoId) {
        this.algoId = algoId;
    }

    public void setAlgoName(String algoName) {
        this.algoName = algoName;
    }

    public void setAlgoDescription(String algoDescription) {
        this.algoDescription = algoDescription;
    }

    @Override
    public String toString() {
        return "Algorithms{" +
                "algoId=" + algoId +
                ", algoName='" + algoName + '\'' +
                ", algoDescription='" + algoDescription + '\'' +
                '}';
    }

    public Algorithms(String algoName, String algoDescription) {
        this.algoName = algoName;
        this.algoDescription = algoDescription;
    }
}
