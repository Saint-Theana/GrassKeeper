package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IrodoriMasterGalleryCgEndNotify {
    public enum IrodoriMasterGalleryCgEndNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8260) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public Integer galleryId = null;
    @Tag(tag=1) public Integer levelId = null;
}
