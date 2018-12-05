package com.example.king_.itse;

import java.util.UUID;

public class leads {
    private String mId;
    private String mName;
    private String mPrecio;
    private String mTipo;
    private int mImage;

    public leads(String name, String Precio, String Tipo, int image) {
        mId = UUID.randomUUID().toString();
        mName = name;
        mPrecio = Precio;
        mTipo = Tipo;
        mImage = image;
    }

    public String getId() {
        return mId;
    }

    public void setId(String mId) {
        this.mId = mId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getTitle() {
        return mPrecio;
    }

    public void setTitle(String Precio) { this.mPrecio = Precio;
    }

    public String getCompany() {
        return mTipo;
    }

    public void setCompany(String Tipo) {
        this.mTipo = Tipo;
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int mImage) {
        this.mImage = mImage;
    }

    @Override
    public String toString() {
        return "Lead{" +
                "ID='" + mId + '\'' +
                ", Tipo='" + mTipo + '\'' +
                ", Nombre='" + mName + '\'' +
                ", Precio='" + mPrecio + '\'' +
                '}';
    }
}