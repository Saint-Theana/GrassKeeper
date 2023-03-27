package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GadgetInteractRsp {
    public enum GadgetInteractRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=855) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Integer interactType = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public Integer gadgetId = null;
    @Tag(tag=2) public Integer gadgetEntityId = null;
    @Tag(tag=6) public Integer opType = null;
}
