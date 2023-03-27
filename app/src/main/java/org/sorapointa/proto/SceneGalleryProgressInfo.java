package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneGalleryProgressInfo {
    @Tag(tag=8) public List<Integer> progressStageList = new ArrayList<>();
    @Tag(tag=1) public String key = null;
    @Tag(tag=13) public Integer progress = null;
    @Tag(tag=2) public Integer uiForm = null;
}
