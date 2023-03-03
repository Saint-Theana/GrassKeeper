package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.UgcMusicTrack.*;
import org.sorapointa.proto.UgcMusicTrack;

public class UgcMusicRecord {
    @Tag(tag=4) public List<UgcMusicTrack> musicTrackList = new ArrayList<>();
    @Tag(tag=13) public Integer musicId = null;
}
