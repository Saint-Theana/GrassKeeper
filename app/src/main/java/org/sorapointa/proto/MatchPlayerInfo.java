package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OnlinePlayerInfo.*;
import org.sorapointa.proto.OnlinePlayerInfo;

public class MatchPlayerInfo {
    @Tag(tag=11) public Boolean isAgreed = null;
    @Tag(tag=4) public OnlinePlayerInfo playerInfo = null;
}
