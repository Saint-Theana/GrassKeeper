package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneGalleryHideAndSeekInfo {
    @Tag(tag=13) public List<Integer> visibleUidList = new ArrayList<>();
    @Tag(tag=4) public List<Integer> caughtUidList = new ArrayList<>();
}
