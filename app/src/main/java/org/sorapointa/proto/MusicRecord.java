package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.UgcMusicTrack.*;
import org.sorapointa.proto.UgcMusicTrack;

public class MusicRecord {
    @Tag(tag=3) public List<UgcMusicTrack> musicTrackList = new ArrayList<>();
    @Tag(tag=2) public Integer musicId = null;
}
