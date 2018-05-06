package com.example.wonk.glide;

import android.os.Parcel;
import android.os.Parcelable;


public class SpacePhoto implements Parcelable {

    private String mUrl;
    private String mTitle;

    public SpacePhoto(String url, String title) {
        mUrl = url;
        mTitle = title;
    }

    protected SpacePhoto(Parcel in) {
        mUrl = in.readString();
        mTitle = in.readString();
    }

    public static final Creator<SpacePhoto> CREATOR = new Creator<SpacePhoto>() {
        @Override
        public SpacePhoto createFromParcel(Parcel in) {
            return new SpacePhoto(in);
        }

        @Override
        public SpacePhoto[] newArray(int size) {
            return new SpacePhoto[size];
        }
    };

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public static SpacePhoto[] getSpacePhotos() {

        return new SpacePhoto[]{
                new SpacePhoto("http://kvant.space/sites/default/files/images/6631716.jpg", "1"),
                new SpacePhoto("http://kvant.space/sites/default/files/images/1394651769_nasa-kosmos-galaktika-zvezdy.jpg", "2e"),
                new SpacePhoto("http://kvant.space/sites/default/files/images/321977-sepik.jpg", "3"),
                new SpacePhoto("http://kvant.space/sites/default/files/images/kosmos18.jpg", "4"),
                new SpacePhoto("http://kvant.space/sites/default/files/images/kosmos-fantastika-mirozdanie.jpg", "5"),
                new SpacePhoto("http://kvant.space/sites/default/files/images/luxfon.com_21682.jpg", "6"),
                new SpacePhoto("http://kvant.space/sites/default/files/images/space.jpg", "7"),
                new SpacePhoto("http://kvant.space/sites/default/files/images/space_001.jpg", "8"),
                new SpacePhoto("http://kvant.space/sites/default/files/images/space_asteroid_flying_in_space_041406_.jpg", "9"),
                new SpacePhoto("http://kvant.space/sites/default/files/images/the-new-ipad.jpg", "10"),
                new SpacePhoto("http://kvant.space/sites/default/files/images/zemlja-i-luna-so-storony-space-photos.jpg", "11"),
                new SpacePhoto("http://kvant.space/sites/default/files/images/0dd0b753c65f8898e391c72817c.jpg", "12"),
                new SpacePhoto("http://kvant.space/sites/default/files/images/51980_original.jpg", "13"),
                new SpacePhoto("http://kvant.space/sites/default/files/images/51982_original.jpg", "14"),
                new SpacePhoto("http://kvant.space/sites/default/files/images/1316611660_nevseoboi.com_.uahubble_1.jpg", "15"),
                new SpacePhoto("http://kvant.space/sites/default/files/images/1316611661_nevseoboi.com_.uahubble_8.jpg", "16"),
                new SpacePhoto("http://kvant.space/sites/default/files/images/1360945229_1-103.jpg", "17"),
                new SpacePhoto("http://kvant.space/sites/default/files/images/artleo.com-45222_0.jpg", "18"),
                new SpacePhoto("http://kvant.space/sites/default/files/images/carina_nebula_space-wallpaper-1920x1440.jpg", "19"),
                new SpacePhoto("http://kvant.space/sites/default/files/images/space_spiral_space_080593_.jpg", "20"),
                new SpacePhoto("http://kvant.space/sites/default/files/images/telescopes-review-ai.jpg", "21"),
                new SpacePhoto("http://kvant.space/sites/default/files/images/pesochnica-kosmos-krasivye-kartinki-habbl-337368.jpeg", "22"),



        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mUrl);
        parcel.writeString(mTitle);
    }
}