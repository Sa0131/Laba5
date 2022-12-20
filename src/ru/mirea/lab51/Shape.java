package ru.mirea.lab51;

import javax.swing.*;
import java.awt.*;

public class Shape {
    private int X = 0;

    private  int y = 0;

    private float width = 10;

    private  float height = 10;

    private Color color = new Color(38, 171, 93);

    public void SetY(int y)
    {
        this.y = y;
    }

    public void SetX(int x)
    {
        X = x;
    }

    public int GetY()
    {
        return y;
    }

    public int GetX()
    {
        return X;
    }

    public void SetColor(int r, int g, int b)
    {
        this.color = new Color(r,g,b);
    }

    public Color GetColor()
    {
        return color;
    }

    public void SetWidth(float width)
    {
        this.width = width;
    }

    public void SetHeight(float height)
    {
        this.height = height;
    }

    public float GetHeight()
    {
        return height;
    }

    public float GetWidth()
    {
        return width;
    }
}
