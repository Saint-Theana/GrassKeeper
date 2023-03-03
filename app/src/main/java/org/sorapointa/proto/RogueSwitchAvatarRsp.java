package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RogueSwitchAvatarRsp {
    @Tag(tag=4) public Long curAvatarGuid = null;
    @Tag(tag=8) public List<Long> backstageAvatarGuidList = new ArrayList<>();
    @Tag(tag=14) public Integer dungeonId = null;
    @Tag(tag=3) public Integer cellId = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public List<Long> onstageAvatarGuidList = new ArrayList<>();
}
