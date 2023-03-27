package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GivingRecordNotify {
    public enum GivingRecordNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=195) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public List<GivingRecord> givingRecordList = new ArrayList<>();
}
