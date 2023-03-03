package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OnlinePlayerInfo.*;
import org.sorapointa.proto.OnlinePlayerInfo;

public class PlayerApplyEnterHomeNotify {
    @Tag(tag=9) public OnlinePlayerInfo srcPlayerInfo = null;
    @Tag(tag=10) public Integer srcAppId = null;
}
