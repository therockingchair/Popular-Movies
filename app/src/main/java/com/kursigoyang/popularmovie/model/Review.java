package com.kursigoyang.popularmovie.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Fajar Rianda on 06/07/2017.
 */
public class Review implements Parcelable {

  @SerializedName("id") private String id;
  @SerializedName("author") private String author;
  @SerializedName("content") private String content;
  @SerializedName("url") private String url;

  protected Review(Parcel in) {
    id = in.readString();
    author = in.readString();
    content = in.readString();
    url = in.readString();
  }

  public static final Creator<Review> CREATOR = new Creator<Review>() {
    @Override public Review createFromParcel(Parcel in) {
      return new Review(in);
    }

    @Override public Review[] newArray(int size) {
      return new Review[size];
    }
  };

  @Override public int describeContents() {
    return 0;
  }

  @Override public void writeToParcel(Parcel parcel, int i) {
    parcel.writeString(id);
    parcel.writeString(author);
    parcel.writeString(content);
    parcel.writeString(url);
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
