package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;
import org.sorapointa.proto.FishEscapeReason.*;
import org.sorapointa.proto.FishEscapeReason;

public class FishEscapeNotify {
    public enum FishEscapeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5835) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Vector pos = null;
    @Tag(tag=15) public Integer uid = null;
    @Tag(tag=5) public List<Integer> fishIdList = new ArrayList<>();
    @Tag(tag=7) public Integer reason = null;
}
