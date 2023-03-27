package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GivingRecordChangeNotify {
    public enum GivingRecordChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=167) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public GivingRecord givingRecord = null;
    @Tag(tag=4) public Boolean isDeactive = null;
}
