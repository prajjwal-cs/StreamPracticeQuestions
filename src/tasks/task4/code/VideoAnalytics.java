package tasks.task4.code;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class VideoAnalytics {
    public HashSet<YouTubeVideo> getTopTenViralVideos(List<YouTubeVideo> videos) {
        return videos.stream().sorted(Comparator.comparing(YouTubeVideo::getNumberOfLikes)
                        .thenComparing(YouTubeVideo::getDurationInMinutes)).limit(10)
                .collect(Collectors.toCollection(HashSet<YouTubeVideo>::new));
    }

    private String detailsOfVideo(YouTubeVideo youTubeVideo) {
        return youTubeVideo.getVideoName().concat(" - ")
                .concat(String.valueOf(youTubeVideo.getNumberOfLikes()))
                .concat(String.valueOf(youTubeVideo.getDurationInMinutes()));
    }

    public List<String> showDetailsOfShortVideos(Set<YouTubeVideo> videos) {
        return videos.stream().filter(e -> e.getDurationInMinutes() <= 10)
                .map(this::detailsOfVideo).toList();
    }
}
