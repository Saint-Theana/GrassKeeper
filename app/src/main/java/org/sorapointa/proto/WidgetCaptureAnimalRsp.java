package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WidgetCaptureAnimalRsp {
    public enum WidgetCaptureAnimalRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4271) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer materialId = null;
    @Tag(tag=11) public Integer entityId = null;
    @Tag(tag=12) public Vector pos = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
