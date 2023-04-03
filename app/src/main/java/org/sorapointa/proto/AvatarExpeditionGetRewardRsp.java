package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;
import org.sorapointa.proto.AvatarExpeditionInfo.*;
import org.sorapointa.proto.AvatarExpeditionInfo;

public class AvatarExpeditionGetRewardRsp {
    public static class MapExpeditionInfoMap {
        @Tag(tag=1) public Long key = null;
        @Tag(tag=2) public AvatarExpeditionInfo value = null;
    }

    public enum AvatarExpeditionGetRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1659) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public List<ItemParam> extraItemList = new ArrayList<>();
    @Tag(tag=4) public List<MapExpeditionInfoMap> expeditionInfoMap = new ArrayList<>();
    @Tag(tag=14) public List<ItemParam> itemList = new ArrayList<>();
}
