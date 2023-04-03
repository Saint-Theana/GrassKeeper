package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AvatarExpeditionInfo.*;
import org.sorapointa.proto.AvatarExpeditionInfo;

public class AvatarExpeditionAllDataRsp {
    public static class MapExpeditionInfoMap {
        @Tag(tag=1) public Long key = null;
        @Tag(tag=2) public AvatarExpeditionInfo value = null;
    }

    public enum AvatarExpeditionAllDataRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1654) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Integer expeditionCountLimit = null;
    @Tag(tag=9) public List<Integer> openExpeditionList = new ArrayList<>();
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public List<MapExpeditionInfoMap> expeditionInfoMap = new ArrayList<>();
}
