package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChangeWorldToSingleModeReq {
    public enum ChangeWorldToSingleModeReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3171) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

}
