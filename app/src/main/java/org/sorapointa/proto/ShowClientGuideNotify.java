package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ShowClientGuideNotify {
    public enum ShowClientGuideNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3054) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public String guideName = null;
}
