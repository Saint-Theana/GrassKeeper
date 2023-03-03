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

    @Tag(tag=3) public List<Integer> openExpeditionList = new ArrayList<>();
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public Integer expeditionCountLimit = null;
    @Tag(tag=4) public List<MapExpeditionInfoMap> expeditionInfoMap = new ArrayList<>();
}
