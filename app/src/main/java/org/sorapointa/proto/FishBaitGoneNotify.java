package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FishBaitGoneNotify {
    public enum FishBaitGoneNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5803) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer uid = null;
}
