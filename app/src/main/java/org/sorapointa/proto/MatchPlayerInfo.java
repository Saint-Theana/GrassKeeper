package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MatchPlayerInfo {
    @Tag(tag=11) public Boolean isAgreed = null;
    @Tag(tag=4) public OnlinePlayerInfo playerInfo = null;
}
