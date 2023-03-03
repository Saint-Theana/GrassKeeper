package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OnlinePlayerInfo.*;
import org.sorapointa.proto.OnlinePlayerInfo;

public class PlayerApplyEnterMpNotify {
    @Tag(tag=5) public Integer srcThreadIndex = null;
    @Tag(tag=6) public Integer srcAppId = null;
    @Tag(tag=2) public OnlinePlayerInfo srcPlayerInfo = null;
}
