package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SceneGalleryInstableSprayBuffInfo.*;
import org.sorapointa.proto.SceneGalleryInstableSprayBuffInfo;

public class InstableSprayInfo {
    @Tag(tag=13) public Integer score = null;
    @Tag(tag=6) public List<SceneGalleryInstableSprayBuffInfo> buffInfoList = new ArrayList<>();
}
