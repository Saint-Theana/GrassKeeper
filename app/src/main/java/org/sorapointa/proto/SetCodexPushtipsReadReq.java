package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetCodexPushtipsReadReq {
    public enum SetCodexPushtipsReadReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4204) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public Integer typeId = null;
    @Tag(tag=2) public Integer codexId = null;
}
