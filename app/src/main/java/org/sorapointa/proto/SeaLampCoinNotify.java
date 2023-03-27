package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SeaLampCoinNotify {
    public enum SeaLampCoinNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2197) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Integer seaLampCoin = null;
}
