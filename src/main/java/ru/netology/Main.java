package ru.netology;

public class Main {
    public static void main(String[] arg) {
        Post post = new Post();
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.passport = "4444 № 44444444";
        post.phone = "+7 (999)-999-99-99";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
        String birthday = post.birthday.day + "." + post.birthday.month + "." + post.birthday.year;

        System.out.println(post.name+'\n'+post.patronymic+'\n'+post.surname+'\n'+birthday+'\n'+post.subscription);

    }
}