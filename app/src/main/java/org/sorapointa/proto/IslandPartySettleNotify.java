package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GalleryStopReason.*;
import org.sorapointa.proto.GalleryStopReason;
import org.sorapointa.proto.IslandPartyGallerySettleInfo.*;
import org.sorapointa.proto.IslandPartyGallerySettleInfo;
import org.sorapointa.proto.ExhibitionDisplayInfo.*;
import org.sorapointa.proto.ExhibitionDisplayInfo;

public class IslandPartySettleNotify {
    public enum IslandPartySettleNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=22820) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public List<IslandPartyGallerySettleInfo> settleInfoList = new ArrayList<>();
    @Tag(tag=8) public List<ExhibitionDisplayInfo> scoreList = new ArrayList<>();
    @Tag(tag=14) public Boolean isNewRecord = null;
    @Tag(tag=2) public Integer timeRemain = null;
    @Tag(tag=13) public Integer reason = null;
}
