package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LunaRiteHintPointRemoveNotify {
    public enum LunaRiteHintPointRemoveNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8181) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public List<Integer> hintPointIndex = new ArrayList<>();
}
