package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SceneGalleryInfo.*;
import org.sorapointa.proto.SceneGalleryInfo;

public class GetAllSceneGalleryInfoRsp {
    @Tag(tag=12) public List<SceneGalleryInfo> galleryInfoList = new ArrayList<>();
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
}
