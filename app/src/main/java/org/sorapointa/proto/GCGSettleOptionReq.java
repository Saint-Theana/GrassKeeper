package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGSettleOption.*;
import org.sorapointa.proto.GCGSettleOption;

public class GCGSettleOptionReq {
    public enum MFOGKBFIDLO {
        @Tag(tag=0) None ,
        @Tag(tag=7511) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public Integer option = null;
}
