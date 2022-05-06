package org.example;

import io.dapr.client.DaprClientBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        try(var client = new DaprClientBuilder().build()){
            System.out.println("worked");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}