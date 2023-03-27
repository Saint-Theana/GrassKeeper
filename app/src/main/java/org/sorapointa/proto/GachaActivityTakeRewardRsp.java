package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GachaActivityTakeRewardRsp {
    public static class MapRobotNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum GachaActivityTakeRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8228) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public List<MapRobotNumMap> robotNumMap = new ArrayList<>();
}
