package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeBasicInfoNotify {
    public enum HomeBasicInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4607) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public HomeBasicInfo basicInfo = null;
}
