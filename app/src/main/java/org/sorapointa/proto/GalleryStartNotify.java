package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FlowerStartParam.*;
import org.sorapointa.proto.FlowerStartParam;
import org.sorapointa.proto.ElectroherculesStartParam.*;
import org.sorapointa.proto.ElectroherculesStartParam;

public class GalleryStartNotify {
    public enum GalleryStartNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5505) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Integer startTime = null;
    @Tag(tag=14) public Integer ownerUid = null;
    @Tag(tag=4) public Integer playerCount = null;
    @Tag(tag=12) public Integer galleryId = null;
    @Tag(tag=1) public Integer endTime = null;
    @Tag(tag=10) public FlowerStartParam flowerStartParam = null;
    @Tag(tag=7) public ElectroherculesStartParam electroherculesStartParam = null;
}
