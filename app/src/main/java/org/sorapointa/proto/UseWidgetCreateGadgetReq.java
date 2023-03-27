package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UseWidgetCreateGadgetReq {
    public enum UseWidgetCreateGadgetReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4300) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=9) public Vector rot = null;
    @Tag(tag=7) public Integer materialId = null;
    @Tag(tag=2) public Vector pos = null;
}
