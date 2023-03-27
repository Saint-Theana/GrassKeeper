package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WorldPlayerLocationNotify {
    public enum WorldPlayerLocationNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=283) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public List<PlayerLocationInfo> playerLocList = new ArrayList<>();
    @Tag(tag=3) public List<PlayerWorldLocationInfo> playerWorldLocList = new ArrayList<>();
}
