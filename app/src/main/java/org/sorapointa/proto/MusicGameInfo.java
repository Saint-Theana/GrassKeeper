package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MusicBriefInfo.*;
import org.sorapointa.proto.MusicBriefInfo;
import org.sorapointa.proto.MusicGameRecord.*;
import org.sorapointa.proto.MusicGameRecord;

public class MusicGameInfo {
    public static class MapMusicGameRecordMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public MusicGameRecord value = null;
    }

    @Tag(tag=2) public List<MusicBriefInfo> ugcRecordList = new ArrayList<>();
    @Tag(tag=6) public List<MusicBriefInfo> ugcSearchList = new ArrayList<>();
    @Tag(tag=8) public List<MapMusicGameRecordMap> musicGameRecordMap = new ArrayList<>();
}
