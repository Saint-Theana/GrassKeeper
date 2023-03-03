package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AvatarExpeditionInfo.*;
import org.sorapointa.proto.AvatarExpeditionInfo;

public class AvatarExpeditionStartRsp {
    public static class MapExpeditionInfoMap {
        @Tag(tag=1) public Long key = null;
        @Tag(tag=2) public AvatarExpeditionInfo value = null;
    }

    @Tag(tag=2) public List<MapExpeditionInfoMap> expeditionInfoMap = new ArrayList<>();
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
