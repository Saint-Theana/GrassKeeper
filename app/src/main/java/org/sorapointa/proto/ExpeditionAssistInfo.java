package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ExpeditionAssistInfo {
    @Tag(tag=4) public Integer assistTime = null;
    @Tag(tag=11) public Integer avatarId = null;
    @Tag(tag=9) public String targetNickName = null;
    @Tag(tag=15) public Integer costumeId = null;
    @Tag(tag=13) public String onlineId = null;
}
