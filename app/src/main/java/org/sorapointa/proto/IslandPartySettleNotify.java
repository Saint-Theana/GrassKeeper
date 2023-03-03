package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ExhibitionDisplayInfo.*;
import org.sorapointa.proto.ExhibitionDisplayInfo;
import org.sorapointa.proto.GalleryStopReason.*;
import org.sorapointa.proto.GalleryStopReason;
import org.sorapointa.proto.IslandPartyGallerySettleInfo.*;
import org.sorapointa.proto.IslandPartyGallerySettleInfo;

public class IslandPartySettleNotify {
    @Tag(tag=13) public Boolean isNewRecord = null;
    @Tag(tag=1) public Integer reason = null;
    @Tag(tag=8) public List<IslandPartyGallerySettleInfo> settleInfoList = new ArrayList<>();
    @Tag(tag=6) public List<ExhibitionDisplayInfo> scoreList = new ArrayList<>();
    @Tag(tag=15) public Integer timeRemain = null;
}
