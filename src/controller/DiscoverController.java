package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.Podcast;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class DiscoverController implements Initializable {

    @FXML
    private HBox recentlyPlayedContainer;

    @FXML
    private HBox popularPodcastContainer;

    List<Podcast> recentlyPlayed;
    List<Podcast> popularPodcast;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        recentlyPlayed = new ArrayList<>(getRecentlyPlayed());
        popularPodcast = new ArrayList<>(getPopularPodcast());

        try {
            for (Podcast podcast : recentlyPlayed) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/view/podcastHbox.fxml"));

                HBox hBox = fxmlLoader.load();
                PodcastHboxController podcastHboxController = fxmlLoader.getController();
                podcastHboxController.setData(podcast);

                recentlyPlayedContainer.getChildren().add(hBox);

            }

            for (Podcast podcast : popularPodcast) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/view/podcastVbox.fxml"));

                VBox vBox = fxmlLoader.load();
                PodcastVboxController podcastVboxController = fxmlLoader.getController();
                podcastVboxController.setData(podcast);

                popularPodcastContainer.getChildren().add(vBox);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<Podcast> getRecentlyPlayed() {

        List<Podcast> ls = new ArrayList<>();

        Podcast podcast = new Podcast();
        podcast.setTitle("Tok Touch Episode 0 - ទំលាប់កែមិនឡើង?");
        podcast.setDescription("តេស្តលេងៗហ្នឹងហារ អ្នកទាំងអស់គ្នាគិតយ៉ាងម៊ិចចំពោះ Podcast សាកល្បងមួយនេះ?");
        podcast.setCover("/image/Podcast_EP-10-web_1.png");
        ls.add(podcast);

        podcast = new Podcast();
        podcast.setTitle("Tok Touch Episode 0 - ទំលាប់កែមិនឡើង?");
        podcast.setDescription("តេស្តលេងៗហ្នឹងហារ អ្នកទាំងអស់គ្នាគិតយ៉ាងម៊ិចចំពោះ Podcast សាកល្បងមួយនេះ?");
        podcast.setCover("/image/Podcast_EP-10-web_1.png");
        ls.add(podcast);

        podcast = new Podcast();
        podcast.setTitle("Tok Touch Episode 0 - ទំលាប់កែមិនឡើង?");
        podcast.setDescription("តេស្តលេងៗហ្នឹងហារ អ្នកទាំងអស់គ្នាគិតយ៉ាងម៊ិចចំពោះ Podcast សាកល្បងមួយនេះ?");
        podcast.setCover("/image/Podcast_EP-10-web_1.png");
        ls.add(podcast);

        podcast = new Podcast();
        podcast.setTitle("Tok Touch Episode 0 - ទំលាប់កែមិនឡើង?");
        podcast.setDescription("តេស្តលេងៗហ្នឹងហារ អ្នកទាំងអស់គ្នាគិតយ៉ាងម៊ិចចំពោះ Podcast សាកល្បងមួយនេះ?");
        podcast.setCover("/image/Podcast_EP-10-web_1.png");
        ls.add(podcast);

        podcast = new Podcast();
        podcast.setTitle("Tok Touch Episode 0 - ទំលាប់កែមិនឡើង?");
        podcast.setDescription("តេស្តលេងៗហ្នឹងហារ អ្នកទាំងអស់គ្នាគិតយ៉ាងម៊ិចចំពោះ Podcast សាកល្បងមួយនេះ?");
        podcast.setCover("/image/Podcast_EP-10-web_1.png");
        ls.add(podcast);

        podcast = new Podcast();
        podcast.setTitle("Tok Touch Episode 0 - ទំលាប់កែមិនឡើង?");
        podcast.setDescription("តេស្តលេងៗហ្នឹងហារ អ្នកទាំងអស់គ្នាគិតយ៉ាងម៊ិចចំពោះ Podcast សាកល្បងមួយនេះ?");
        podcast.setCover("/image/Podcast_EP-10-web_1.png");
        ls.add(podcast);

        return ls;
    }

    private List<Podcast> getPopularPodcast() {

        List<Podcast> ls = new ArrayList<>();

        Podcast podcast = new Podcast();
        podcast.setTitle("Tok Touch Episode 0 - ទំលាប់កែមិនឡើង?");
        podcast.setCover("/image/Podcast_EP-10-web_1.png");
        ls.add(podcast);

        podcast = new Podcast();
        podcast.setTitle("Tok Touch Episode 0 - ទំលាប់កែមិនឡើង?");
        podcast.setCover("/image/Podcast_EP-10-web_1.png");
        ls.add(podcast);

        podcast = new Podcast();
        podcast.setTitle("Tok Touch Episode 0 - ទំលាប់កែមិនឡើង?");
        podcast.setCover("/image/Podcast_EP-10-web_1.png");
        ls.add(podcast);

        podcast = new Podcast();
        podcast.setTitle("Tok Touch Episode 0 - ទំលាប់កែមិនឡើង?");
        podcast.setCover("/image/Podcast_EP-10-web_1.png");
        ls.add(podcast);

        podcast = new Podcast();
        podcast.setTitle("Tok Touch Episode 0 - ទំលាប់កែមិនឡើង?");
        podcast.setCover("/image/Podcast_EP-10-web_1.png");
        ls.add(podcast);

        podcast = new Podcast();
        podcast.setTitle("Tok Touch Episode 0 - ទំលាប់កែមិនឡើង?");
        podcast.setCover("/image/Podcast_EP-10-web_1.png");
        ls.add(podcast);

        return ls;
    }
}
