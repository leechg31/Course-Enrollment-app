package com.example.registeration;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class AddRequest extends StringRequest {

    final static private String URL = "http://leechg11.dothome.co.kr/CourseAdd.php";
    private Map<String,String> parameters;

    public AddRequest(String userID, String courseID, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();

        parameters.put("userID", userID);
        parameters.put("courseID", courseID);
    }

    @Override
    public Map<String,String> getParams() throws AuthFailureError {
        return parameters;
    }
}
