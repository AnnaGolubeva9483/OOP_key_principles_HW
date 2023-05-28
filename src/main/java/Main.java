public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Петр";
        post.passport = "9999 № 999999";
        post.patronymic = "Степанович";
        post.phone = "+7 (999)-555-55-55";
        post.surname = "Петров";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 11;
        post.birthday.month = 4;
        post.birthday.year = 2000;

    }

}