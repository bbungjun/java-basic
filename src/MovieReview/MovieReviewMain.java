package MovieReview;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한루프 ! " ;

        System.out.println(inception.title + inception.review);

        MovieReview abouttime = new MovieReview();
        abouttime.title = "어바웃 타임";
        abouttime.review = "인생 시간 영화 ! ";

        System.out.println(abouttime.title + abouttime.review);

    }
}
