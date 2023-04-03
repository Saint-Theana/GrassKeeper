package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WIDGET_EXTRA_CD_TYPE.*;
import org.sorapointa.proto.WIDGET_EXTRA_CD_TYPE;

public class WidgetUpdateExtraCDReq {
    public enum WidgetUpdateExtraCDReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5973) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=9) public Integer extraCdType = null;
    @Tag(tag=11) public Integer materialId = null;
    @Tag(tag=7) public Integer cdGroup = null;
}
