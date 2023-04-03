package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FleurFairMusicRecord.*;
import org.sorapointa.proto.FleurFairMusicRecord;

public class MusicInfo {
    public static class MapMusicRecordMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public FleurFairMusicRecord value = null;
    }

    @Tag(tag=9) public List<MapMusicRecordMap> musicRecordMap = new ArrayList<>();
}
