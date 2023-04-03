package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MistTrialBestAvatar.*;
import org.sorapointa.proto.MistTrialBestAvatar;

public class MistTrialSettleNotify {
    public static class MapExhibitionListDataResultMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapExhibitionListDataRecordMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum MistTrialSettleNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8408) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public MistTrialBestAvatar bestHitAvatar = null;
    @Tag(tag=10) public List<MapExhibitionListDataResultMap> exhibitionListDataResultMap = new ArrayList<>();
    @Tag(tag=5) public List<MistTrialBestAvatar> bestAvatarList = new ArrayList<>();
    @Tag(tag=9) public Integer firstPassTime = null;
    @Tag(tag=14) public Integer dungeonSceneId = null;
    @Tag(tag=11) public List<MapExhibitionListDataRecordMap> exhibitionListDataRecordMap = new ArrayList<>();
}
