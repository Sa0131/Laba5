package ru.mirea.lab5;

public class Team {
    private String Name = "team";

    private int Score = 0;

    public int GetScore()
    {
        return Score;
    }

    public void AddScore()
    {
        Score++;
    }

    public void SetName(String name) {
        Name = name;
    }

    public String GetName() {
        return Name;
    }
}
