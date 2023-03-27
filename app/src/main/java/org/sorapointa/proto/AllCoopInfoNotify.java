package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AllCoopInfoNotify {
    public enum AllCoopInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1988) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public List<MainCoop> mainCoopList = new ArrayList<>();
}
