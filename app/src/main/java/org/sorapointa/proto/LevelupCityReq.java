package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LevelupCityReq {
    public enum LevelupCityReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=295) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=14) public Integer sceneId = null;
    @Tag(tag=8) public Integer itemNum = null;
    @Tag(tag=13) public Integer areaId = null;
}
