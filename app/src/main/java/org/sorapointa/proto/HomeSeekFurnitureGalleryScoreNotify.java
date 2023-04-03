package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GalleryStopReason.*;
import org.sorapointa.proto.GalleryStopReason;
import org.sorapointa.proto.HomeSeekFurnitureOneRecord.*;
import org.sorapointa.proto.HomeSeekFurnitureOneRecord;

public class HomeSeekFurnitureGalleryScoreNotify {
    public enum HomeSeekFurnitureGalleryScoreNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4612) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer galleryId = null;
    @Tag(tag=9) public Integer reason = null;
    @Tag(tag=7) public HomeSeekFurnitureOneRecord record = null;
}
