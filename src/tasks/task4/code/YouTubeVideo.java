package tasks.task4.code;

import java.math.BigInteger;
import java.util.Objects;

public class YouTubeVideo {
    private final long videoId;
    private final String videoName;
    private BigInteger numberOfLikes;
    private int durationInMinutes;

    public YouTubeVideo(long videoId, String videoName) {
        this.videoId = videoId;
        this.videoName = videoName;
    }

    public long getVideoId() {
        return videoId;
    }

    public String getVideoName() {
        return videoName;
    }

    public BigInteger getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(BigInteger numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YouTubeVideo that = (YouTubeVideo) o;
        return videoId == that.videoId && durationInMinutes == that.durationInMinutes && Objects.equals(videoName, that.videoName) && Objects.equals(numberOfLikes, that.numberOfLikes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoId, videoName, numberOfLikes, durationInMinutes);
    }

    @Override
    public String toString() {
        return "YouTubeVideo{" +
                "videoId=" + videoId +
                ", videoName='" + videoName + '\'' +
                ", numberOfLikes=" + numberOfLikes +
                ", durationInMinutes=" + durationInMinutes +
                '}';
    }
}
