package com.example.acer.tallerinterneti019214.Parser;

import com.example.acer.tallerinterneti019214.Model.User;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Acer on 17/04/2018.
 */

public class Json {
    public static List<User> getData(String content) throws JSONException {

        JSONArray jsonArray = new JSONArray(content);
        List<User> userList = new ArrayList<>();

        for (int i = 0; i < jsonArray.length(); i++){

            JSONObject item = jsonArray.getJSONObject(i);

            User user = new User();
            user.setCodigo(item.getString("codigo"));
            user.setNombre(item.getString("nombre"));
            user.setEdad(item.getString("edad"));
            user.setPass(item.getString("pass"));
            user.setCorreo(item.getString("correo"));

            userList.add(user);

        }

        return userList;
    }
}
