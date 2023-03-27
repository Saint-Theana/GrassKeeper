package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SummerTimeV2RestartBoatGalleryRsp {
    public enum SummerTimeV2RestartBoatGalleryRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8972) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer galleryId = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
