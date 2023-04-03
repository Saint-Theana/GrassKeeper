package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WidgetCoolDownData.*;
import org.sorapointa.proto.WidgetCoolDownData;

public class WidgetUpdateExtraCDRsp {
    public enum WidgetUpdateExtraCDRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5908) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Integer materialId = null;
    @Tag(tag=3) public Integer cdGroup = null;
    @Tag(tag=6) public WidgetCoolDownData coolData = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public Integer extraCdType = null;
}
