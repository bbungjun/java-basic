package MovieReview;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview [] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한루프";
        reviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "시간에 관한 멜로 영화 ";
        reviews[1] = aboutTime;

        for (int i = 0 ; i < reviews.length; i ++ ){


            MovieReview s = reviews[i];
        System.out.println(" 제목은 =  " +  s.title+ " 리뷰 = " + s.review);



    }
}
}
