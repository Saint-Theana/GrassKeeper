package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeAvatarSummonEventInfo.*;
import org.sorapointa.proto.HomeAvatarSummonEventInfo;

public class HomeAvatarSummonAllEventNotify {
    @Tag(tag=1) public List<HomeAvatarSummonEventInfo> summonEventList = new ArrayList<>();
}
