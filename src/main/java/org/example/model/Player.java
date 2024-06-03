package org.example.model;

import java.time.LocalDate;
import java.util.Objects;


public class Player {
    private Long ID;
    private LocalDate localDate;
    private String firstName;

    public Player(Long ID, String firstName, LocalDate localDate) {
        this.ID = ID;
        this.firstName = firstName;
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "Player{" +
                "ID=" + ID +
                ", localDate=" + localDate +
                ", firstName='" + firstName + '\'' +
                '}';
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(ID, player.ID) && Objects.equals(localDate, player.localDate) && Objects.equals(firstName, player.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, localDate, firstName);
    }
}
