package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerDeathZoneNotify {
    public enum IGJOFKIKAAG {
        @Tag(tag=0) None ,
        @Tag(tag=6296) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Integer curDeathZoneId = null;
}
