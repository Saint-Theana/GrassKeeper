package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ShowCommonTipsNotify {
    public enum ShowCommonTipsNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3048) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public String content = null;
    @Tag(tag=7) public Integer closeTime = null;
    @Tag(tag=8) public String title = null;
}
