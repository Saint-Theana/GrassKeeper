package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RogueSwitchAvatarRsp {
    public enum RogueSwitchAvatarRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8548) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public List<Long> backstageAvatarGuidList = new ArrayList<>();
    @Tag(tag=13) public List<Long> onstageAvatarGuidList = new ArrayList<>();
    @Tag(tag=12) public Integer cellId = null;
    @Tag(tag=3) public Long curAvatarGuid = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public Integer dungeonId = null;
}
