package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetUpLunchBoxWidgetRsp {
    public enum SetUpLunchBoxWidgetRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4266) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public LunchBoxData lunchBoxData = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
