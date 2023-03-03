package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MusicGameRecord.*;
import org.sorapointa.proto.MusicGameRecord;
import org.sorapointa.proto.UgcMusicBriefInfo.*;
import org.sorapointa.proto.UgcMusicBriefInfo;

public class MusicGameActivityDetailInfo {
    public static class MapMusicGameRecordMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public MusicGameRecord value = null;
    }

    @Tag(tag=4) public List<UgcMusicBriefInfo> ugcRecordList = new ArrayList<>();
    @Tag(tag=7) public List<UgcMusicBriefInfo> ugcSearchList = new ArrayList<>();
    @Tag(tag=8) public List<MapMusicGameRecordMap> musicGameRecordMap = new ArrayList<>();
}
