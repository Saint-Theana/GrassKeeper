package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.LocationInfo.*;
import org.sorapointa.proto.LocationInfo;
import org.sorapointa.proto.CreatorInfo.*;
import org.sorapointa.proto.CreatorInfo;

public class WidgetDoBagReq {
    public enum WidgetDoBagReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4255) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=12) public Integer materialId = null;
    @Tag(tag=135) public LocationInfo locationInfo = null;
    @Tag(tag=362) public CreatorInfo widgetCreatorInfo = null;
}
