package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerRTTInfo.*;
import org.sorapointa.proto.PlayerRTTInfo;

public class WorldPlayerRTTNotify {
    @Tag(tag=1) public List<PlayerRTTInfo> playerRttList = new ArrayList<>();
}
