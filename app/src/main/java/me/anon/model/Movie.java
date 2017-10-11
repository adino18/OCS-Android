//package com.tutorial.sonth.movieapi.model;
//
//import android.os.Parcel;
//import android.os.Parcelable;
//
//import com.google.gson.annotations.SerializedName;
//import com.tutorial.sonth.movieapi.utils.Constant;
//
///**
// * Created by sonth on 12-Feb-17.
// */
//
//public class Movie implements Parcelable{
//    @SerializedName("id")
//    private Long id;
//    @SerializedName("title")
//    private String title;
//    @SerializedName("overview")
//    private String overview;
//    @SerializedName("poster_path")
//    private String posterPath;
//    @SerializedName("backdrop_path")
//    private String backdropPath;
//    @SerializedName("vote_average")
//    private String voteAverage;
//    @SerializedName("release_date")
//    private String releaseDate;
////    @SerializedName("runtime")
////    private int runtime;
//
//    protected Movie(Parcel in) {
//        id = in.readLong();
//        title = in.readString();
//        overview = in.readString();
//        posterPath = in.readString();
//        backdropPath = in.readString();
//        voteAverage = in.readString();
//        releaseDate = in.readString();
////        runtime = in.readInt();
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeLong(id);
//        dest.writeString(title);
//        dest.writeString(overview);
//        dest.writeString(posterPath);
//        dest.writeString(backdropPath);
//        dest.writeString(voteAverage);
//        dest.writeString(releaseDate);
////        dest.writeInt(runtime);
//    }
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
//        @Override
//        public Movie createFromParcel(Parcel in) {
//            return new Movie(in);
//        }
//
//        @Override
//        public Movie[] newArray(int size) {
//            return new Movie[size];
//        }
//    };
//
//    public String getBackdropPath() {
//        return Constant.STATIC_BASE_IMAGE + backdropPath;
//    }
//
//    public String getOverview() {
//        return overview;
//    }
//
//    public String getPosterPath() {
//        return Constant.STATIC_BASE_IMAGE + posterPath;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getVoteAverage() {
//        return voteAverage;
//    }
//
//    public String getReleaseDate() {return releaseDate; }
////    public int getRuntime() {
////        return runtime;
////    }
//
//}
