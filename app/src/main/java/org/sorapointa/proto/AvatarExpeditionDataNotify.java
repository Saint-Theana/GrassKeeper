package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AvatarExpeditionInfo.*;
import org.sorapointa.proto.AvatarExpeditionInfo;

public class AvatarExpeditionDataNotify {
    public static class MapExpeditionInfoMap {
        @Tag(tag=1) public Long key = null;
        @Tag(tag=2) public AvatarExpeditionInfo value = null;
    }

    @Tag(tag=6) public List<MapExpeditionInfoMap> expeditionInfoMap = new ArrayList<>();
}
