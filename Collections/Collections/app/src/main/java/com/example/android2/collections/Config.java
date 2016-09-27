package com.example.android2.collections;

import java.util.ArrayList;


public class Config
{
    public final static String[] fNames = {"Petro", "Ivan", "Dmitry", "Sergey"};
    public final static String[] lNames = {"Petrov", "Ivanov", "Sidorov", "Borisov"};
    public final static String[] photos = {"http://s0.tchkcdn.com/g-dwk5y6fDI6ZZg3MdrPsB4A/4/13659/640x480/f/0/86470aebe6ae1c9e7c935e907b92831c_1.jpg",
                                            "http://godzilla.org.ua/uploads/posts/2016-03/1458839736_podborka_vecher_02.jpg",
                                            "http://www.hqwallpapers.ru/wallpapers/animals/delfiny.jpg",
                                            "http://godzilla.org.ua/uploads/posts/2016-03/1458839736_podborka_vecher_02.jpg"};

    public ArrayList getPersonData()
    {
        ArrayList listperson = new ArrayList();
        for(int i = 0; i < fNames.length; i++)
        {
            listperson.add(new Person(photos[i],fNames[i],lNames[i]));
        }
        return listperson;
    }
}
