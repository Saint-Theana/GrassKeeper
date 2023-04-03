package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BargainSnapshot.*;
import org.sorapointa.proto.BargainSnapshot;

public class BargainStartNotify {
    public enum BargainStartNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=425) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Integer bargainId = null;
    @Tag(tag=2) public BargainSnapshot snapshot = null;
}
