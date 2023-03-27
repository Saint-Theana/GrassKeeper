package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetAllH5ActivityInfoReq {
    public enum GetAllH5ActivityInfoReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5695) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

}
