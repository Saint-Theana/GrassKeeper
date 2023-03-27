package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WidgetCaptureAnimalReq {
    public enum WidgetCaptureAnimalReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4273) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public Integer materialId = null;
    @Tag(tag=5) public Vector pos = null;
    @Tag(tag=11) public Integer entityId = null;
}
