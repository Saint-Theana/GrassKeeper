package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuickUseWidgetReq {
    public enum QuickUseWidgetReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4275) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1542) public LocationInfo locationInfo = null;
    @Tag(tag=1754) public CameraInfo cameraInfo = null;
    @Tag(tag=825) public CreatorInfo creatorInfo = null;
    @Tag(tag=1365) public ThunderBirdFeatherInfo thunderBirdFeatherInfo = null;
}
