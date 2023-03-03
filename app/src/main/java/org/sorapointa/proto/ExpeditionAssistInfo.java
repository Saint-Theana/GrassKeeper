package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ExpeditionAssistInfo {
    @Tag(tag=14) public String onlineId = null;
    @Tag(tag=1) public Integer assistTime = null;
    @Tag(tag=6) public Integer costumeId = null;
    @Tag(tag=4) public String targetNickName = null;
    @Tag(tag=12) public Integer avatarId = null;
}
