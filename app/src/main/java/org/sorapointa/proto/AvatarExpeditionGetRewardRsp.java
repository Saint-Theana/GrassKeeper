package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AvatarExpeditionInfo.*;
import org.sorapointa.proto.AvatarExpeditionInfo;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class AvatarExpeditionGetRewardRsp {
    public static class MapExpeditionInfoMap {
        @Tag(tag=1) public Long key = null;
        @Tag(tag=2) public AvatarExpeditionInfo value = null;
    }

    @Tag(tag=9) public List<ItemParam> extraItemList = new ArrayList<>();
    @Tag(tag=8) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=12) public List<MapExpeditionInfoMap> expeditionInfoMap = new ArrayList<>();
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
}
