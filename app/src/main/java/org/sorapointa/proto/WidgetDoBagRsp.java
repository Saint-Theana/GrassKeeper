package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WidgetDoBagRsp {
    public enum WidgetDoBagRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4258) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Integer materialId = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
