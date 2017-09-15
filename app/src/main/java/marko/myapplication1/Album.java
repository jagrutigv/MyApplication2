package marko.myapplication1;

/**
 * Created by HIREN AMALIYAR on 15-09-2017.
 */

class Album {


    private int thumbnail;

    public Album() {
    }

    public Album(int thumbnail) {

        this.thumbnail = thumbnail;
    }



    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
