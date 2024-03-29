package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SceneGalleryInfo.*;
import org.sorapointa.proto.SceneGalleryInfo;

public class GetAllSceneGalleryInfoRsp {
    public enum GetAllSceneGalleryInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5570) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public List<SceneGalleryInfo> galleryInfoList = new ArrayList<>();
}
