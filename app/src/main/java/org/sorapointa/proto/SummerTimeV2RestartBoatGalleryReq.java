package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SummerTimeV2RestartBoatGalleryReq {
    public enum SummerTimeV2RestartBoatGalleryReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8396) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public Integer galleryId = null;
}
