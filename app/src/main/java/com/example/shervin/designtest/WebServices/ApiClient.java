package com.example.shervin.designtest.WebServices;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {


    public static final String BASE_URL = "https://stable.mohammad.inpin.co/api/";
    private static Retrofit retrofit = null;



    public static Retrofit getClient(){
        if (retrofit == null){

            String strToken = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjZiNDY3NmQwMTY3M2Y3OTRlYTlmNzBiMjY5ZjEwODVhMDM5ODFlOThmZDg4MzA2Nzk1ZTI4NzU5MGNkMTBmMGE2NTIwYjEzZWI1MDYzZTU5In0.eyJhdWQiOiIyIiwianRpIjoiNmI0Njc2ZDAxNjczZjc5NGVhOWY3MGIyNjlmMTA4NWEwMzk4MWU5OGZkODgzMDY3OTVlMjg3NTkwY2QxMGYwYTY1MjBiMTNlYjUwNjNlNTkiLCJpYXQiOjE1MTM4NTMzNjQsIm5iZiI6MTUxMzg1MzM2NCwiZXhwIjoxNTQ1Mzg5MzY0LCJzdWIiOiIyIiwic2NvcGVzIjpbXX0.tmUGUkK-2nQZ-0lYa6iMM7c8SP-npeTmg9FtuO2dEW7dTBY3SkkxzPQJpzv69LQiYcMcjo-8dpTYGT7yUC5QUNuiCIcy3h2Z4FODlbWaIOD4KrPkWFdRtD52qVHz-z5_BQf2GyHTD2U95hS9o7Iepxs37m_YxUq7LLwWKxGGcQ7JXmj3wKUlJKBDnPFRXAObTxmoVqMFl0_ldpW-jmWa66Y7pqZTnSJ2_s9nSOVdNmeFtYckahJFrImAZ_LQmFE-j7nbu98Mdab-tTIBwYwpQ9icc2XovaX9_tMk6KACS2D5Fp8Q13ZZc5xlU1vaJnFqPALyExX2AS3d5fyXWIZMD8xMKPfJ6G2ZQUuFslc8oNaI7fwpY5RL2SHH75Ggk3Jda50B8cQMTz8bE35KCkEkq-GQKWuDBbUqqD9iwaWbKFQlIe-zQu05YO7FoHfBSjfpdV-oNSUUug940uWc97ZG4k0r4FCACBd8e270PV9gN61dcWNADyB2KX_uR1nZVIfbef0pFZuwPmhkiDCUKKyyvXSeydE7KYNyYacWhVsPKWeuX3jEBHEJ1BpFBrF4gG5lMHdhSALcvddGlwKcYArX8EXvLw1twVG6QSwMkn4k_mDRQBRptmWr2AUqX3T8Logl7HZRoM6usaeMk2cVp1GuUInolwrP_RDTqOnYYDoHhDk";


            final String token = "Bearer " + strToken;

            OkHttpClient.Builder httpClient = new OkHttpClient.Builder()
                    .addInterceptor(new Interceptor() {
                        @Override
                        public Response intercept(Chain chain) throws IOException {

                            Request original = chain.request();

                            Request.Builder requestBuilder = original.newBuilder()
                                    .addHeader("Accept", "application/json")
                                    .addHeader("Authorization", token)
                                    .addHeader("Content-Type", "application/json");

                            Request request = requestBuilder.build();

                            return chain.proceed(request);
                        }
                    });

            OkHttpClient client = httpClient.build();

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
        }

        return retrofit;
    }
}
